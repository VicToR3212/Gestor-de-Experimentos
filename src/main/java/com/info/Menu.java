package com.info;

import com.info.servis.ServisExperimentos;
import com.info.servis.ServisInvestigador;

import java.io.IOException;
import java.util.Scanner;

public class Menu {


    final Scanner colaboradosr = new Scanner(System.in);

    /**
     * es un menu de opciones  para el usurio
     */
    public void menus() throws IOException {
        ServisExperimentos servisExperimentos =new ServisExperimentos();
        ServisInvestigador servi =new ServisInvestigador();
        Crud_cvs cr= new Crud_cvs();
        Busqueda_analicis bus = new Busqueda_analicis();
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
                   servi.Colaboradores();


                    break;

                case 2:
                    servisExperimentos.agregar(servi);
                    break;
                case 3:
                    System.out.println("-opcion 3 mostrar listado de resultados                   -");
                    bus.mostrarListadoFisico(servisExperimentos);


                    break;
                case 4:
                    System.out.println("-opcion 4 mostrar listado experimentos exitosos y fallidos-");
                    bus.resultadosEx(servisExperimentos);

                    break;
                    case 5:
                        System.out.println("-opcion 5 muestra el experimento de mayor duracion        -");

                        bus.mostrarexMayortiempo(servisExperimentos);
                    break;
                case 6:
                        bus.promedioProsentage(servisExperimentos);
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
