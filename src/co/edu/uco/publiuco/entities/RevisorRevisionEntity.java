package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class RevisorRevisionEntity {
    private UUID identificador;
    private RevisionEntity revision;
    private RevisorEntity revisor;
    private LocalDateTime fechaAsignacionRevision;
    private LocalDateTime fechaCompletitudRevision;
    private EstadoEntity estado;
    public static RevisorRevisionEntity DEFAULT_OBJECT = new RevisorRevisionEntity();

    private RevisorRevisionEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setRevision(RevisionEntity.getDefaultObject());
        setRevisor(RevisorEntity.getDefaultObject());
        setFechaAsignacionRevision(UtilDate.getDefaultValue());
        setFechaCompletitudRevision(UtilDate.getDefaultValue());
        setEstado(EstadoEntity.getDefaultObject());

    }
    public RevisorRevisionEntity(UUID identificador, RevisionEntity revision, RevisorEntity revisor, LocalDateTime fechaAsignacionRevision, LocalDateTime fechaCompletitudRevision, EstadoEntity estado) {
        setIdentificador(identificador);
        setRevision(revision);
        setRevisor(revisor);
        setFechaAsignacionRevision(fechaAsignacionRevision);
        setFechaCompletitudRevision(fechaCompletitudRevision);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public RevisionEntity getRevision() {
        return revision;
    }

    public RevisorEntity getRevisor() {
        return revisor;
    }

    public LocalDateTime getFechaAsignacionRevision() {
        return fechaAsignacionRevision;
    }

    public LocalDateTime getFechaCompletitudRevision() {
        return fechaCompletitudRevision;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public RevisorRevisionEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    private void setRevision(final RevisionEntity revision) {
        this.revision = UtilObject.getDefault(revision, RevisionEntity.getDefaultObject());
    }

    private void setRevisor(final RevisorEntity revisor) {
        this.revisor = UtilObject.getDefault(revisor, RevisorEntity.getDefaultObject());
    }

    private void setFechaAsignacionRevision(final LocalDateTime fechaAsignacionRevision) {
        this.fechaAsignacionRevision = UtilDate.getDefault(fechaAsignacionRevision);
    }

    private void setFechaCompletitudRevision(final LocalDateTime fechaCompletitudRevision) {
        this.fechaCompletitudRevision = UtilDate.getDefault(fechaCompletitudRevision);
    }

    private void setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }
    public static RevisorRevisionEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
