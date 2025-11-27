package com.info.servis;

import com.info.experimentos.ExFisico;
import com.info.experimentos.ExQuimico;

import java.util.ArrayList;
import java.util.Scanner;

    public class ServisExperimentos implements insertar {
        final ArrayList<ExQuimico> exquimico = new ArrayList<>();
        final ArrayList<ExFisico> exfisicos = new ArrayList<>();
        final Scanner colaboradosr = new Scanner(System.in);


        /**
         * agrega experimentos en una listas quimica o fisica
         *
         * @param experimento objeto  de ServisINvestigaro para agregar en la lista de exoerimentos
         */
        @Override
        public void agregar(ServisInvestigador experimento) {
            int selecion;
            boolean vander = true;
            do {
                System.out.println("que experimento desea crear 1 fisico 2 quimico");
                selecion = colaboradosr.nextInt();
                crearExperimento(selecion);
                insertarInvestigador(experimento);

                System.out.println("desea salir de crear experimentos  1 si   0 no");
                selecion = colaboradosr.nextInt();
                if (selecion == 1) vander = false;

            } while (vander);

        }

        /**
         * se cargan los datos para crear los expermientos fisicos o quimicos
         *
         * @param var se recive el valor pra saber si se cre un experimento quimico o fisico
         */

        public void crearExperimento(int var) {
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
            } else if (var == 2) {
                ExQuimico eqi = new ExQuimico(
                        NOmbreExperimento,
                        minutos,
                        Resultado,
                        reactivo);
                this.exquimico.add(eqi);
            }

        }


        /**
         * asocia un investigador al experimento
         *
         * @param investi objeto investigador para evaluar y agregar al investigador al experimento
         */
        public void insertarInvestigador(ServisInvestigador investi) {
            int var;
            boolean vander = true;
            do {

                investi.agregar(investi);
                System.out.println("quiere asosciar otro investigador  1 si /  0 no");
                var = colaboradosr.nextInt();
                if (var == 0) vander = false;

            } while (vander);
        }

        public ArrayList<ExQuimico> getExquimico() {
            return exquimico;
        }


        public ArrayList<ExFisico> getExfisicos() {
            return exfisicos;
        }

    }

