package com.info;

import java.util.ArrayList;
import java.util.Objects;

public class busqueda_analicis {


    //Mostrar listado de experimentos realizados con su tipo y resultado.1

    public void MostrarListadoFisico(Crud cru) {
        System.out.println("lista de exprimentos fisicos    ");
        mostrarFi(cru);

        System.out.println("lista de exprimentos Quimicos");
        mostrarqi(cru);
    }
        //     metodo muestra lista de experimentos fisicos
    private void mostrarFi(Crud crud) {

        for (ExFisico ex : crud.getExfisicos()) {
            System.out.println("----------");
            System.out.println("nombre del experimento: " +
                    ex.getNOmbreExperimento() +
                    " resultado :"+
                    ex.getisResultado());

            System.out.println("----------");

        }
    }

    //     metodo muestra lista de experimentos quimico

    private void mostrarqi(Crud crud) {

        for (ExQuimico ex : crud.getExquimico()) {
            System.out.println("----------");
            System.out.println("nombre del experimento: " +
                    ex.getNOmbreExperimento() +
                    " experimento fisico: " + ex.getisResultado());

            System.out.println("----------");

        }


    }

    //Mostrar el total de experimentos exitosos y fallidos.1
    public void resultadosEx(Crud crud) {
        int connt1 = 0, cont2 = 0;
        for (ExQuimico ex : crud.getExquimico()) {
            if (ex.getisResultado() == true) {
                connt1 += 1;
            } else cont2 += 1;
        }
        for (ExFisico ex : crud.getExfisicos()) {
            if (ex.getisResultado() == true) {
                connt1 += 1;
            } else cont2 += 1;
        }
        System.out.println("los experimentoos existoso fueron:" + connt1);
        System.out.println("los experimentoos fallidos fueron:" + cont2);


    }


    //Calcular y mostrar el experimento de mayor duración.1
    public void mostrarexMayortiempo(Crud crud) {
        double curi = crud.getExfisicos().get(0).getMinutos();
        double oppenheimer = crud.getExquimico().get(0).getMinutos();
        int connt1 = 0, cont2 = 0;
        for (ExQuimico ex : crud.getExquimico()) {
            if (ex.getMinutos() > curi) {
                curi = ex.getMinutos();
            }
        }
        for (ExFisico ex : crud.getExfisicos()) {
            if (ex.getMinutos() > oppenheimer) {
                oppenheimer = ex.getMinutos();
            }
        }
        if (oppenheimer < curi) {
            System.out.println("el experimento de mayor duracion fue quimico y es de :" + curi);
        } else System.out.println("el experimento de mayor duracion fue fisico y es de  :" + oppenheimer);


    }

    /*    Genera un reporte simple
        Promedio de duración de los experimentos.
        Porcentaje de éxito global.*/
    public void promedio_prosentage(Crud crud) {
        double curi = 0;

        int connt1, connt2 = 0;

        connt1 = crud.getExfisicos().size() + crud.getExquimico().size();

        for (ExQuimico ex : crud.getExquimico()) {

            curi += ex.getMinutos();
            if (ex.getisResultado() == true) {
                connt2 += 1;
            }

        }
        for (ExFisico ex : crud.getExfisicos()) {
            curi += ex.getMinutos();
            if (ex.getisResultado() == true) {
                connt2 += 1;

            }
        }
            curi = curi / connt1;
            connt2=(connt2*100)/connt1;
            System.out.println("Promedio de duración de los experimentos :" + curi);
            System.out.println("Porcentaje de éxito global. :" + connt2);



    }
    //el investigador con mayor investigaciones
    public  void  investigadormayorExReali(Crud crud){
            int in=0,edad=0;
            String nombre="";
            for (Investigadores ex : crud.getInvestig()) {
            if (in<ex.getCantidad_proyecto()){
                in=ex.getCantidad_proyecto();
                edad=ex.getEdad();
                nombre=ex.getNombre();
            }

        }

        System.out.println("el investigador que realizo mas investigaciones es :"+nombre+" y su edad es: "+edad+ " cantidad de experimentos: "+in);


    }




}

