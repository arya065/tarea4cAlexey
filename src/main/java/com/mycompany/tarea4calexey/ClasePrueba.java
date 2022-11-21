package com.mycompany.tarea4calexey;

import java.util.*;

public class ClasePrueba {

    public static void main(String[] args) {

//        ClasePersona persona2= new ClasePersona();
        ClaseServicioPersona persona2 = new ClaseServicioPersona();
        String[] infoArray = persona2.askInfo();
//        String result = persona2.makePerson(infoArray);

        ClasePersona persona3= ClaseServicioPersona.makePerson(infoArray);
        
        ClasePersona persona1 = new ClasePersona();
        persona1.setNombre("Juan");
        persona1.setEdad(16);
        persona1.setAltura(200);
        persona1.setPeso(100);
        persona1.setSexo('H');

        System.out.println("Persona 1   " + persona1);
        System.out.println("Persona 2   " +persona3);
    }

}