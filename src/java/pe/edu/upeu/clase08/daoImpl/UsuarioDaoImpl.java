
package pe.edu.upeu.clase08.daoImpl;

import pe.edu.upeu.clase08.dao.IUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.edu.upeu.clase08.config.Conexion;
/**
 *
 * @author docente.fia
 */
public class UsuarioDaoImpl implements IUsuario{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    @Override
    public int login(String correo, String clave) {
        final String SQL_LOGIN = "SELECT *FROM usuario WHERE correo=? and clave=?";
        int x = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_LOGIN);
            ps.setString(1, correo);
            ps.setString(2, clave);
            rs = ps.executeQuery();
            while(rs.next()){
               x = 1; 
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }
    
}
