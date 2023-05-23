package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilDate;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class CalificacionEntity {
    private UUID identificador;
    private PublicacionEntity publicacion;
    private LectorEntity lector;
    private LocalDateTime fechaCalificacion;
    private String calificacion;

    private CalificacionEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPublicacion(PublicacionEntity.create());
        setLector(LectorEntity.create());
        setFechaCalificacion(UtilDate.getDefaultValue());
        setCalificacion(UtilText.getDefaultValue());
    }

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

    public CalificacionEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public CalificacionEntity setPublicacion(final PublicacionEntity publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.create());
        return this;
    }

    public CalificacionEntity setLector(final LectorEntity lector) {
        this.lector = UtilObject.getDefault(lector, LectorEntity.create());
        return this;
    }

    public CalificacionEntity setFechaCalificacion(final LocalDateTime fechaCalificacion) {
        this.fechaCalificacion = UtilDate.getDefault(fechaCalificacion);
        return this;
    }

    public CalificacionEntity setCalificacion(final String calificacion) {
        this.calificacion = UtilText.applyTrim(calificacion);
        return this;
    }
    public static CalificacionEntity create (){
        return new CalificacionEntity();
    }
}
