package com.info;

import java.util.ArrayList;
import java.util.Scanner;

public class Crud {
    private ArrayList<ExQuimico> Exquimico =new ArrayList<ExQuimico>();
    private ArrayList<ExFisico> Exfisicos =new ArrayList<ExFisico>();
    private ArrayList<Investigadores> investig =new ArrayList<Investigadores>();


    private Scanner colaboradosr = new Scanner(System.in);
    int agre;

    public void CrearExperimento( Crud crud){
        boolean vande=true,segundo=true;

        do {
            System.out.println("que experimento desea crear 1 fisico 2 quimico");
            int var = colaboradosr.nextInt();

            if (var == 1) {
                CrearExperimentoFisico();
              do {
                  validacion_deinvestigador(crud);
                  System.out.println("quiere asosciar otro investigador  1 si /  0 no");
                   var = colaboradosr.nextInt();
                   if (var==0)segundo=false;

              }while (segundo!=false);

            }
            else if (var == 2) {
            CrearQuimico();
                do {
                    segundo=true;
                    validacion_deinvestigador(crud);
                    System.out.println("quiere asosciar otro investigador  1 si /  0 no");
                    var = colaboradosr.nextInt();
                    if (var==0)segundo=false;

                }while (segundo!=false);



            }else System.out.println("el numero ingresado fue incorrecto");
            System.out.println("desea salir de crear experimentos  1 si   0 no");
             var = colaboradosr.nextInt();
              if (var==1)vande=false;
        }while (vande==true);


    }


private void validacion_deinvestigador(Crud crud){
        int var;
    boolean vend=true;
    System.out.println("AGREGAR INVESTIGADOR por su numbreo de documento");
    var=colaboradosr.nextInt();
    do {
        vend=añadirInvesti(var,crud);
        if (vend==false){
            System.out.println("investicador no encontrado");
            System.out.println("ingrese el numero correcto");
            var=colaboradosr.nextInt();
            vend=añadirInvesti(var,crud);

        }
    }while (vend!=true);
}


    private  boolean  añadirInvesti(int doc,Crud crud){
        int num =0;
        boolean retu=false;
        for (Investigadores ex : crud.getInvestig()) {

            if (ex.getId()==doc){
              num=1+ex.getCantidad_proyecto();
              ex.setCantidad_proyecto(num);
            retu=true;
            }
        }

        return  retu;
    }

        //rellena una lista de exoerimentos quimicos
    public void CrearQuimico(){
            System.out.println("agregar nombre del experimento");
            String NOmbreExperimento =colaboradosr.next();
            System.out.println("agregar el tiempo de duracion");
            Double minutos = colaboradosr.nextDouble();
            System.out.println("agregar el resultado");
            Boolean Resultado = colaboradosr.nextBoolean();
            System.out.println("agrege reactivo");
            String reactivo = colaboradosr.next();
            ExQuimico eqi =new ExQuimico(

                    NOmbreExperimento,
                    minutos,
                    Resultado,
                    reactivo);



        this.Exquimico.add(eqi);



    }
        //rellena una lista de experimentos fisicos
    public void CrearExperimentoFisico(){
        System.out.println("agregar nombre del experimento");
        String NOmbreExperimento =colaboradosr.next();
        System.out.println("agregar el tiempo de duracion");
        Double minutos = colaboradosr.nextDouble();
        System.out.println("agregar el resultado");
        Boolean Resultado = colaboradosr.nextBoolean();
        System.out.println("agrege reactivo");
        String reactivo = colaboradosr.next();
        ExFisico fis =new ExFisico(
                NOmbreExperimento,
                minutos,
                Resultado,
                reactivo);


        this.Exfisicos.add(fis);
    }



        // rellena una lista de investigadores
    public void   Colaboradores(){
        boolean salir=false;
        String nombre;
        int edad,id;

        do {

            System.out.println("agrege el nombre del investigador");
            nombre= this.colaboradosr.next();

            System.out.println("agrege la edad del investigador");
            edad= this.colaboradosr.nextInt();
            System.out.println("numero de documento");
            id= this.colaboradosr.nextInt();

            Investigadores inves =new Investigadores(edad,nombre,id,0);
            this.investig.add(inves);

            System.out.println("desas agregar otro investigador 1 es si 0 es no ");
            agre= this.colaboradosr.nextInt();



                if (agre==0) {

                    salir = true;
                }
        }while (salir!=true);


    }


    public ArrayList<ExQuimico> getExquimico() {
        return Exquimico;
    }

    public void setExquimico(ArrayList<ExQuimico> exquimico) {
        Exquimico = exquimico;
    }

    public ArrayList<ExFisico> getExfisicos() {
        return Exfisicos;
    }

    public void setExfisicos(ArrayList<ExFisico> exfisicos) {
        Exfisicos = exfisicos;
    }

    public ArrayList<Investigadores> getInvestig() {
        return investig;
    }

    public void setInvestig(ArrayList<Investigadores> investig) {
        this.investig = investig;
    }
}
