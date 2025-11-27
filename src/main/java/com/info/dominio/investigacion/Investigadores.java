package com.info.dominio.investigacion;

public class Investigadores {

        final int id;
        private int cantidadProyecto;
        private int edad;
        private  String nombre ;


    /**
     * constructor de la clase
     *
     * @param edad              reciven la edad del investigador
     * @param nombre            reciven el nombre del investigador
     * @param id                recive el numerode documento del investigador
     * @param cantidadProyecto la cantidad de proyecto que tien ese investigador
     *
     */

        public Investigadores(int edad,String nombre, int id,int cantidadProyecto) {
            this.edad=edad;
            this.nombre=nombre;
            this.id = id;

            this.cantidadProyecto=cantidadProyecto;
        }


    //metodos get and set
    public int getId() {
        return id;
    }



    public int getCantidadProyecto() {
        return cantidadProyecto;
    }

    public void setCantidadProyecto(int cantidadProyecto) {
        this.cantidadProyecto = cantidadProyecto;

    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
}

