package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilDate;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class ObservacionRevisionEntity {
    private UUID identificador;
    private EscritorPublicacionEntity escritorPublicacion;
    private ComentarioRevisorEntity comentarioRevisor;
    private LocalDateTime fechaReportePublicacion;
    private LocalDateTime fechaRevisionObservacion;
    private String observacion;
    private EstadoEntity estado;

    private ObservacionRevisionEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setEscritorPublicacion(EscritorPublicacionEntity.create());
        setComentarioRevisor(ComentarioRevisorEntity.create());
        setFechaReportePublicacion(UtilDate.getDefaultValue());
        setFechaRevisionObservacion(UtilDate.getDefaultValue());
        setObservacion(UtilText.getDefaultValue());
        setEstado(EstadoEntity.create());
    }

    public ObservacionRevisionEntity(UUID identificador, EscritorPublicacionEntity escritorPublicacion, ComentarioRevisorEntity comentarioRevisor, LocalDateTime fechaReportePublicacion, LocalDateTime fechaRevisionObservacion, String observacion, EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setEscritorPublicacion(escritorPublicacion);
        setComentarioRevisor(comentarioRevisor);
        setFechaReportePublicacion(fechaReportePublicacion);
        setFechaRevisionObservacion(fechaRevisionObservacion);
        setObservacion(observacion);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public EscritorPublicacionEntity getEscritorPublicacion() {
        return escritorPublicacion;
    }

    public ComentarioRevisorEntity getComentarioRevisor() {
        return comentarioRevisor;
    }

    public LocalDateTime getFechaReportePublicacion() {
        return fechaReportePublicacion;
    }

    public LocalDateTime getFechaRevisionObservacion() {
        return fechaRevisionObservacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public ObservacionRevisionEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ObservacionRevisionEntity setEscritorPublicacion(final EscritorPublicacionEntity escritorPublicacion) {
        this.escritorPublicacion = UtilObject.getDefault(escritorPublicacion, EscritorPublicacionEntity.create());
        return this;
    }

    public ObservacionRevisionEntity setComentarioRevisor(final ComentarioRevisorEntity comentarioRevisor) {
        this.comentarioRevisor = UtilObject.getDefault(comentarioRevisor, ComentarioRevisorEntity.create());
        return this;
    }

    public ObservacionRevisionEntity setFechaReportePublicacion(final LocalDateTime fechaReportePublicacion) {
        this.fechaReportePublicacion = UtilDate.getDefault(fechaReportePublicacion);
        return this;
    }

    public ObservacionRevisionEntity setFechaRevisionObservacion(final LocalDateTime fechaRevisionObservacion) {
        this.fechaRevisionObservacion = UtilDate.getDefault(fechaRevisionObservacion);
        return this;
    }

    public ObservacionRevisionEntity setObservacion(final String observacion) {
        this.observacion = UtilText.applyTrim(observacion);
        return this;
    }

    public ObservacionRevisionEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
    }
    public static ObservacionRevisionEntity create (){
        return new ObservacionRevisionEntity();
    }
}
