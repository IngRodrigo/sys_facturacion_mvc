package model;

public class Usuario {
    private String nombre, apellido, userName, password, email, edad, sexo, direccion, idCiudad;
    private int id;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String userName, String password, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.userName = userName;
        this.password = password;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
    
}
