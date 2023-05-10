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
    public static ObservacionRevisionEntity DEFAULT_OBJECT = new ObservacionRevisionEntity();

    private ObservacionRevisionEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setEscritorPublicacion(EscritorPublicacionEntity.getDefaultObject());
        setComentarioRevisor(ComentarioRevisorEntity.getDefaultObject());
        setFechaReportePublicacion(UtilDate.getDefaultValue());
        setFechaRevisionObservacion(UtilDate.getDefaultValue());
        setObservacion(UtilText.getDefaultValue());
        setEstado(EstadoEntity.getDefaultObject());
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

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setEscritorPublicacion(final EscritorPublicacionEntity escritorPublicacion) {
        this.escritorPublicacion = UtilObject.getDefault(escritorPublicacion, EscritorPublicacionEntity.getDefaultObject());
    }

    private void setComentarioRevisor(final ComentarioRevisorEntity comentarioRevisor) {
        this.comentarioRevisor = UtilObject.getDefault(comentarioRevisor, ComentarioRevisorEntity.getDefaultObject());
    }

    private void setFechaReportePublicacion(final LocalDateTime fechaReportePublicacion) {
        this.fechaReportePublicacion = UtilDate.getDefault(fechaReportePublicacion);
    }

    private void setFechaRevisionObservacion(final LocalDateTime fechaRevisionObservacion) {
        this.fechaRevisionObservacion = UtilDate.getDefault(fechaRevisionObservacion);
    }

    private void setObservacion(final String observacion) {
        this.observacion = UtilText.applyTrim(observacion);
    }

    private void setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }
    public static ObservacionRevisionEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
