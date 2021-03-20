package model;

public class ConsultasSql {

    /**
     * USUARIOS
     *
     * @param usuario
     */
    public static String insertarUsuario(Usuario usuario) {
        String sql = "insert into ";
        return sql;
    }

    public static String getUsuarios() {
        String sql = "select\n"
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
        
        return sql;
    }

    /*Ciudades*/
    public static String TodasLasCiudades() {
        String sql = "select * from ciudades";
        return sql;
    }

}
