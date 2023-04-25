package co.edu.uco.publiuco.entities;

import java.time.LocalDateTime;
import java.util.UUID;

public class HistorialAccesoPublicacionEntity {
    private UUID identificador;
    private LectorEntity lector;
    private PublicacionEntity publicacion;
    private LocalDateTime fechaAcceso;


    public HistorialAccesoPublicacionEntity(UUID identificador, LectorEntity lector, PublicacionEntity publicacion, LocalDateTime fechaAcceso) {
        super();
        setIdentificador(identificador);
        setLector(lector);
        setPublicacion(publicacion);
        setFechaAcceso(fechaAcceso);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public LectorEntity getLector() {
        return lector;
    }

    public PublicacionEntity getPublicacion() {
        return publicacion;
    }

    public LocalDateTime getFechaAcceso() {
        return fechaAcceso;
    }

    private void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    private void setLector(LectorEntity lector) {
        this.lector = lector;
    }

    private void setPublicacion(PublicacionEntity publicacion) {
        this.publicacion = publicacion;
    }

    private void setFechaAcceso(LocalDateTime fechaAcceso) {
        this.fechaAcceso = fechaAcceso;
    }
}
