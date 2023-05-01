package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class HistorialAccesoPublicacionEntity {
    private UUID identificador;
    private LectorEntity lector;
    private PublicacionEntity publicacion;
    private LocalDateTime fechaAcceso;
    public static HistorialAccesoPublicacionEntity DEFAULT_OBJECT = new HistorialAccesoPublicacionEntity();

    private HistorialAccesoPublicacionEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setLector(LectorEntity.getDefaultObject());
        setPublicacion(PublicacionEntity.getDefaultObject());
        setFechaAcceso(UtilDate.getDefaultValue());
    }

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

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setLector(final LectorEntity lector) {
        this.lector = UtilObject.getDefault(lector, LectorEntity.getDefaultObject());
    }

    private void setPublicacion(final PublicacionEntity publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.getDefaultObject());
    }

    private void setFechaAcceso(final LocalDateTime fechaAcceso) {
        this.fechaAcceso = UtilDate.getDefault(fechaAcceso);
    }
    public static HistorialAccesoPublicacionEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
