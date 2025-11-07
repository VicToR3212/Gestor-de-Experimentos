package com.info;

public class Investigadores extends  Investigador {

        private int id;
        int cantidad_proyecto;
        //construcor
        public Investigadores(int edad,String nombre, int id,int cantidad_proyecto) {
            super(edad,nombre);
            this.id = id;

            this.cantidad_proyecto=cantidad_proyecto;
        }


    //metodos get and set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad_proyecto() {
        return cantidad_proyecto;
    }

    public void setCantidad_proyecto(int cantidad_proyecto) {
        this.cantidad_proyecto = cantidad_proyecto;
    }
}

