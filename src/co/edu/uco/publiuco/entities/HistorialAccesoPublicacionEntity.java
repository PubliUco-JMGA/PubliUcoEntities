package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilDate;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class HistorialAccesoPublicacionEntity {
    private UUID identificador;
    private LectorEntity lector;
    private PublicacionEntity publicacion;
    private LocalDateTime fechaAcceso;

    private HistorialAccesoPublicacionEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setLector(LectorEntity.create());
        setPublicacion(PublicacionEntity.create());
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

    public HistorialAccesoPublicacionEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public HistorialAccesoPublicacionEntity setLector(final LectorEntity lector) {
        this.lector = UtilObject.getDefault(lector, LectorEntity.create());
        return this;
    }

    public HistorialAccesoPublicacionEntity setPublicacion(final PublicacionEntity publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.create());
        return this;
    }

    public HistorialAccesoPublicacionEntity setFechaAcceso(final LocalDateTime fechaAcceso) {
        this.fechaAcceso = UtilDate.getDefault(fechaAcceso);
        return this;
    }
    public static HistorialAccesoPublicacionEntity create (){
        return new HistorialAccesoPublicacionEntity();
    }
}
