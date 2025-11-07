package com.info;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class menu {


    private Scanner colaboradosr = new Scanner(System.in);
        //menu de opciones

    public void menus() throws IOException {
        Crud crud =new Crud();
        crud_cvs cr= new crud_cvs();
        busqueda_analicis bus = new busqueda_analicis();
        boolean salir = true;
        int men,sli=0;


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
                   crud.Colaboradores();
                    break;

                case 2:
                    crud.CrearExperimento(crud);
                    break;
                case 3:
                    System.out.println("-opcion 3 mostrar listado de resultados                   -");
                    bus.MostrarListadoFisico(crud);


                    break;
                case 4:
                    System.out.println("-opcion 4 mostrar listado experimentos exitosos y fallidos-");
                    bus.resultadosEx(crud);

                    break;
                    case 5:
                        System.out.println("-opcion 5 muestra el experimento de mayor duracion        -");

                        bus.mostrarexMayortiempo(crud);
                    break;
                case 6:
                        bus.promedio_prosentage(crud);
                    break;
                case 7:
                   bus.investigadormayorExReali(crud);


                    break;
                case 8:
                    cr.GuardarListaInves(crud);
                    break;
                default :

            }
            System.out.println("desea salir presione  0 para slir " );
            sli=colaboradosr.nextInt();
            if (sli==0)salir=false;
        } while (salir==true);


    }


}
