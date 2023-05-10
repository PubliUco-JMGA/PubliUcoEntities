package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilDate;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class RevisionEntity {
    private UUID identificador;
    private VersionEntity version;
    private TipoRevisionEntity tipoRevision;
    private LocalDateTime fechaSolicitudRevision;
    private LocalDateTime fechaLimiteRevision;
    private LocalDateTime fechaCompletitudRevision;
    private EstadoEntity estado;
    public static RevisionEntity DEFAULT_OBJECT = new RevisionEntity();

    private RevisionEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setVersion(VersionEntity.getDefaultObject());
        setTipoRevision(TipoRevisionEntity.getDefaultObject());
        setFechaSolicitudRevision(UtilDate.getDefaultValue());
        setFechaLimiteRevision(UtilDate.getDefaultValue());
        setFechaCompletitudRevision(UtilDate.getDefaultValue());
        setEstado(EstadoEntity.getDefaultObject());
    }
    public RevisionEntity(UUID identificador, VersionEntity version, TipoRevisionEntity tipoRevision, LocalDateTime fechaSolicitudRevision, LocalDateTime fechaLimiteRevision, LocalDateTime fechaCompletitudRevision, EstadoEntity estado) {
        setIdentificador(identificador);
        setVersion(version);
        setTipoRevision(tipoRevision);
        setFechaSolicitudRevision(fechaSolicitudRevision);
        setFechaLimiteRevision(fechaLimiteRevision);
        setFechaCompletitudRevision(fechaCompletitudRevision);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public VersionEntity getVersion() {
        return version;
    }

    public TipoRevisionEntity getTipoRevision() {
        return tipoRevision;
    }

    public LocalDateTime getFechaSolicitudRevision() {
        return fechaSolicitudRevision;
    }

    public LocalDateTime getFechaLimiteRevision() {
        return fechaLimiteRevision;
    }

    public LocalDateTime getFechaCompletitudRevision() {
        return fechaCompletitudRevision;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setVersion(final VersionEntity version) {
        this.version = UtilObject.getDefault(version, VersionEntity.getDefaultObject());
    }

    private void setTipoRevision(final TipoRevisionEntity tipoRevision) {
        this.tipoRevision = UtilObject.getDefault(tipoRevision, TipoRevisionEntity.getDefaultObject());
    }

    private void setFechaSolicitudRevision(final LocalDateTime fechaSolicitudRevision) {
        this.fechaSolicitudRevision = UtilDate.getDefault(fechaSolicitudRevision);
    }

    private void setFechaLimiteRevision(final LocalDateTime fechaLimiteRevision) {
        this.fechaLimiteRevision = UtilDate.getDefault(fechaLimiteRevision);
    }

    private void setFechaCompletitudRevision(final LocalDateTime fechaCompletitudRevision) {
        this.fechaCompletitudRevision = UtilDate.getDefault(fechaCompletitudRevision);
    }

    private void setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }
    public static RevisionEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
