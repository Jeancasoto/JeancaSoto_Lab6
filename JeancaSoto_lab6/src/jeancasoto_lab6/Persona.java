
package jeancasoto_lab6;

import java.util.ArrayList;
import java.util.Date;


public class Persona {
    String nombre;
    String apellido;
    String correo;
    Date fecha;
    String pais;
    String numero;
    String password;
    ArrayList <Mensaje> noleido= new ArrayList();
    ArrayList <Mensaje> leido= new ArrayList();
    ArrayList <Mensaje> nodeseado= new ArrayList();
    ArrayList <Mensaje> spam= new ArrayList();
    ArrayList <Mensaje> borrador= new ArrayList();
    ArrayList <Mensaje> enviados= new ArrayList();
    ArrayList <Mensaje> eliminados= new ArrayList();
    ArrayList <Mensaje> importantes= new ArrayList();
    

    public Persona() {
    }

    public Persona(String nombre, String apellido, String correo, Date fecha, String pais, String numero, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fecha = fecha;
        this.pais = pais;
        this.numero = numero;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Mensaje> getNoleido() {
        return noleido;
    }

    public void setNoleido(ArrayList<Mensaje> noleido) {
        this.noleido = noleido;
    }

    public ArrayList<Mensaje> getLeido() {
        return leido;
    }

    public void setLeido(ArrayList<Mensaje> leido) {
        this.leido = leido;
    }

    public ArrayList<Mensaje> getNodeseado() {
        return nodeseado;
    }

    public void setNodeseado(ArrayList<Mensaje> nodeseado) {
        this.nodeseado = nodeseado;
    }

    public ArrayList<Mensaje> getSpam() {
        return spam;
    }

    public void setSpam(ArrayList<Mensaje> spam) {
        this.spam = spam;
    }

    public ArrayList<Mensaje> getBorrador() {
        return borrador;
    }

    public void setBorrador(ArrayList<Mensaje> borrador) {
        this.borrador = borrador;
    }

    public ArrayList<Mensaje> getEnviados() {
        return enviados;
    }

    public void setEnviados(ArrayList<Mensaje> enviados) {
        this.enviados = enviados;
    }

    public ArrayList<Mensaje> getEliminados() {
        return eliminados;
    }

    public void setEliminados(ArrayList<Mensaje> eliminados) {
        this.eliminados = eliminados;
    }

    public ArrayList<Mensaje> getImportantes() {
        return importantes;
    }

    public void setImportantes(ArrayList<Mensaje> importantes) {
        this.importantes = importantes;
    }
    
    
    
}
