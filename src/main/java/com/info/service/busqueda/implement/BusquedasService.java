package com.info.service.busqueda.implement;

import com.info.dominio.experimentos.ExFisico;
import com.info.dominio.experimentos.ExQuimico;
import com.info.dominio.investigacion.Investigadores;
import com.info.service.busqueda.Busqueda;
import com.info.service.experimentos.implement.ExperimentosService;
import com.info.service.experimentos.implement.InvestigadorService;

public class BusquedasService implements Busqueda {




        /**
         * meustra el listado de los experimentos fisicos quimicos
         *
         * @param investi recibe objeto de tipo ServisExperimentos
         */

        public void mostrarListadoFisico(ExperimentosService investi) {
            System.out.println("lista de exprimentos fisicos    ");
            mostrarFi(investi);

            System.out.println("lista de exprimentos Quimicos");
            mostrarqi(investi);
        }

        /**
         * busca y mestrra en una  lista de experimentos  fisicos sus nombre  y su resultado
         *
         * @param experimentosService recibe un objeto de servisExperimentos
         */
        private void mostrarFi(ExperimentosService experimentosService) {

            for (ExFisico ex : experimentosService.getExfisicos()) {
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
         * @param experimentosService recibe un objeto de servisExperimentos
         */

        private void mostrarqi(ExperimentosService experimentosService) {

            for (ExQuimico ex : experimentosService.getExquimico()) {
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
         * @param experimentosService recibe un objeto de servisExperimentos
         */
        public void resultadosEx(ExperimentosService experimentosService) {
            int connt1 = 0, cont2 = 0;
            for (ExQuimico ex : experimentosService.getExquimico()) {
                if (ex.getisResultado() ) {
                    connt1 += 1;
                } else cont2 += 1;
            }
            for (ExFisico ex : experimentosService.getExfisicos()) {
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
         * @param experimentosService recibe un objeto de servisExperimentos
         */

        public void mostrarexMayortiempo(ExperimentosService experimentosService) {
            double curi = experimentosService.getExfisicos().get(0).getMinutos();
            double oppenheimer = experimentosService.getExquimico().get(0).getMinutos();
            for (ExQuimico ex : experimentosService.getExquimico()) {
                if (ex.getMinutos() > curi) {
                    curi = ex.getMinutos();
                }
            }
            for (ExFisico ex : experimentosService.getExfisicos()) {
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
         * @param experimentosService recibe un objeto de servisExperimentos
         */

        public void promedioProsentage(ExperimentosService experimentosService) {
            double curi = 0;

            int connt1, connt2 = 0;

            connt1 = experimentosService.getExfisicos().size() + experimentosService.getExquimico().size();

            for (ExQuimico ex : experimentosService.getExquimico()) {

                curi += ex.getMinutos();
                if (ex.getisResultado()) {
                    connt2 += 1;
                }

            }
            for (ExFisico ex : experimentosService.getExfisicos()) {
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
        public  void  investigadorMayorExReali(InvestigadorService servisExperimentos){
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

