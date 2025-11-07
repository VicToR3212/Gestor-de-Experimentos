package com.info;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class crud_cvs {



public  void  GuardarListaInves(Crud crud) throws IOException {
    FileWriter archivo  =null;
    PrintWriter escribir=null;
    try {
        archivo =new FileWriter("C:\\Users\\erics\\IdeaProjects\\PruebasDelDoctoHoo\\listadenombre.txt");
        escribir=new PrintWriter(archivo);
        for (Investigadores ex :crud.getInvestig()){
            escribir.println("nombre: "+ex.getNombre()+" edad: "+ex.getEdad()+" cantidad de experimentos: "+ex.getCantidad_proyecto());
        }

    }catch (Exception e){
        System.out.println("erro al archivo"+e.getMessage());
    }finally {
        archivo.close();
    }


}




}
