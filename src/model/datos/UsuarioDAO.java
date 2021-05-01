package model.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.domain.Usuario;

/**
 *
 * @author Rodrigo-DevCode
 */
public class UsuarioDAO {
    
        public static final String SQL_SELECT_USUARIOS = "select\n"
                + "u.id as 'idUsuario',\n"
                + "u.nombre as 'nombre',\n"
                + "u.apellido as 'apellido',\n"
                + "u.userName as 'user',\n"
                + "u.userPassword as 'password',\n"
                + "u.email as 'email',\n"
                + "u.edad,\n"
                + "u.sexo, \n"
                + "u.direccion,\n"
                + "c.descripcion as 'ciudad',\n"
                + "p.descripcion as 'pais',\n"
                + "u.create_at,\n"
                + "u.update_at, \n"
                + "u.`server` as 'ip'\n"
                + "from seg_usuarios as u\n"
                + "INNER JOIN seg_grupo_usuario as gu on u.id=gu.id_usuario\n"
                + "INNER JOIN ciudades as c on u.idCiudad=c.id\n"
                + "inner join paises as p on u.idPais=p.id";
        
       /* public List<Usuario>getUsuarios(){
            Connection con=null;
            PreparedStatement ps=null;
            ResultSet rs=null;
            Usuario usuario= null;
            List<Usuario>listaUsuarios=new ArrayList<>();
            try {
                con=Conexion.getConexion();
                ps=con.prepareStatement(SQL_SELECT_USUARIOS);
                rs=ps.executeQuery();
                while (rs.next()) {                    
                    usuario.setId(rs.getInt("id"));
                    usuario.setNombre(rs.getString("nombre"));
                   
                    
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
            
        }*/
}
