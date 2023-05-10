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
    public static CalificacionEntity DEFAULT_OBJECT = new CalificacionEntity();

    private CalificacionEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPublicacion(PublicacionEntity.getDefaultObject());
        setLector(LectorEntity.getDefaultObject());
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

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setPublicacion(final PublicacionEntity publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.getDefaultObject());
    }

    private void setLector(final LectorEntity lector) {
        this.lector = UtilObject.getDefault(lector, LectorEntity.getDefaultObject());
    }

    private void setFechaCalificacion(final LocalDateTime fechaCalificacion) {
        this.fechaCalificacion = UtilDate.getDefault(fechaCalificacion);
    }

    private void setCalificacion(final String calificacion) {
        this.calificacion = UtilText.applyTrim(calificacion);
    }
    public static CalificacionEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
