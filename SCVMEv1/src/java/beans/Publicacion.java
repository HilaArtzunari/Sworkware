package beans;

/**
 *
 * @author I.S.C. Roberto Mendoza Saavedra(isc.robertomendoza@gmail.com) - ESCOM
 */
public class Publicacion {
    private String nombreComponente;
    private int cantidad;
    private String descripcion;
    private String datasheet;
    private String facebook;
    private String imagen;
    private int idUsuario;
    private int estatus;
    
    public Publicacion(){}
    
    public Publicacion(String nombreComponente, int cantidad, String descripcion, String datasheet, String facebook, 
                        String imagen, int idUsuario, int estatus){
        this.nombreComponente = nombreComponente;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.datasheet = datasheet;
        this.facebook = facebook;
        this.imagen = imagen;
        this.idUsuario = idUsuario;
        this.estatus = estatus;
    }
    
    public Publicacion(String nombreComponente, int cantidad, String descripcion, int idUsuario, int estatus){
        this.nombreComponente = nombreComponente;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.idUsuario = idUsuario;
        this.estatus = estatus;
    }

    /**
     * @return the nombreComponente
     */
    public String getNombreComponente() {
        return nombreComponente;
    }

    /**
     * @param nombreComponente the nombreComponente to set
     */
    public void setNombreComponente(String nombreComponente) {
        this.nombreComponente = nombreComponente;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the datasheet
     */
    public String getDatasheet() {
        return datasheet;
    }

    /**
     * @param datasheet the datasheet to set
     */
    public void setDatasheet(String datasheet) {
        this.datasheet = datasheet;
    }

    /**
     * @return the facebook
     */
    public String getFacebook() {
        return facebook;
    }

    /**
     * @param facebook the facebook to set
     */
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the estatus
     */
    public int getEstatus() {
        return estatus;
    }

    /**
     * @param estatus the estatus to set
     */
    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }
}
