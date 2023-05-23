package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilDate;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class RevisorRevisionEntity {
    private UUID identificador;
    private RevisionEntity revision;
    private RevisorEntity revisor;
    private LocalDateTime fechaAsignacionRevision;
    private LocalDateTime fechaCompletitudRevision;
    private EstadoEntity estado;

    private RevisorRevisionEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setRevision(RevisionEntity.create());
        setRevisor(RevisorEntity.create());
        setFechaAsignacionRevision(UtilDate.getDefaultValue());
        setFechaCompletitudRevision(UtilDate.getDefaultValue());
        setEstado(EstadoEntity.create());

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

    public RevisorRevisionEntity setRevision(final RevisionEntity revision) {
        this.revision = UtilObject.getDefault(revision, RevisionEntity.create());
        return this;
    }

    public RevisorRevisionEntity setRevisor(final RevisorEntity revisor) {
        this.revisor = UtilObject.getDefault(revisor, RevisorEntity.create());
        return this;
    }

    public RevisorRevisionEntity setFechaAsignacionRevision(final LocalDateTime fechaAsignacionRevision) {
        this.fechaAsignacionRevision = UtilDate.getDefault(fechaAsignacionRevision);
        return this;
    }

    public RevisorRevisionEntity setFechaCompletitudRevision(final LocalDateTime fechaCompletitudRevision) {
        this.fechaCompletitudRevision = UtilDate.getDefault(fechaCompletitudRevision);
        return this;
    }

    public RevisorRevisionEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
    }
    public static RevisorRevisionEntity create (){
        return new RevisorRevisionEntity();
    }
}
