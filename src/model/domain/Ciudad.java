
package model.domain;

public class Ciudad {
    
    private Integer id;
    private String descripcion;

    public Ciudad() {
    }

    public Ciudad(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "id=" + id + ", descripcion=" + descripcion + '}';
    }
    
    
}
