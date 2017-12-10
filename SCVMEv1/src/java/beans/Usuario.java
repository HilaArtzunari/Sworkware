package beans;

/**
 *
 * @author I.S.C Roberto Mendoza Saavedra (isc.robertomendoza@gmail.com) - ESCOM
 */
public class Usuario {
    private String email;
    private String nombreUsuario;
    private String clave;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String foto;
    private int calificacion;
    private int unidadAcademica;
    private int tipoUsuario;
    private int estatus;
    
    public Usuario(){}
    
    public Usuario(String email, String nombreUsuario, String clave, String nombre, String primerApellido, 
                    String segundoApellido, String foto, int calificacion, int unidadAcademica, int tipoUSuario, int estatus){
        this.email = email;
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.foto = foto;
        this.calificacion = calificacion;
        this.unidadAcademica = unidadAcademica;
        this.tipoUsuario = tipoUSuario;
        this.estatus = estatus;
    }
    
    public Usuario(String email, String nombreUsuario, String clave, String nombre, String primerApellido,
                    String segundoApellido, int unidadAcademica, int tipoUsuario, int estatus){
        this.email = email;
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.unidadAcademica = unidadAcademica;
        this.tipoUsuario = tipoUsuario;
        this.estatus = estatus;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the primerApellido
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * @param primerApellido the primerApellido to set
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * @return the segundoApellido
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * @param segundoApellido the segundoApellido to set
     */
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

    /**
     * @return the calificacion
     */
    public int getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * @return the unidadAcademica
     */
    public int getUnidadAcademica() {
        return unidadAcademica;
    }

    /**
     * @param unidadAcademica the unidadAcademica to set
     */
    public void setUnidadAcademica(int unidadAcademica) {
        this.unidadAcademica = unidadAcademica;
    }

    /**
     * @return the tipoUsuario
     */
    public int getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario the tipoUsuario to set
     */
    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
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
