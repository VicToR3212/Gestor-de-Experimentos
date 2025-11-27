package com.info.service.investigador.implement;

import com.info.dominio.investigacion.Investigadores;
import com.info.service.experimentos.ICreaValidaGuarda;
import com.info.service.investigador.IagregaInvestigadores;

import java.util.ArrayList;
import java.util.Scanner;

public class InvestigadorServiceImpl implements IagregaInvestigadores {
    final Scanner scanner = new Scanner(System.in);
    final ArrayList<Investigadores> investigadores = new ArrayList<>();
    /**
     * agrega  investigadores a un experimento si esta en la lista
     * @param investigador  es un objeto ServicioInvestigador para agregar un nuevo investigador
     *
     */
    @Override
    public void agregar(InvestigadorServiceImpl investigador) {
        int var;
        boolean vend;

        do {
            System.out.println("AGREGAR INVESTIGADOR por su numbreo de documento");
            var= scanner.nextInt();
            vend= sumaraInvestigador(var,investigador);
            if (!vend){
                System.out.println("investicador no encontrado");
                System.out.println("ingrese el numero correcto");
                var= scanner.nextInt();
                vend= sumaraInvestigador(var,investigador);

            }
        }while (!vend);
    }

    /**
     * suma investigadores a experimentos y valida si exsite ese investigador con su documento
     *
     * @param doc     es el documento del investigador para buscar en la lista
     * @param investigadorServiceImpl es un objeto ServicioInvestigador para agregar un nuevo investigador
     * @return retu  debuelbe un buleano para saber si  existe en la lista de investigator
     */
    @Override
    public   boolean sumaraInvestigador(int doc, InvestigadorServiceImpl investigadorServiceImpl){
        int numero;
        boolean vandera=false;
        for (Investigadores investigadores : investigadorServiceImpl.getInvestigadores()) {

            if (investigadores.getId()==doc){
                numero=1+investigadores.getCantidadProyecto();
                investigadores.setCantidadProyecto(numero);
                vandera=true;
            }
        }

        return  vandera;
    }

    /**
     * agrega investigador a la lista de investigadores
     */
    @Override
    public void colaboradores(){
        String nombre;
        int edad,id;


            System.out.println("agrege el nombre del investigador");
            nombre= this.scanner.next();

            System.out.println("agrege la edad del investigador");
            edad= this.scanner.nextInt();
            System.out.println("numero de documento");
            id= this.scanner.nextInt();

            Investigadores inves =new Investigadores(edad,nombre,id,0);
            this.investigadores.add(inves);







            }

            public int getUltimoId(int indice){

            return investigadores.get(indice).getId();
            }





    public ArrayList<Investigadores> getInvestigadores() {
        return investigadores;
    }


}
