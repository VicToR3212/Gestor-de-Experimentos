package com.info.service.busqueda.implement;

import com.info.dominio.experimentos.ExperimentosFisico;
import com.info.dominio.experimentos.ExperimentosQuimico;
import com.info.dominio.investigacion.Investigadores;
import com.info.service.busqueda.IBusqueda;
import com.info.service.experimentos.implement.ExperimentosServiceImpl;
import com.info.service.investigador.implement.InvestigadorServiceImpl;

public class BusquedasServiceImpl implements IBusqueda {




        /**
         * meustra el listado de los experimentos fisicos quimicos
         *
         * @param investigador recibe objeto de tipo ServisExperimentos
         */

        public void mostrarListadoFisico(ExperimentosServiceImpl investigador) {
            System.out.println("lista de exprimentos fisicos    ");
            mostrarExperimentosFisico(investigador);

            System.out.println("lista de exprimentos Quimicos");
            mostraExperimentoQuimico(investigador);
        }

        /**
         * busca y mestrra en una  lista de experimentos  fisicos sus nombre  y su resultado
         *
         * @param experimentosService recibe un objeto de servisExperimentos
         */
        private void mostrarExperimentosFisico(ExperimentosServiceImpl experimentosService) {

            for (ExperimentosFisico experimentosFisico : experimentosService.getExperimentosFisicos()) {
                System.out.println("----------");
                System.out.println("nombre del experimento: " +
                        experimentosFisico.getNombreExperimento() +
                        " resultado :"+
                        experimentosFisico.getisResultado());

                System.out.println("----------");

            }
        }

        /**
         *  busca y mestrra  en una  lista de experimentos quimicos sus nombre  y su resultado
         *
         * @param experimentosService recibe un objeto de servisExperimentos
         */

        private void mostraExperimentoQuimico(ExperimentosServiceImpl experimentosService) {

            for (ExperimentosQuimico experimentosQuimico : experimentosService.getExperimentosQuimicos()) {
                System.out.println("----------");
                System.out.println("nombre del experimento: " +
                        experimentosQuimico.getNombreExperimento() +
                        " experimento fisico: " + experimentosQuimico.getisResultado());

                System.out.println("----------");

            }


        }

        /**
         * busca y mestra una  lista con los resultados de los experimentos
         *
         * @param experimentosService recibe un objeto de servisExperimentos
         */
        public void resultadosExperimento(ExperimentosServiceImpl experimentosService) {
            int contador1 = 0, contador2 = 0;
            for (ExperimentosQuimico ex : experimentosService.getExperimentosQuimicos()) {
                if (ex.getisResultado() ) {
                    contador1 += 1;
                } else contador2 += 1;
            }
            for (ExperimentosFisico experimentosFisico : experimentosService.getExperimentosFisicos()) {
                if (experimentosFisico.getisResultado() ) {
                    contador1 += 1;
                } else contador2 += 1;
            }
            System.out.println("los experimentoos existoso fueron:" + contador1);
            System.out.println("los experimentoos fallidos fueron:" + contador2);


        }

        /**
         * busca en las listas y muestra el experimento quimico/ficisco de mayor duracuion
         *
         * @param experimentosService recibe un objeto de servisExperimentos
         */

        public void mostrarExperimentoMayorTiempo(ExperimentosServiceImpl experimentosService) {
            double minutosExperimentosQuimicos = experimentosService.getExperimentosFisicos().get(0).getMinutos();
            double minutosExperimentosFisicos = experimentosService.getExperimentosQuimicos().get(0).getMinutos();
            for (ExperimentosQuimico experimentosQuimico : experimentosService.getExperimentosQuimicos()) {
                if (experimentosQuimico.getMinutos() > minutosExperimentosQuimicos) {
                    minutosExperimentosQuimicos = experimentosQuimico.getMinutos();
                }
            }
            for (ExperimentosFisico experimentosFisico : experimentosService.getExperimentosFisicos()) {
                if (experimentosFisico.getMinutos() > minutosExperimentosFisicos) {
                    minutosExperimentosFisicos = experimentosFisico.getMinutos();
                }
            }
            if (minutosExperimentosFisicos < minutosExperimentosQuimicos) {
                System.out.println("el experimento de mayor duracion fue quimico y es de :" + minutosExperimentosQuimicos);
            } else System.out.println("el experimento de mayor duracion fue fisico y es de  :" + minutosExperimentosFisicos);


        }


        /**
         * genera un reporte con el promedio de duracion,porcentaje de extio global de los experimentos
         *
         * @param experimentosService recibe un objeto de servisExperimentos
         */

        public void promedioProsentage(ExperimentosServiceImpl experimentosService) {
            double minutos = 0;

            int contador1, contador2 = 0;

            contador1 = experimentosService.getExperimentosFisicos().size() + experimentosService.getExperimentosQuimicos().size();

            for (ExperimentosQuimico experimentosQuimico : experimentosService.getExperimentosQuimicos()) {

                minutos += experimentosQuimico.getMinutos();
                if (experimentosQuimico.getisResultado()) {
                    contador2 += 1;
                }

            }
            for (ExperimentosFisico experimentosFisico : experimentosService.getExperimentosFisicos()) {
                minutos += experimentosFisico.getMinutos();
                if (experimentosFisico.getisResultado()) {
                    contador2 += 1;

                }
            }
                minutos = minutos / contador1;
                contador2=(contador2*100)/contador1;
                System.out.println("Promedio de duración de los experimentos :" + minutos);
                System.out.println("Porcentaje de éxito global. :" + contador2);



        }

        /**
         * busca y muestra el investigador con la mayor cantidad de contribuciones
         *
         * @param servisExperimentos recibe un objeto de servisExperimentos
         */
        public  void investigadorMayorExperimentoReali(InvestigadorServiceImpl servisExperimentos){
                int comparador=0,edad=0;
                String nombre="";
                for (Investigadores investigadores : servisExperimentos.getInvestigadores()) {
                if (comparador<investigadores.getCantidadProyecto()){
                    comparador=investigadores.getCantidadProyecto();
                    edad=investigadores.getEdad();
                    nombre=investigadores.getNombre();
                }

            }

            System.out.println("el investigador que realizo mas investigaciones es :"+nombre+" y su edad es: "+edad+ " cantidad de experimentos: "+comparador);


        }




    }

