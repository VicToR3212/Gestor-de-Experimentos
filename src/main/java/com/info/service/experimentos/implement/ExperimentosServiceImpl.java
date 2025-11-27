package com.info.service.experimentos.implement;

import com.info.dominio.experimentos.ExperimentosFisico;
import com.info.dominio.experimentos.ExperimentosQuimico;
import com.info.service.experimentos.ICreaValidaGuarda;
import com.info.service.investigador.implement.InvestigadorServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

    public class ExperimentosServiceImpl implements ICreaValidaGuarda {
        final ArrayList<ExperimentosQuimico> experimentosQuimicos = new ArrayList<>();
        final ArrayList<ExperimentosFisico> experimentosFisicos = new ArrayList<>();
        final Scanner scanner = new Scanner(System.in);
        private  int auxiliar=0;

        /**
         * agrega experimentos en una listas quimica o fisica
         *
         * @param experimento objeto  de ServisINvestigaro para agregar en la lista de exoerimentos
         */
        @Override
        public void agregar(InvestigadorServiceImpl experimento) {
            int var;
            boolean vander = true;
            do {
                System.out.println("que experimento desea crear 1 fisico 2 quimico");
                var = scanner.nextInt();
                crearExperimento(var,experimento);
                System.out.println("desea salir de crear experimentos  1 si   0 no");
                var = scanner.nextInt();
                if (var == 1) vander = false;

            } while (vander);

        }

        /**
         * se cargan los datos para crear los expermientos fisicos o quimicos y agrega a los investigadores
         *
         * @param var se recive el valor pra saber si se cre un experimento quimico o fisico
         */
        @Override
        public void crearExperimento(int var , InvestigadorServiceImpl investigador) {
            System.out.println("agregar nombre del experimento");
            String NOmbreExperimento = scanner.next();
            System.out.println("agregar el tiempo de duracion");
            double minutos = scanner.nextDouble();
            System.out.println("agregar el resultado");
            boolean Resultado = scanner.nextBoolean();
            System.out.println("agrege reactivo");
            String reactivo = scanner.next();
            if (var == 1) {
                ExperimentosFisico fis = new ExperimentosFisico(
                        NOmbreExperimento,
                        minutos,
                        Resultado,
                        reactivo);
                this.experimentosFisicos.add(fis);
                agregaInvestigador(investigador);
            } else if (var == 2) {
                ExperimentosQuimico eqi = new ExperimentosQuimico(
                        NOmbreExperimento,
                        minutos,
                        Resultado,
                        reactivo);
                System.out.println("agregar colaborador de la  lista de investigadores ");
                insertarInvestigador(investigador);
                this.experimentosQuimicos.add(eqi);
            }

        }
        /**
         * asocia un investigador al experimento
         * @param  c objeto investigador para evaluar y agregar al investigador al experimento
         */
        @Override
        public void insertarInvestigador(InvestigadorServiceImpl c) {

            c.agregar(c);

        }

        /**
         *agregar investigadores existentes o crea uno nuevo
         *
         * @param  investigador envia un ombjeto ServisINvestigador
         */

        private  void agregaInvestigador(InvestigadorServiceImpl investigador){
            do {
                System.out.println("agregar un colaborador exitente 1/  2 crear un nuevo colaborador");
                this.auxiliar= scanner.nextInt();
                if (this.auxiliar==1){
                    agregarInvestigadorExsitente(investigador);
                } else if (this.auxiliar==2) {
                    nuevoInvestigador(investigador);

                }
                System.out.println("quiere agregar mas colaboradores 1 si/0 no");
                this.auxiliar= scanner.nextInt();
            }while (this.auxiliar==1);

        }



        /**
         *agrega investigadores exsitente de una lista de investigadores
         *
         * @param  investigador envia un ombjeto ServisINvestigador
         */

        private  void agregarInvestigadorExsitente(InvestigadorServiceImpl investigador){


            do {

               insertarInvestigador(investigador);
               System.out.println("desea asociar otro investigador nuevo 1 si /0 no");
               this.auxiliar=scanner.nextInt();
           }while (this.auxiliar==1);

        }

        /**
         * asocia y crea un investigador al experimento creado
         *
         * @param  investigador envia un ombjeto ServisINvestigador
         */
        private  void nuevoInvestigador(InvestigadorServiceImpl investigador){
            do {
                investigador.colaboradores();
                int i=investigador.getInvestigadores().size()-1;
                investigador.sumaraInvestigador(investigador.getUltimoId(i),investigador);
                System.out.println("desea asociar otro investigador nuevo 1 si /0 no");
                 this.auxiliar= scanner.nextInt();
            }while (this.auxiliar==1);

        }



        public ArrayList<ExperimentosQuimico> getExperimentosQuimicos() {
            return experimentosQuimicos;
        }

        public ArrayList<ExperimentosFisico> getExperimentosFisicos() {
            return experimentosFisicos;
        }

    }

