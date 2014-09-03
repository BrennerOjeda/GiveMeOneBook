package com.avilyne.rest.resource;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.avilyne.rest.model.Books;
import com.avilyne.rest.model.User;
import com.concytec.bibliotecaapp.domain.Recurso;
import com.concytec.bibliotecaapp.domain.TipoUsuario;
import com.concytec.bibliotecaapp.domain.Usuario;
import com.concytec.bibliotecaapp.service.SimpleAutorManager;
import com.concytec.bibliotecaapp.service.SimpleRecursoManager;
import com.concytec.bibliotecaapp.service.SimpleUsuarioManager;

@Path("/group")
public class UserResources {

//	private final static String ID_PERSON  = "id";
//	private final static String FIRST_NAME = "firstName";
//    private final static String LAST_NAME = "lastName";
//    private final static String EMAIL = "email";
    
    private final static String DOC_IDEUSU = "docIdeUsu";
	private final static String NOM_USU = "nomUsu";
	private final static String APE_USU = "apeUsu";
	private final static String EMAUSU =  "emaUsu";

	//loguer para hacer el llogin
	private static final Logger log = Logger.getLogger(PersonResource1.class.getName());
	
	//arreglo de libros
	private static Map<String, User> usuarios = new LinkedHashMap<String, User>();
	static{

		
		SimpleUsuarioManager usuario = new SimpleUsuarioManager();
		List<Usuario> listaUsuarios  = usuario.getListUsuarios();
		Usuario[] arregloUsuarios =  listaUsuarios.toArray(new Usuario[listaUsuarios.size()]);
		User []  arregloUsers = new User[listaUsuarios.size()];
		
		for(int i = 0; i < listaUsuarios.size(); i++){
			User user = new User();
			user.setApeUsu(arregloUsuarios[i].getApeUsu());
			user.setNomUsu(arregloUsuarios[i].getNomUsu());
			user.setEmaUsu(arregloUsuarios[i].getEmaUsu());
			user.setDocIdeUsu(arregloUsuarios[i].getDocIdeUsu());
			arregloUsers[i] = user;
//			System.out.println(arregloUsers[i].getDocIdeUsu() + " "+arregloUsers[i].getNomUsu());
		}
		
		for(User user: arregloUsers){
			System.out.println(user.getDocIdeUsu() + " "+user.getNomUsu());
			usuarios.put(user.getDocIdeUsu(), user);
		}
		
//		SimpleUsuarioManager usuario = new SimpleUsuarioManager();
//		List<Usuario> listaUsuarios  = usuario.getListUsuarios();
//		Usuario[] arregloUsuarios =  listaUsuarios.toArray(new Usuario[listaUsuarios.size()]);
//		User []  arregloUsers = new User[listaUsuarios.size()];
//		for(int i = 0; i < listaUsuarios.size(); i++){
//			System.out.println(arregloUsuarios[i].getNomUsu() + " "+arregloUsuarios[i].getDocIdeUsu());
//		}
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
  	@Path("/as")
  	@Produces(MediaType.APPLICATION_JSON)
  	public Collection<User> getUsers(){
  		Collection<User> result = usuarios.values();
  		log.info("getpeople: %s"+result);
  		return result;
  	}

  	
  	//cuando se quiera buscar por un isbn en prticular se puede buscar por este 
  	@GET
  	@Path("/a/{id}")
  	@Produces(MediaType.APPLICATION_JSON)
  	public User getBook(@PathParam("id") String id){
  		User usuario = usuarios.get(id);
  		log.info("getPerson: "+ usuario.getDocIdeUsu());
  		return usuario;
  	}
  	
//	//crear
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
	//@Path("/next/{id}")
	public User updatePerson(MultivaluedMap<String, String> userParams) {
		
		String id = userParams.getFirst(DOC_IDEUSU);
		String firstName = userParams.getFirst(NOM_USU);
        String lastName = userParams.getFirst(APE_USU);
        String email = userParams.getFirst(EMAUSU);

		User user = usuarios.get(id);
		if(user != null){
			//person.setId(id);
			user.setNomUsu(firstName);
			user.setApeUsu(lastName);
			user.setEmaUsu(email);
			
		}
//		log.info("updatePerson :"+ ("person info: " + person.getFirstName() + " " + person.getLastName() + " " + person.getEmail()));
		return user;
	}
	
}
