package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilDate;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class ReporteEntity {
    private UUID identificador;
    private LectorEntity lector;
    private ComentarioLectorEntity comentario;
    private String razon;
    private TipoReporteEntity tipo;
    private LocalDateTime fechaReporte;
    private EstadoEntity estado;
    public static final ReporteEntity DEFAULT_OBJECT = new ReporteEntity();

    private ReporteEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setLector(LectorEntity.getDefaultObject());
        setComentario(ComentarioLectorEntity.getDefaultObject());
        setRazon(UtilText.getDefaultValue());
        setTipo(TipoReporteEntity.getDefaultObject());
        setFechaReporte(UtilDate.getDefaultValue());
        setEstado(EstadoEntity.getDefaultObject());
    }

    public ReporteEntity(UUID identificador, LectorEntity lector, ComentarioLectorEntity comentario, String razon, TipoReporteEntity tipo, LocalDateTime fechaReporte, EstadoEntity estado) {
        setIdentificador(identificador);
        setLector(lector);
        setComentario(comentario);
        setRazon(razon);
        setTipo(tipo);
        setFechaReporte(fechaReporte);
        setEstado(estado);
    }

    
    public EstadoEntity getEstado() {
		return estado;
	}

	private void setEstado(EstadoEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
	}

	public UUID getIdentificador() {
        return identificador;
    }

    public LectorEntity getLector() {
        return lector;
    }

    public ComentarioLectorEntity getComentario() {
        return comentario;
    }

    public String getRazon() {
        return razon;
    }

    public TipoReporteEntity getTipo() {
        return tipo;
    }

    public LocalDateTime getFechaReporte() {
        return fechaReporte;
    }

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setLector(final LectorEntity lector) {
        this.lector = UtilObject.getDefault(lector, LectorEntity.getDefaultObject());
    }

    private void setComentario(final ComentarioLectorEntity comentario) {
        this.comentario = UtilObject.getDefault(comentario, ComentarioLectorEntity.getDefaultObject());
    }

    private void setRazon(final String razon) {
        this.razon = UtilText.applyTrim(razon);
    }

    private void setTipo(final TipoReporteEntity tipo) {
        this.tipo = UtilObject.getDefault(tipo, TipoReporteEntity.getDefaultObject());
    }

    private void setFechaReporte(final LocalDateTime fechaReporte) {
        this.fechaReporte = UtilDate.getDefault(fechaReporte);
    }
    public static ReporteEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
