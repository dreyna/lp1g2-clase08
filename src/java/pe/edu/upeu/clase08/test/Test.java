
package pe.edu.upeu.clase08.test;

import pe.edu.upeu.clase08.config.Conexion;

/**
 *
 * @author docente.fia
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(Conexion.getConexion()!=null){
            System.out.println("Conectado...!");
        }else{
            System.out.println("No Conectado");
        }
    }
    
}
