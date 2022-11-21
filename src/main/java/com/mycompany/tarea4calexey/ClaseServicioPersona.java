package com.mycompany.tarea4calexey;

import java.util.*;

public class ClaseServicioPersona {

    public String[] askInfo() {
        Scanner in = new Scanner(System.in);
        String[] infoArray = new String[5];

        System.out.println("Entoduce nombre de persona");
        String nombrePersona = in.nextLine();
        infoArray[0] = nombrePersona;
        System.out.println("Entoduce edad de persona");
        String edad = "" + in.nextInt();
        infoArray[1] = edad;
        System.out.println("Entoduce sexo de persona");
        in.nextLine();
        String sexoLine = in.nextLine();
        infoArray[2] = sexoLine;
        System.out.println("Entoduce altura de persona en cm");
        String altura = "" + in.next();
        infoArray[3] = altura;
        System.out.println("Entoduce peso de persona en kg");
        String peso = "" + in.nextInt();
        infoArray[4] = peso;
        return infoArray;
    }

    public static ClasePersona makePerson(String[] infoArray) {

        String nombrePersona = infoArray[0];
        int edad = Integer.parseInt(infoArray[1]);
        char sexo = (infoArray[2]).charAt(0);
        int altura = Integer.parseInt(infoArray[3]);
        int peso = Integer.parseInt(infoArray[4]);
        
        ClasePersona persona2 = new ClasePersona(nombrePersona, edad, sexo, altura, peso);
//        String result= persona2.toString();
        return persona2;
    }

}