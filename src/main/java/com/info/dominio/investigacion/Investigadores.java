package com.info.dominio.investigacion;

public class Investigadores extends Investigador {

        final int id;
        int cantidad_proyecto;

    /**
     * constructor de la clase
     *
     * @param edad              reciven la edad del investigador
     * @param nombre            reciven el nombre del investigador
     * @param id                recive el numerode documento del investigador
     * @param cantidad_proyecto la cantidad de proyecto que tien ese investigador
     *
     */

        public Investigadores(int edad,String nombre, int id,int cantidad_proyecto) {
            super(edad,nombre);
            this.id = id;

            this.cantidad_proyecto=cantidad_proyecto;
        }


    //metodos get and set
    public int getId() {
        return id;
    }



    public int getCantidad_proyecto() {
        return cantidad_proyecto;
    }

    public void setCantidad_proyecto(int cantidad_proyecto) {
        this.cantidad_proyecto = cantidad_proyecto;
    }
}

