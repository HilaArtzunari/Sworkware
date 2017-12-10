package beans;

/**
 *
 * @author I.S.C. Roberto Mendoza Saavedra(isc.robertomendoza@gmail.com) - ESCOM
 */
public class ContactoPublicacion {
    private String nombreContacto;
    private String medioContacto;
    private String mensaje;
    private String fechaContacto;
    private int idPublicacion;
    
    public ContactoPublicacion(){}
    
    public ContactoPublicacion(String nombreContacto, String medioContacto, String mensaje, String fechaContacto, int idPublicacion){
        this.nombreContacto = nombreContacto;
        this.medioContacto = medioContacto;
        this.mensaje = mensaje;
        this.fechaContacto = fechaContacto;
        this.idPublicacion = idPublicacion;        
    }

    /**
     * @return the nombreContacto
     */
    public String getNombreContacto() {
        return nombreContacto;
    }

    /**
     * @param nombreContacto the nombreContacto to set
     */
    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    /**
     * @return the medioContacto
     */
    public String getMedioContacto() {
        return medioContacto;
    }

    /**
     * @param medioContacto the medioContacto to set
     */
    public void setMedioContacto(String medioContacto) {
        this.medioContacto = medioContacto;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the fechaContacto
     */
    public String getFechaContacto() {
        return fechaContacto;
    }

    /**
     * @param fechaContacto the fechaContacto to set
     */
    public void setFechaContacto(String fechaContacto) {
        this.fechaContacto = fechaContacto;
    }

    /**
     * @return the idPublicacion
     */
    public int getIdPublicacion() {
        return idPublicacion;
    }

    /**
     * @param idPublicacion the idPublicacion to set
     */
    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
    }
    
    
    
}
