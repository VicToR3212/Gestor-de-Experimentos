package com.info.service.experimentos.implement;

import com.info.dominio.investigacion.Investigadores;
import com.info.service.CreaValidaGuarda;

import java.util.ArrayList;
import java.util.Scanner;

public class InvestigadorService implements CreaValidaGuarda {
    final Scanner colaboradosr = new Scanner(System.in);
    final ArrayList<Investigadores> investig = new ArrayList<>();
    /**
     * agrega  investigadores a un experimento si esta en la lista
     * @param servis  es un objeto ServicioInvestigador para agregar un nuevo investigador
     *
     */
    @Override
    public void agregar(InvestigadorService servis) {
        int var;
        boolean vend;

        do {
            System.out.println("AGREGAR INVESTIGADOR por su numbreo de documento");
            var=colaboradosr.nextInt();
            vend=sumaraInvesti(var,servis);
            if (!vend){
                System.out.println("investicador no encontrado");
                System.out.println("ingrese el numero correcto");
                var=colaboradosr.nextInt();
                vend=sumaraInvesti(var,servis);

            }
        }while (!vend);
    }

    /**
     * suma investigadores a experimentos y valida si exsite ese investigador con su documento
     *
     * @param doc     es el documento del investigador para buscar en la lista
     * @param investi es un objeto ServicioInvestigador para agregar un nuevo investigador
     * @return retu  debuelbe un buleano para saber si  existe en la lista de investigator
     */

    public   boolean  sumaraInvesti(int doc, InvestigadorService investi){
        int num;
        boolean retu=false;
        for (Investigadores ex : investi.getInvestig()) {

            if (ex.getId()==doc){
                num=1+ex.getCantidad_proyecto();
                ex.setCantidad_proyecto(num);
                retu=true;
            }
        }

        return  retu;
    }

    /**
     * agrega investigador a la lista de investigadores
     */
    public void colaboradores(){
        String nombre;
        int edad,id;


            System.out.println("agrege el nombre del investigador");
            nombre= this.colaboradosr.next();

            System.out.println("agrege la edad del investigador");
            edad= this.colaboradosr.nextInt();
            System.out.println("numero de documento");
            id= this.colaboradosr.nextInt();

            Investigadores inves =new Investigadores(edad,nombre,id,0);
            this.investig.add(inves);







            }

            public int getUltimoId(int idice){

            return investig.get(idice).getId();
            }






    public ArrayList<Investigadores> getInvestig() {
        return investig;
    }


}
