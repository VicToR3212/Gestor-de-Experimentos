package com.info;

import com.info.investigacion.Investigadores;
import com.info.servis.ServisInvestigador;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Crud_cvs {


    /**
     * crea un txt  con la informacion de los investigadores
     * @param  investi crea
     */

public  void  guardarListaInves(ServisInvestigador investi) throws IOException {
    FileWriter archivo  =null;
    PrintWriter escribir;
    try {
        archivo =new FileWriter("C:\\Users\\erics\\IdeaProjects\\PruebasDelDoctoHoo\\listadenombre.txt");
        escribir=new PrintWriter(archivo);
        for (Investigadores ex :investi.getInvestig()){
            escribir.println("nombre: "+ex.getNombre()+" edad: "+ex.getEdad()+" cantidad de experimentos: "+ex.getCantidad_proyecto());
        }

    }catch (Exception e){
        System.out.println("erro al archivo"+e.getMessage());
    }finally {
        archivo.close();
    }


}




}
