package com.mycompany.tarea4calexey;

import java.util.*;

public class ClasePersona {

    private String nombre;
    private int edad;
    private String nif;
    private char sexo;
    private int peso;
    private int altura;

    public ClasePersona() {//конструктор с ничем

    }

    public ClasePersona(String nombre, int edad, char sexo, int altura, int peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.nif = generaNif();
        this.sexo = sexo;
        if (!filtrarSexo(sexo)) {
            this.sexo = asignarSexo(sexo);
        }

    }



    private static String generaNif() {
        Random rand = new Random();

        int numRand = rand.nextInt(99999999 + 1);
        String nif = "" + numRand;
        numRand = Math.round(numRand % 23);
        String letras = "TRWAGMYFPDXBNJZSQVHLCK";
        char letraNif = letras.charAt(numRand);
        nif += letraNif;
        System.out.println(nif);
        return nif;
    }

    private boolean filtrarSexo(char sexo) {
        return (sexo == 'H' || sexo == 'M' || sexo == 'O');
    }

    private char asignarSexo(char sexo) {
        boolean result= filtrarSexo(sexo);
        if (!result){
            sexo='O';
        }
        return sexo;
    }

    
    
    
    
    
    
    
    
    
    
    @Override
    public String toString() {
        return "ClasePersona{" + "nombre=" + nombre + ", edad=" + edad + ", nif=" + nif + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

    
    
}
