
package pe.edu.upeu.clase08.test;

import pe.edu.upeu.clase08.config.Conexion;
import pe.edu.upeu.clase08.dao.IUsuario;
import pe.edu.upeu.clase08.daoImpl.UsuarioDaoImpl;

/**
 *
 * @author docente.fia
 */
public class Test {
static IUsuario iu = new UsuarioDaoImpl();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        login();
    }
    static void conec(){
        if(Conexion.getConexion()!=null){
            System.out.println("Conectado...!");
        }else{
            System.out.println("No Conectado");
        }
    }
    static void login(){
        System.out.println(iu.login("mariavidalon@gmail.com", "123"));
    }
    
    
}
