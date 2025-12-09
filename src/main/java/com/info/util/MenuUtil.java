package com.info.util;

import com.info.service.almacenarCvs.implement.CrudCvsServiceImpl;
import com.info.service.experimentos.implement.ExperimentosServiceImpl;
import com.info.service.investigador.implement.InvestigadorServiceImpl;
import com.info.service.busqueda.implement.BusquedasServiceImpl;

import java.io.IOException;
import java.util.Scanner;

public class MenuUtil {


    final Scanner colaboradosr = new Scanner(System.in);

    /**
     * es un menu de opciones  para el usurio
     */
    public void menus() throws IOException {
        ExperimentosServiceImpl experimentosService =new ExperimentosServiceImpl();
        InvestigadorServiceImpl investigadorServiceImpl =new InvestigadorServiceImpl();
        CrudCvsServiceImpl crudCvsServis= new CrudCvsServiceImpl();
        BusquedasServiceImpl busquedasService = new BusquedasServiceImpl();
        boolean salir = true;
        int menu,sli;

        do {
            System.out.println("elige la accione a realizar digitando los numeros siquientes ");
            System.out.println("-----------------------------------------------------------");
            System.out.println("-opcion 1 crear investigacion                             -");
            System.out.println("-opcion 2 reguistrar experimentos                         -");
            System.out.println("-opcion 3 mostrar listado de resultados                   -");
            System.out.println("-opcion 4 mostrar listado experimentos exitosos y fallidos-");
            System.out.println("-opcion 5 muestra el experimento de mayor duracion        -");
            System.out.println("-opcion 6 reporte de los resultados                       -");
            System.out.println("-opcion 7 investigador con mayor experimentos echos       -");
            System.out.println("-opcion 8 exportar a cvc                                  -");
            System.out.println("-----------------------------------------------------------");

            menu=colaboradosr.nextInt();
            switch (menu) {
                case 1:
                   investigadorServiceImpl.colaboradores();


                    break;

                case 2:
                    experimentosService.agregar(investigadorServiceImpl);
                    break;
                case 3:
                    System.out.println("-opcion 3 mostrar listado de resultados                   -");
                    busquedasService.mostrarListadoFisico(experimentosService);


                    break;
                case 4:
                    System.out.println("-opcion 4 mostrar listado experimentos exitosos y fallidos-");
                    busquedasService.resultadosExperimento(experimentosService);

                    break;
                    case 5:
                        System.out.println("-opcion 5 muestra el experimento de mayor duracion        -");

                        busquedasService.mostrarExperimentoMayorTiempo(experimentosService);
                    break;
                case 6:
                        busquedasService.promedioProsentage(experimentosService);
                    break;
                case 7:
                   busquedasService.investigadorMayorExperimentoReali(investigadorServiceImpl);


                    break;
                case 8:
                    crudCvsServis.guardarListaInvestigadores(investigadorServiceImpl);
                    break;
                default :

            }
            System.out.println("desea finalizar el programa presione  0 para slir " );
            sli=colaboradosr.nextInt();
            if (sli==0)salir=false;
        } while (salir);


    }


}
