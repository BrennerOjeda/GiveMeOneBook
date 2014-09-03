package com.avilyne.rest.resource;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.avilyne.rest.model.Books;
import com.avilyne.rest.model.Person;
import com.concytec.bibliotecaapp.domain.Recurso;
import com.concytec.bibliotecaapp.service.SimpleRecursoManager;
// se producira y consumira con json


@Path("/library")
public class BooksResources {

//    private final static String  ID_REC = "ideRec";
//	private final static String  TIT_REC = "titRec";
//	private final static String  EDIT_REC= "editRec";
//	private final static String  ANIO_EDICREC= "anioEdicRec";
//	private final static String  EST_REC= "estRec";
	
	//loguer para hacer el llogin
	private static final Logger log = Logger.getLogger(PersonResource1.class.getName());
	
	//arreglo de libros
	private static Map<Integer, Books> libros = new LinkedHashMap<Integer, Books>();
	static{

		
		SimpleRecursoManager recurso = new SimpleRecursoManager();
		List<Recurso> listaRecursos  = recurso.getListRecurso();
//		System.out.println(">>>>>>>>>>>>>>>><<<<"+listaRecursos.size()); 
		Recurso[] arregloRecursos =  listaRecursos.toArray(new Recurso[listaRecursos.size()]);
		Books []  arregloBooks = new Books[listaRecursos.size()];
		
		for(int i = 0; i < listaRecursos.size(); i++){
			Books books = new Books();
			books.setAnioEdicRec(arregloRecursos[i].getAnioEdicRec());
			books.setEditRec(arregloRecursos[i].getEditRec());
			books.setEstRec(arregloRecursos[i].getEstRec());
			books.setTitRec(arregloRecursos[i].getTitRec());
			books.setIdeRec(arregloRecursos[i].getIdeRec());
			arregloBooks[i] = books;
//			System.out.println(arregloBooks[i].getTitRec() + " "+arregloBooks[i].getIdeRec());
		}
		
		for(Books book: arregloBooks){
			libros.put((int)book.getIdeRec(), book);
		}

		
	}
	
//	public static void main(String [] args){
//		SimpleRecursoManager recurso = new SimpleRecursoManager();
//		List<Recurso> listaRecursos  = recurso.getListRecurso();
//		Recurso[] arregloRecursos =  listaRecursos.toArray(new Recurso[listaRecursos.size()]);
//		for(Recurso a: arregloRecursos){
//			System.out.println(a.getTitRec());
//		}
//	}
	
    // The @Context annotation allows us to have certain contextual objects
    // injected into this class.
    // UriInfo object allows us to get URI information (no kidding).
    @Context
    UriInfo uriInfo;
 
    // Another "injected" object. This allows us to use the information that's
    // part of any incoming request.
    // We could, for example, get header information, or the requestor's address.
    @Context
    Request request;
     
    // Basic "is the service running" test
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String respondAsReady() {
        return "Demo service is ready!";
    }
	
    
	// para hacer vonsulta de la coleccion de los libro se devuelve esta
	@GET
	@Path("/books")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Books> getbooks(){
		Collection<Books> result = libros.values();
		log.info("getpeople: %s"+result);
		return result;
	}

	
	//cuando se quiera buscar por un isbn en prticular se puede buscar por este 
	@GET
	@Path("/book/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Books getBook(@PathParam("id") int id){
		Books libro = libros.get(id);
		log.info("getPerson: "+ libro.getIdeRec());
		return libro;
	}
	
	// modifcar crear o eliminar
//	@PUT
//	@Path("person/{id}")
//	public Person addPerson(@PathParam("id") int id, @QueryParam("firstName") String firstName,@QueryParam("lastName") String lastName,@QueryParam("email") String email){
//		Person person = new Person(id, firstName, lastName, email);
//		log.info("addPerson: "+ person);
//		people.put(id, person);
//		return person;
//	}
//	
//	//crear
//	@POST
//	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//    @Produces(MediaType.APPLICATION_JSON)
//	//@Path("/person/{id}")
//	public Person updatePerson(MultivaluedMap<String, String> personParams) {
//		
//		String id = personParams.getFirst(ID_PERSON);
//		String firstName = personParams.getFirst(FIRST_NAME);
//        String lastName = personParams.getFirst(LAST_NAME);
//        String email = personParams.getFirst(EMAIL);
//
//		Person person = people.get(Integer.parseInt(id));
//		if(person != null){
//			//person.setId(id);
//			person.setFirstName(firstName);
//			person.setLastName(lastName);
//			person.setEmail(email);
//		}
//		log.info("updatePerson :"+ ("person info: " + person.getFirstName() + " " + person.getLastName() + " " + person.getEmail()));
//		return person;
//	}
//	
//	@DELETE
//	@Path("/person/{id}")
//	public Person removePerson(@PathParam("id") int id){
//		Person person = people.remove(id);
//		log.info("removePerson: "+ person);
//		return person;
//	}
	
}



