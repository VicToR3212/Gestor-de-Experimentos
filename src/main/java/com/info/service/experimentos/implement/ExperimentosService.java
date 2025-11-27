package com.info.service.experimentos.implement;

import com.info.dominio.experimentos.ExFisico;
import com.info.dominio.experimentos.ExQuimico;
import com.info.service.CreaValidaGuarda;

import java.util.ArrayList;
import java.util.Scanner;

    public class ExperimentosService implements CreaValidaGuarda {
        final ArrayList<ExQuimico> exquimico = new ArrayList<>();
        final ArrayList<ExFisico> exfisicos = new ArrayList<>();
        final Scanner colaboradosr = new Scanner(System.in);


        /**
         * agrega experimentos en una listas quimica o fisica
         *
         * @param experimento objeto  de ServisINvestigaro para agregar en la lista de exoerimentos
         */
        @Override
        public void agregar(InvestigadorService experimento) {
            int var;
            boolean vander = true;
            do {
                System.out.println("que experimento desea crear 1 fisico 2 quimico");
                var = colaboradosr.nextInt();
                crearExperimento(var,experimento);
                System.out.println("desea salir de crear experimentos  1 si   0 no");
                var = colaboradosr.nextInt();
                if (var == 1) vander = false;

            } while (vander);

        }

        /**
         * se cargan los datos para crear los expermientos fisicos o quimicos y agrega a los investigadores
         *
         * @param var se recive el valor pra saber si se cre un experimento quimico o fisico
         */

        public void crearExperimento(int var , InvestigadorService investi) {
            System.out.println("agregar nombre del experimento");
            String NOmbreExperimento = colaboradosr.next();
            System.out.println("agregar el tiempo de duracion");
            double minutos = colaboradosr.nextDouble();
            System.out.println("agregar el resultado");
            boolean Resultado = colaboradosr.nextBoolean();
            System.out.println("agrege reactivo");
            String reactivo = colaboradosr.next();
            if (var == 1) {
                ExFisico fis = new ExFisico(
                        NOmbreExperimento,
                        minutos,
                        Resultado,
                        reactivo);
                this.exfisicos.add(fis);
                agregaInves(investi);
            } else if (var == 2) {
                ExQuimico eqi = new ExQuimico(
                        NOmbreExperimento,
                        minutos,
                        Resultado,
                        reactivo);
                System.out.println("agregar colaborador de la  lista de investigadores ");
                insertarInvestigador(investi);
                this.exquimico.add(eqi);
            }

        }

        /**
         *metodo recursivo para agregar investigadores existentes o por crear
         *
         * @param  inves envia un ombjeto ServisINvestigador
         */

        private  void  agregaInves(InvestigadorService inves){
            int aux;
            System.out.println("agregar un colaborador exitente 1/  2 crear un nuevo colaborador");
            aux=colaboradosr.nextInt();
            if (aux==1){
                agreInvestigaENlista(inves);
            } else if (aux==2) {
                nuevoInvesti(inves);

            }
            System.out.println("quiere agregar mas colaboradores 1 si/0 no");
            aux=colaboradosr.nextInt();
            if (aux==1)agregaInves(inves);
        }




        /**
         *metodo recursivo para agregar investigadores exsitente
         *
         * @param  investi envia un ombjeto ServisINvestigador
         */

        private  void agreInvestigaENlista(InvestigadorService investi){
            insertarInvestigador(investi);
            System.out.println("desea asociar otro investigador nuevo 1 si /0 no");
            int x=colaboradosr.nextInt();
            if (x==1){
                agreInvestigaENlista(investi);
            }
        }

        /**
         *metodo recursivo asocia y crea un investigador al experimento
         *
         * @param  investi envia un ombjeto ServisINvestigador
         */
        private  void  nuevoInvesti(InvestigadorService investi){
            investi.colaboradores();
            int i=investi.getInvestig().size()-1;
            investi.sumaraInvesti(investi.getUltimoId(i),investi);
            System.out.println("desea asociar otro investigador nuevo 1 si /0 no");
            int x=colaboradosr.nextInt();
            if (x==1){
                nuevoInvesti(investi);
            }
        }

        /**
         * asocia un investigador al experimento
         * @param  c objeto investigador para evaluar y agregar al investigador al experimento
         */
        public void insertarInvestigador(InvestigadorService c) {

                c.agregar(c);

        }

        public ArrayList<ExQuimico> getExquimico() {
            return exquimico;
        }

        public ArrayList<ExFisico> getExfisicos() {
            return exfisicos;
        }

    }

