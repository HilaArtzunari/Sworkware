package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author I.S.C. Roberto Mendoza Saavedra(isc.robertomendoza@gmail.com) - ESCOM
 */
public class Conexion implements IConexion{

    private int iBd; 
    private String base;
    private String usuario;
    private String password;
    private String ip;
    private Connection conn;
    
    public Conexion(){
        iBd = 1;
        this.base = "scvme";
        this.usuario = "root";
        this.password = "root";
        ip = null;
        conn = null;
    }
    
    public Conexion(String base){
        iBd = 1;
        this.base = base;
        this.usuario = "root";
        this.password = "root";
        ip = null;
        conn = null;
    }
    
    public Conexion(String base, String usuario, String password){
        iBd = 1;
        this.base = base;
        this.usuario = usuario;
        this.password = password;
        conn = null;
    }
    
    // Se agrega constructor para saber a qué base nos conectaremos (dietadb o centrodeportivo) y en que host
    public Conexion(String base, String ip){
        iBd = 2;
        this.base = base;
        this.usuario = "root";
        this.password = "root";
        this.ip = ip;
        conn = null;
    }
    
    private String crearConectorURL(){
        String conectorURL = "";
        if(iBd==0){
            conectorURL = URL_DRIVER[iBd]+base+"?"
                          + "user = "+usuario+"&password="+password;
        }
        else if(iBd == 2){
            conectorURL = "jdbc:mysql://" + this.getIp() + "/" + base;
        }
        else{
            conectorURL = URL_DRIVER[iBd]+base;
        }
        return conectorURL;
    }
    
    private boolean cargarControlador(){
        boolean seCargo = false;
        try{
            System.err.println("Cargando: "+DRIVER[1]);
            Class.forName(DRIVER[1]).newInstance();
            System.out.println("...hecho");
            seCargo = true;
        }catch(InstantiationException ie){
            ie.printStackTrace();
        }catch(ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }catch(IllegalAccessException iae){
            iae.printStackTrace();
        }
        return seCargo;
    }
    
    public Connection getConexion(){
        if(cargarControlador()){
            try{
                String conector = crearConectorURL();
                System.out.println("Conectando con: "+conector);
                if(iBd==0){
                    conn = DriverManager.getConnection(conector);
                }
                else{
                    conn = DriverManager.getConnection(conector, usuario, password);
                }
                System.err.println("...Conexion establecida");
            }catch(SQLException sqle){
                System.out.println("\nSQLException: "+sqle.getMessage());
                System.out.println("\nSQLState: "+sqle.getSQLState());
                System.out.println("\nVendor Error: "+sqle.getErrorCode());
            }
        }
        
        else{
            System.out.println("No se puede cargar el controlador de base de datos");
        }
        return conn;
    }
    
    public void cerrarConexion(){
        try{
            if(conn!=null){
                conn.close();
                System.err.println("...Conexion cerrada");
            }else{
                System.out.println("...No hubo nada que cerrar");
            }
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
    }
    
    public void setIBd(int iBd){
        this.iBd = iBd;
    }
    
    public String getIp(){
        return this.ip;
    }
}