/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeancasoto_lab6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jeansoto
 */
public class AdminPersona {

    private ArrayList<Persona> listapersonas = new ArrayList();
    private File archivo = null;

    public AdminPersona(String path) {

        archivo = new File(path);
    }

    public ArrayList<Persona> getListapersonas() {
        return listapersonas;
    }

    public void setListapersonas(ArrayList<Persona> listapersonas) {
        this.listapersonas = listapersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "lsitapersonas=" + listapersonas + '}';
    }

    //Mutador extra
    public void setPersona(Persona p) {

        this.listapersonas.add(p);

    }

    //Metodos de administracion
    public void escribirArchivo(String nombre, String apellido, String correo, String pais, Date fecha , String telefono, String contra) throws IOException {

        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Persona t : listapersonas) {
              bw.write(t.getNombre()+";");
               bw.write(t.getApellido()+";");
               bw.write(t.getCorreo()+";");
               bw.write(t.getPais()+";");
               bw.write(t.getFecha().toString());
               bw.write(t.getNumero()+";");
               bw.write(t.getPassword()+";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();

        //Cargar archivo 
    }

    
    public void cargararchivo() {
        if (archivo.exists()) {
            Scanner sc = null;
            listapersonas = new ArrayList();
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listapersonas.add(new Persona(sc.next(), sc.next(), sc.next(),sc.next(), sc.next(),
                           sc.next(), sc.next()));

                }
            } catch (Exception e) {
            }
            sc.close();
        }//FIN if exists

    }
    

}

