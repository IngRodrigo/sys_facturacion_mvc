package model;

public class CadenasSentenciasSql {

    /**
     * USUARIOS
     *
     * @param usuario
     */
    public static String insertarUsuario(Usuario usuario) {
        if(usuario!=null){
            String sql = "insert into seg_usuarios (nombre, apellido, userName, userPassword, W)";
            return sql;
        }
        return null;
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

    public static String getUsuario(String usuario, String password) {
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
                + "INNER join paises as p on u.idPais=p.id\n"
                + "WHERE u.userName='" + usuario + "' and u.userPassword='" + password + "'";
        return sql;
    }

    /*Ciudades*/
    public static String TodasLasCiudades() {
        String sql = "select * from ciudades";
        return sql;
    }

    public static String TodosLosPaises() {
        String sql = "Select * from paises";
        return sql;
    }

    public static String TodosLosTipos() {
        String sql="Select * from seg_grupos";
        return sql;
    }

}
