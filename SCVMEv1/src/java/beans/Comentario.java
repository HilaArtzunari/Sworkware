package beans;

/**
 *
 * @author I.S.C. Roberto Mendoza Saavedra(isc.robertomendoza@gmail.com) - ESCOM
 */
public class Comentario {
    private String fechaAlta;
    private String fechaEdicion;
    private String fechaEliminacion;
    private String comentario;
    private int idPublicacion;
    
    public Comentario(){}
    
    public Comentario(String fechaAlta, String fechaEdicion, String comentario, int idPublicacion){
        this.fechaAlta = fechaAlta;
        this.fechaEdicion = fechaEdicion;
        this.comentario = comentario;
        this.idPublicacion = idPublicacion;
    }
    
    public Comentario(String fechaEdicion, String comentario, int idPublicacion){
        this.fechaEdicion = fechaEdicion;
        this.comentario = comentario;
        this.idPublicacion = idPublicacion;
    }
    
    public Comentario(String fechaEliminacion, int idPublicacion){
        this.fechaEliminacion = fechaEliminacion;
        this.idPublicacion = idPublicacion;
    }

    /**
     * @return the fechaAlta
     */
    public String getFechaAlta() {
        return fechaAlta;
    }

    /**
     * @param fechaAlta the fechaAlta to set
     */
    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    /**
     * @return the fechaEdicion
     */
    public String getFechaEdicion() {
        return fechaEdicion;
    }

    /**
     * @param fechaEdicion the fechaEdicion to set
     */
    public void setFechaEdicion(String fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    /**
     * @return the fechaEliminacion
     */
    public String getFechaEliminacion() {
        return fechaEliminacion;
    }

    /**
     * @param fechaEliminacion the fechaEliminacion to set
     */
    public void setFechaEliminacion(String fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
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
