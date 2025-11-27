package com.info.dominio.investigacion;

public class Investigador {
    private int edad;
    private  String nombre ;

    /**
     * constructor de la clase
     *
     * @param edad   reciven la edad del investigador
     * @param nombre reciven el nombre del investigador
     *
     */
    public Investigador(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }



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
