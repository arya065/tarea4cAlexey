package com.mycompany.tarea4calexey;

public class ClaseSerie {

    private String nombre;
    private String estudio;
    private int numeroSeries;
    private int anoSerie;
    private int likes;

    public ClaseSerie(String nombre, String estudio, int numeroSeries, int anoSerie, int likes) {
        this.nombre = nombre;
        this.estudio = estudio;
        this.numeroSeries = numeroSeries;
        this.anoSerie = anoSerie;
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "ClaseSerie{" + "nombre=" + nombre + ", estudio=" + estudio + ", numeroSeries=" + numeroSeries + ", anoSerie=" + anoSerie + likes + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public int getNumeroSeries() {
        return numeroSeries;
    }

    public void setNumeroSeries(int numeroSeries) {
        this.numeroSeries = numeroSeries;
    }

    public int getAnoSerie() {
        return anoSerie;
    }

    public void setAnoSerie(int anoSerie) {
        this.anoSerie = anoSerie;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

}