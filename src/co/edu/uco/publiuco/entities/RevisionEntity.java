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

    private RevisionEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setVersion(VersionEntity.create());
        setTipoRevision(TipoRevisionEntity.create());
        setFechaSolicitudRevision(UtilDate.getDefaultValue());
        setFechaLimiteRevision(UtilDate.getDefaultValue());
        setFechaCompletitudRevision(UtilDate.getDefaultValue());
        setEstado(EstadoEntity.create());
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

    public RevisionEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public RevisionEntity setVersion(final VersionEntity version) {
        this.version = UtilObject.getDefault(version, VersionEntity.create());
        return this;
    }

    public RevisionEntity setTipoRevision(final TipoRevisionEntity tipoRevision) {
        this.tipoRevision = UtilObject.getDefault(tipoRevision, TipoRevisionEntity.create());
        return this;
    }

    public RevisionEntity setFechaSolicitudRevision(final LocalDateTime fechaSolicitudRevision) {
        this.fechaSolicitudRevision = UtilDate.getDefault(fechaSolicitudRevision);
        return this;
    }

    public RevisionEntity setFechaLimiteRevision(final LocalDateTime fechaLimiteRevision) {
        this.fechaLimiteRevision = UtilDate.getDefault(fechaLimiteRevision);
        return this;
    }

    public RevisionEntity setFechaCompletitudRevision(final LocalDateTime fechaCompletitudRevision) {
        this.fechaCompletitudRevision = UtilDate.getDefault(fechaCompletitudRevision);
        return this;
    }

    public RevisionEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
    }
    public static RevisionEntity create (){
        return new RevisionEntity();
    }
}
