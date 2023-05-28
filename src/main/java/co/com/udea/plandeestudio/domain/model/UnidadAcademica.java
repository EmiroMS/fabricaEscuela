package co.com.udea.plandeestudio.domain.model;

public class UnidadAcademica {
    private String codigo;
    private String nombre;
    private Persona decano;
    private String actaEntidad;
    private String actaConsejoSuperior;
    private String descripcion;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getDecano() {
        return decano;
    }

    public void setDecano(Persona decano) {
        this.decano = decano;
    }

    public String getActaEntidad() {
        return actaEntidad;
    }

    public void setActaEntidad(String actaEntidad) {
        this.actaEntidad = actaEntidad;
    }

    public String getActaConsejoSuperior() {
        return actaConsejoSuperior;
    }

    public void setActaConsejoSuperior(String actaConsejoSuperior) {
        this.actaConsejoSuperior = actaConsejoSuperior;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
