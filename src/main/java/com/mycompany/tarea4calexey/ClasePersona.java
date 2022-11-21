package com.mycompany.tarea4calexey;

import java.util.*;

public class ClasePersona {

    private String nombre;
    private int edad;
    private String nif;
    private char sexo;
    private int peso;
    private int altura;
    private float imc;
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
        this.imc=calcularIMC();
    }

    public static String generaNif() {
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
        boolean result = filtrarSexo(sexo);
        if (!result) {
            sexo = 'O';
        }
        return sexo;
    }

    public boolean mayorEdad() {
        return edad>=18;
    }
    private float calcularIMC(){
        float imc= (float) (peso / Math. pow(altura/100, 2.0));
        return imc;
    }
    
//    private darLikeSerie(/*название сериала*/){
//            //code
//    }

    
    
    
    
    
    
    @Override
    public String toString() {
        return "ClasePersona{" + "nombre=" + nombre + ", edad=" + edad + ", nif=" + nif + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + ", imc=" + imc + '}';
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNif() {
        return nif;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    
    
}