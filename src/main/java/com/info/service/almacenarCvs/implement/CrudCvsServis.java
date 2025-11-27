package com.info.service.almacenarCvs.implement;

import com.info.dominio.investigacion.Investigadores;
import com.info.service.almacenarCvs.AlmacenadoCvs;
import com.info.service.experimentos.implement.InvestigadorService;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrudCvsServis implements AlmacenadoCvs {
       private  final String Ubucacion_txt="\\src\\main\\java\\com\\info\\resource\\";
       // CSVWriter csvWriter;
    /**
     * crea un txt  con la informacion de los investigadores
     * @param  investi crea
     */

public  void guardarListaInves(InvestigadorService investi) throws IOException {
    FileWriter archivo = null;
    PrintWriter escribir;
    String ruta=System.getProperty("user.dir").concat(Ubucacion_txt).concat("lista de investigadores");

    try {
        archivo =new FileWriter(ruta);
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
