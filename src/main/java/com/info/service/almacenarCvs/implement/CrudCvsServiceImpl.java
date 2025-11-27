package com.info.service.almacenarCvs.implement;

import com.info.dominio.investigacion.Investigadores;
import com.info.service.almacenarCvs.ICrudCvsService;
import com.info.service.investigador.implement.InvestigadorServiceImpl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrudCvsServiceImpl implements ICrudCvsService {
       private  final String ubucacionTxt ="\\src\\main\\java\\com\\info\\resource\\";
       // CSVWriter csvWriter;
    /**
     * crea un txt  con la informacion de los investigadores
     * @param  investigador crea
     */

public  void guardarListaInvestigadores(InvestigadorServiceImpl investigador) throws IOException {
    FileWriter archivo = null;
    PrintWriter escribir;
    String ruta=System.getProperty("user.dir").concat(ubucacionTxt).concat("lista de investigadores");

    try {
        archivo =new FileWriter(ruta);
        escribir=new PrintWriter(archivo);
        for (Investigadores investigadores : investigador.getInvestigadores()){
            escribir.println("nombre: "+investigadores.getNombre()+" edad: "+investigadores.getEdad()+" cantidad de experimentos: "+investigadores.getCantidadProyecto());
        }

    }catch (Exception e){
        System.out.println("erro al archivo"+e.getMessage());
    }finally {
        archivo.close();
    }


}




}
