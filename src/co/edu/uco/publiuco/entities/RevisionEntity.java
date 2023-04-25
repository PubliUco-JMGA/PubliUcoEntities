package co.edu.uco.publiuco.entities;

import java.time.LocalDateTime;
import java.util.UUID;

public class RevisionEntity {
    private UUID identificador;
    private VersionEntity version;
    private TipoRevisionEntity tipoRevision;
    private LocalDateTime fechaSolicitudRevision;
    private LocalDateTime fechaLimiteRevision;
    private LocalDateTime fechaCompletitudRevision;
    private EstadoEntity estado;

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

    private void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    private void setVersion(VersionEntity version) {
        this.version = version;
    }

    private void setTipoRevision(TipoRevisionEntity tipoRevision) {
        this.tipoRevision = tipoRevision;
    }

    private void setFechaSolicitudRevision(LocalDateTime fechaSolicitudRevision) {
        this.fechaSolicitudRevision = fechaSolicitudRevision;
    }

    private void setFechaLimiteRevision(LocalDateTime fechaLimiteRevision) {
        this.fechaLimiteRevision = fechaLimiteRevision;
    }

    private void setFechaCompletitudRevision(LocalDateTime fechaCompletitudRevision) {
        this.fechaCompletitudRevision = fechaCompletitudRevision;
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = estado;
    }
}
