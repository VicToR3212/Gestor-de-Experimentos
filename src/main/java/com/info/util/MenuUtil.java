package com.info.util;

import com.info.service.almacenarCvs.implement.CrudCvsServis;
import com.info.service.experimentos.implement.ExperimentosService;
import com.info.service.experimentos.implement.InvestigadorService;
import com.info.service.busqueda.implement.BusquedasService;

import java.io.IOException;
import java.util.Scanner;

public class MenuUtil {


    final Scanner colaboradosr = new Scanner(System.in);

    /**
     * es un menu de opciones  para el usurio
     */
    public void menus() throws IOException {
        ExperimentosService experimentosService =new ExperimentosService();
        InvestigadorService servi =new InvestigadorService();
        CrudCvsServis cr= new CrudCvsServis();
        BusquedasService bus = new BusquedasService();
        boolean salir = true;
        int men,sli;

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

            men=colaboradosr.nextInt();
            switch (men) {
                case 1:
                   servi.colaboradores();


                    break;

                case 2:
                    experimentosService.agregar(servi);
                    break;
                case 3:
                    System.out.println("-opcion 3 mostrar listado de resultados                   -");
                    bus.mostrarListadoFisico(experimentosService);


                    break;
                case 4:
                    System.out.println("-opcion 4 mostrar listado experimentos exitosos y fallidos-");
                    bus.resultadosEx(experimentosService);

                    break;
                    case 5:
                        System.out.println("-opcion 5 muestra el experimento de mayor duracion        -");

                        bus.mostrarexMayortiempo(experimentosService);
                    break;
                case 6:
                        bus.promedioProsentage(experimentosService);
                    break;
                case 7:
                   bus.investigadorMayorExReali(servi);


                    break;
                case 8:
                    cr.guardarListaInves(servi);
                    break;
                default :

            }
            System.out.println("desea finalizar el programa presione  0 para slir " );
            sli=colaboradosr.nextInt();
            if (sli==0)salir=false;
        } while (salir);


    }


}
