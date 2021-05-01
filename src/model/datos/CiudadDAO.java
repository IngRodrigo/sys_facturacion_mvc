package model.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.domain.Ciudad;

/**
 *
 * @author Rodrigo-DevCode
 */
public class CiudadDAO {

    public static final String SQL_TODAS_LAS_CIUDADES = "select ciudades.id, ciudades.descripcion from ciudades;";

    public static List<Ciudad> getCiudades() {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Ciudad ciudad = null;
        List<Ciudad> listaCiudades = new ArrayList<>();

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(SQL_TODAS_LAS_CIUDADES);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String descripcion = rs.getString("descripcion");
                ciudad = new Ciudad(id, descripcion);
                listaCiudades.add(ciudad);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return listaCiudades;
    }
}
