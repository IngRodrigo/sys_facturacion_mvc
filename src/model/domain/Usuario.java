
package model.domain;


public class Usuario {
    private String nombre, apellido, userName, userPassword, email, dateNacimiento, sexo, direccion, createAt, updateAt, server;
    private Integer id, edad, idCiudad, idPais, idEstado, idGrupo;

    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String apellido, String userName, String userPassword, String email, String dateNacimiento, String sexo, String direccion, String createAt, String updateAt, String server, Integer edad, Integer idCiudad, Integer idPais, Integer idEstado, Integer idGrupo) {
        this.id=id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.userName = userName;
        this.userPassword = userPassword;
        this.email = email;
        this.dateNacimiento = dateNacimiento;
        this.sexo = sexo;
        this.direccion = direccion;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.server = server;
        this.edad = edad;
        this.idCiudad = idCiudad;
        this.idPais = idPais;
        this.idEstado = idEstado;
        this.idGrupo = idGrupo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateNacimiento() {
        return dateNacimiento;
    }

    public void setDateNacimiento(String dateNacimiento) {
        this.dateNacimiento = dateNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", userName=" + userName + ", userPassword=" + userPassword + ", email=" + email + ", dateNacimiento=" + dateNacimiento + ", sexo=" + sexo + ", direccion=" + direccion + ", createAt=" + createAt + ", updateAt=" + updateAt + ", server=" + server + ", id=" + id + ", edad=" + edad + ", idCiudad=" + idCiudad + ", idPais=" + idPais + ", idEstado=" + idEstado + ", idGrupo=" + idGrupo + '}';
    }


    
}
