package com.info;

import java.util.ArrayList;
import java.util.Scanner;

public class Investigador {
    private int edad;
    private  String nombre ;
    //constructor
    public Investigador(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

//metodos get and set

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}
