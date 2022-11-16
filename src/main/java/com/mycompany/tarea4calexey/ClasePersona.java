package com.mycompany.tarea4calexey;

public class ClasePersona {
    private String nombre;
    private int edad;
    private int nif;
    private String sexo;
    private int peso;
    private int altura;
    
    public ClasePersona(){//конструктор с ничем
        
    }
    public ClasePersona(String nombre,int edad, String sexo, int altura,int peso){
        this.nombre= nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.altura=altura;
        this.peso=peso;
        this.nif=nif();
    }
    private String nif(){
        String nif="";
        return nif;
    }
}

