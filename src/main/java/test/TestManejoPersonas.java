package test;

import datos.*;
import domain.Persona;
import java.util.*;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        
        //Insertando nuevo objeto tipo persona
//        Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@mail.com", "7766554433");
//        personaDao.insertar(personaNueva);

        //Modificar un objeto de persona existenteRegistro
//        Persona personaModificar = new Persona(4, "Juan Carlos", "Esparza", "jcesparza@mail.com", "7766554433");
//        personaDao.actualizar(personaModificar);

        //Eliminar un objeto de persona
        Persona personaEliminar = new Persona(4);
        personaDao.eliminar(personaEliminar);
        
        //Listado de Persona
        List<Persona> personas = personaDao.seleccionar();
        
        //Para imprimir metodos con forEach y con Lamda
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
//        personas.forEach(persona -> {
//            System.out.println("persona = " + persona);
//        });

    }
}
