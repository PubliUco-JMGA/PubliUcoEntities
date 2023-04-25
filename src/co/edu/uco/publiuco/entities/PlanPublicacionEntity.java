package co.edu.uco.publiuco.entities;

import java.time.LocalDateTime;
import java.util.UUID;

public class PlanPublicacionEntity {
    private UUID identificador;
    private PublicacionEntity publicacion;
    private double precio;
    private LocalDateTime fechaDesde;
    private LocalDateTime fechaHasta;
    private EstadoEntity estado;


    public PlanPublicacionEntity(UUID identificador, PublicacionEntity publicacion, double precio, LocalDateTime fechaDesde, LocalDateTime fechaHasta, EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setPublicacion(publicacion);
        setPrecio(precio);
        setFechaDesde(fechaDesde);
        setFechaHasta(fechaHasta);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PublicacionEntity getPublicacion() {
        return publicacion;
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

    private void setPublicacion(PublicacionEntity publicacion) {
        this.publicacion = publicacion;
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
