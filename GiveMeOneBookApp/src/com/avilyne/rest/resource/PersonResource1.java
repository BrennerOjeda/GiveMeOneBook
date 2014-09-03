package com.avilyne.rest.resource;

import java.util.Collection;
import java.util.LinkedHashMap;
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

import com.avilyne.rest.model.Person;
// se producira y consumira con json
@Path("/directory")
//@Consumes("application/json")
//@Produces("aplication/json")

public class PersonResource1 {
	private final static String ID_PERSON  = "id";
	private final static String FIRST_NAME = "firstName";
    private final static String LAST_NAME = "lastName";
    private final static String EMAIL = "email";

	//loguer para hacer el llogin
	private static final Logger log = Logger.getLogger(PersonResource1.class.getName());
	
	//arreglo de libros
	private static Map<Integer, Person> people = new LinkedHashMap<Integer, Person>();
	static{
		Person[] personarr = new Person[]{
				new Person(1, "Sample", "Person", "sample_person@jerseyrest.com"),
			    new Person(2, "greis", "oropeza", "greis@jerseyrest.com")
		};
		for(Person person: personarr){
			people.put((int)person.getId(), person);
		}
	}
	
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
	@Path("/people")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Person> getpeople(){
		Collection<Person> result = people.values();
		log.info("getpeople: %s"+result);
		return result;
	}
	
	//cuando se quiera buscar por un isbn en prticular se puede buscar por este 
	@GET
	@Path("/person/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Person getPerson(@PathParam("id") int id){
		Person person = people.get(id);
		log.info("getPerson: "+ person.getId());
		return person;
	}
	
	// modifcar crear o eliminar
	@PUT
	@Path("person/{id}")
	public Person addPerson(@PathParam("id") int id, @QueryParam("firstName") String firstName,@QueryParam("lastName") String lastName,@QueryParam("email") String email){
		Person person = new Person(id, firstName, lastName, email);
		log.info("addPerson: "+ person);
		people.put(id, person);
		return person;
	}
	
	//crear
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
	//@Path("/person/{id}")
	public Person updatePerson(MultivaluedMap<String, String> personParams) {
		
		String id = personParams.getFirst(ID_PERSON);
		String firstName = personParams.getFirst(FIRST_NAME);
        String lastName = personParams.getFirst(LAST_NAME);
        String email = personParams.getFirst(EMAIL);

		Person person = people.get(Integer.parseInt(id));
		if(person != null){
			//person.setId(id);
			person.setFirstName(firstName);
			person.setLastName(lastName);
			person.setEmail(email);
		}
		log.info("updatePerson :"+ ("person info: " + person.getFirstName() + " " + person.getLastName() + " " + person.getEmail()));
		return person;
	}
	
	@DELETE
	@Path("/person/{id}")
	public Person removePerson(@PathParam("id") int id){
		Person person = people.remove(id);
		log.info("removePerson: "+ person);
		return person;
	}
	

}
