
package jeancasoto_lab6;


public class Mensaje {
   String emisor;
   String receptor;
   String cuerpo;
   String asunto;

    public Mensaje(String emisor, String receptor, String cuerpo, String asunto) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.cuerpo = cuerpo;
        this.asunto = asunto;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
   
   
   
   
    

}
