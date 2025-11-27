package com.info;


import com.info.experimentos.ExFisico;
import com.info.experimentos.ExQuimico;
import com.info.investigacion.Investigadores;
import com.info.servis.ServisExperimentos;
import com.info.servis.ServisInvestigador;

public class Busqueda_analicis {

    /**
     * meustra el listado de los experimentos fisicos quimicos
     *
     * @param investi recibe objeto de tipo ServisExperimentos
     */

    public void mostrarListadoFisico(ServisExperimentos investi) {
        System.out.println("lista de exprimentos fisicos    ");
        mostrarFi(investi);

        System.out.println("lista de exprimentos Quimicos");
        mostrarqi(investi);
    }

    /**
     * busca y mestrra en una  lista de experimentos  fisicos sus nombre  y su resultado
     *
     * @param servisExperimentos recibe un objeto de servisExperimentos
     */
    private void mostrarFi(ServisExperimentos servisExperimentos) {

        for (ExFisico ex : servisExperimentos.getExfisicos()) {
            System.out.println("----------");
            System.out.println("nombre del experimento: " +
                    ex.getNOmbreExperimento() +
                    " resultado :"+
                    ex.getisResultado());

            System.out.println("----------");

        }
    }

    /**
     *  busca y mestrra  en una  lista de experimentos quimicos sus nombre  y su resultado
     *
     * @param servisExperimentos recibe un objeto de servisExperimentos
     */

    private void mostrarqi(ServisExperimentos servisExperimentos) {

        for (ExQuimico ex : servisExperimentos.getExquimico()) {
            System.out.println("----------");
            System.out.println("nombre del experimento: " +
                    ex.getNOmbreExperimento() +
                    " experimento fisico: " + ex.getisResultado());

            System.out.println("----------");

        }


    }

    /**
     * busca y mestra una  lista con los resultados de los experimentos
     *
     * @param servisExperimentos recibe un objeto de servisExperimentos
     */
    public void resultadosEx(ServisExperimentos servisExperimentos) {
        int connt1 = 0, cont2 = 0;
        for (ExQuimico ex : servisExperimentos.getExquimico()) {
            if (ex.getisResultado() ) {
                connt1 += 1;
            } else cont2 += 1;
        }
        for (ExFisico ex : servisExperimentos.getExfisicos()) {
            if (ex.getisResultado() ) {
                connt1 += 1;
            } else cont2 += 1;
        }
        System.out.println("los experimentoos existoso fueron:" + connt1);
        System.out.println("los experimentoos fallidos fueron:" + cont2);


    }

    /**
     * busca en las listas y muestra el experimento quimico/ficisco de mayor duracuion
     *
     * @param servisExperimentos recibe un objeto de servisExperimentos
     */

    public void mostrarexMayortiempo(ServisExperimentos servisExperimentos) {
        double curi = servisExperimentos.getExfisicos().get(0).getMinutos();
        double oppenheimer = servisExperimentos.getExquimico().get(0).getMinutos();
        for (ExQuimico ex : servisExperimentos.getExquimico()) {
            if (ex.getMinutos() > curi) {
                curi = ex.getMinutos();
            }
        }
        for (ExFisico ex : servisExperimentos.getExfisicos()) {
            if (ex.getMinutos() > oppenheimer) {
                oppenheimer = ex.getMinutos();
            }
        }
        if (oppenheimer < curi) {
            System.out.println("el experimento de mayor duracion fue quimico y es de :" + curi);
        } else System.out.println("el experimento de mayor duracion fue fisico y es de  :" + oppenheimer);


    }


    /**
     * genera un reporte con el promedio de duracion,porcentaje de extio global de los experimentos
     *
     * @param servisExperimentos recibe un objeto de servisExperimentos
     */

    public void promedioProsentage(ServisExperimentos servisExperimentos) {
        double curi = 0;

        int connt1, connt2 = 0;

        connt1 = servisExperimentos.getExfisicos().size() + servisExperimentos.getExquimico().size();

        for (ExQuimico ex : servisExperimentos.getExquimico()) {

            curi += ex.getMinutos();
            if (ex.getisResultado()) {
                connt2 += 1;
            }

        }
        for (ExFisico ex : servisExperimentos.getExfisicos()) {
            curi += ex.getMinutos();
            if (ex.getisResultado()) {
                connt2 += 1;

            }
        }
            curi = curi / connt1;
            connt2=(connt2*100)/connt1;
            System.out.println("Promedio de duración de los experimentos :" + curi);
            System.out.println("Porcentaje de éxito global. :" + connt2);



    }

    /**
     * busca y muestra el investigador con la mayor cantidad de contribuciones
     *
     * @param servisExperimentos recibe un objeto de servisExperimentos
     */
    public  void  investigadorMayorExReali(ServisInvestigador servisExperimentos){
            int in=0,edad=0;
            String nombre="";
            for (Investigadores ex : servisExperimentos.getInvestig()) {
            if (in<ex.getCantidad_proyecto()){
                in=ex.getCantidad_proyecto();
                edad=ex.getEdad();
                nombre=ex.getNombre();
            }

        }

        System.out.println("el investigador que realizo mas investigaciones es :"+nombre+" y su edad es: "+edad+ " cantidad de experimentos: "+in);


    }




}

