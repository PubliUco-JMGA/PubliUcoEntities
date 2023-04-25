package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;

import java.time.LocalDateTime;
import java.util.UUID;

public class ObservacionRevisionEntity {
    private UUID identificador;
    private EscritorPublicacionEntity escritorPublicacion;
    private ComentarioRevisorEntity comentarioRevisor;
    private LocalDateTime fechaReportePublicacion;
    private LocalDateTime fechaRevisionObservacion;
    private String observacion;
    private EstadoEntity estado;


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

    private void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    private void setEscritorPublicacion(EscritorPublicacionEntity escritorPublicacion) {
        this.escritorPublicacion = escritorPublicacion;
    }

    private void setComentarioRevisor(ComentarioRevisorEntity comentarioRevisor) {
        this.comentarioRevisor = comentarioRevisor;
    }

    private void setFechaReportePublicacion(LocalDateTime fechaReportePublicacion) {
        this.fechaReportePublicacion = fechaReportePublicacion;
    }

    private void setFechaRevisionObservacion(LocalDateTime fechaRevisionObservacion) {
        this.fechaRevisionObservacion = fechaRevisionObservacion;
    }

    private void setObservacion(String observacion) {
        this.observacion = UtilText.applyTrim(observacion);
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = estado;
    }
}
