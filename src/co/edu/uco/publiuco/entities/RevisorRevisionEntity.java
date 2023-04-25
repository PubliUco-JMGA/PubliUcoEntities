package co.edu.uco.publiuco.entities;

import java.time.LocalDateTime;
import java.util.UUID;

public class RevisorRevisionEntity {
    private UUID identificador;
    private RevisionEntity revision;
    private RevisorEntity revisor;
    private LocalDateTime fechaAsignacionRevision;
    private LocalDateTime fechaCompletitudRevision;
    private EstadoEntity estado;


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

    private void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    private void setRevision(RevisionEntity revision) {
        this.revision = revision;
    }

    private void setRevisor(RevisorEntity revisor) {
        this.revisor = revisor;
    }

    private void setFechaAsignacionRevision(LocalDateTime fechaAsignacionRevision) {
        this.fechaAsignacionRevision = fechaAsignacionRevision;
    }

    private void setFechaCompletitudRevision(LocalDateTime fechaCompletitudRevision) {
        this.fechaCompletitudRevision = fechaCompletitudRevision;
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = estado;
    }
}
