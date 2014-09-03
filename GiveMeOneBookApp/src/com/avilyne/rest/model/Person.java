package com.avilyne.rest.model;
 
import javax.xml.bind.annotation.XmlRootElement;
/*
 Anotación @XmlRootElement. 
 Esto le dice a Jersey que este sería el objeto raíz de cualquier representación XML (o JSON) generados de esta clase.
 Esto podría no ser muy útil para esta clase, pero si has tenido una clase de compuestos,
  que sería capaz de controlar lo que el XML o JSON salida se vería como por la adición de anotaciones como ésta.*/

@XmlRootElement
public class Person {
	 
    
    private int id;
    private String firstName;
    private String lastName;
    private String email;
 
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
     
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
     
    public Person() {
        /* 
        id = -1;
        firstName = "";
        lastName = "";
        email = "";
        */
         
    }
 
    public Person(int id, String firstName, String lastName, String email) {
 
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

         
}