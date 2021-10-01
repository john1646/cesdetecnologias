package com.company;

public class Clsjugador {

    private String num_cmiseta;
    private String nombre, posicion,edad,equipo;

    public Clsjugador(String num_cmiseta, String nombre, String posicion, String edad, String equipo) {
        this.num_cmiseta = num_cmiseta;
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.equipo = equipo;
    }

    public Clsjugador() {
    }

    public String getNum_cmiseta() {
        return num_cmiseta;
    }

    public void setNum_cmiseta(String num_cmiseta) {
        this.num_cmiseta = num_cmiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Clsjugador{" +
                "num_cmiseta='" + num_cmiseta + '\'' +
                ", nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                ", edad='" + edad + '\'' +
                ", equipo='" + equipo + '\'' +
                '}';
    }
}
