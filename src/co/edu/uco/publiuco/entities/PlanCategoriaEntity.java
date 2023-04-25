package co.edu.uco.publiuco.entities;

import java.util.UUID;
import java.time.LocalDateTime;

public class PlanCategoriaEntity {
    private UUID identificador;
    private CategoriaEntity categoria;
    private double precio;
    private LocalDateTime fechaDesde;
    private LocalDateTime fechaHasta;
    private EstadoEntity estado;


    public PlanCategoriaEntity(UUID identificador, CategoriaEntity categoria, double precio, LocalDateTime fechaDesde, LocalDateTime fechaHasta, EstadoEntity estado) {
       super();
        setIdentificador(identificador);
       setCategoria(categoria);
       setPrecio(precio);
       setFechaDesde(fechaDesde);
       setFechaHasta(fechaHasta);
       setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public CategoriaEntity getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public LocalDateTime getFechaDesde() {
        return fechaDesde;
    }

    public LocalDateTime getFechaHasta() {
        return fechaHasta;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    private void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    private void setCategoria(CategoriaEntity categoria) {
        this.categoria = categoria;
    }

    private void setPrecio(double precio) {
        this.precio = precio;
    }

    private void setFechaDesde(LocalDateTime fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    private void setFechaHasta(LocalDateTime fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = estado;
    }
}
