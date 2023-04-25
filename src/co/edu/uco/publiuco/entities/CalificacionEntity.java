package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class CalificacionEntity {
    private UUID identificador;
    private PublicacionEntity publicacion;
    private LectorEntity lector;
    private LocalDateTime fechaCalificacion;
    private String calificacion;

    public CalificacionEntity(UUID identificador, PublicacionEntity publicacion, LectorEntity lector, LocalDateTime fechaCalificacion, String calificacion) {
        super();
        setIdentificador(identificador);
        setPublicacion(publicacion);
        setLector(lector);
        setFechaCalificacion(fechaCalificacion);
        setCalificacion(calificacion);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PublicacionEntity getPublicacion() {
        return publicacion;
    }

    public LectorEntity getLector() {
        return lector;
    }

    public LocalDateTime getFechaCalificacion() {
        return fechaCalificacion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    private CalificacionEntity setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    private CalificacionEntity setPublicacion(PublicacionEntity publicacion) {
        this.publicacion = publicacion;
        return this;
    }

    private CalificacionEntity setLector(LectorEntity lector) {
        this.lector = lector;
        return this;
    }

    private CalificacionEntity setFechaCalificacion(LocalDateTime fechaCalificacion) {
        this.fechaCalificacion = fechaCalificacion;
        return this;
    }

    private CalificacionEntity setCalificacion(String calificacion) {
        this.calificacion = UtilText.applyTrim(calificacion);
        return this;
    }
}
