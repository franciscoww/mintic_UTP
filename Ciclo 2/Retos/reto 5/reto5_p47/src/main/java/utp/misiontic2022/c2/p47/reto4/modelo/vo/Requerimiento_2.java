package utp.misiontic2022.c2.p47.reto4.modelo.vo;

public class Requerimiento_2 {
    // Su código
    private Integer id_MaterialConstruccion;
    private String nombre_Material;
    private Integer cantidad;
    private Integer precio_Unidad;
    private Integer precio_Total;

    
    public Requerimiento_2() {
    }


    public Integer getId_MaterialConstruccion() {
        return id_MaterialConstruccion;
    }


    public void setId_MaterialConstruccion(Integer id_MaterialConstruccion) {
        this.id_MaterialConstruccion = id_MaterialConstruccion;
    }


    public String getNombre_Material() {
        return nombre_Material;
    }


    public void setNombre_Material(String nombre_Material) {
        this.nombre_Material = nombre_Material;
    }


    public Integer getCantidad() {
        return cantidad;
    }


    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }


    public Integer getPrecio_Unidad() {
        return precio_Unidad;
    }


    public void setPrecio_Unidad(Integer precio_Unidad) {
        this.precio_Unidad = precio_Unidad;
    }


    public Integer getPrecio_Total() {
        return precio_Total;
    }


    public void setPrecio_Total(Integer precio_Total) {
        this.precio_Total = precio_Total;
    }

    
}
