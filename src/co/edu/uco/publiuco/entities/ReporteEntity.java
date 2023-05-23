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

    private ReporteEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setLector(LectorEntity.create());
        setComentario(ComentarioLectorEntity.create());
        setRazon(UtilText.getDefaultValue());
        setTipo(TipoReporteEntity.create());
        setFechaReporte(UtilDate.getDefaultValue());
        setEstado(EstadoEntity.create());
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

    public ReporteEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ReporteEntity setLector(final LectorEntity lector) {
        this.lector = UtilObject.getDefault(lector, LectorEntity.create());
        return this;
    }

    public ReporteEntity setComentario(final ComentarioLectorEntity comentario) {
        this.comentario = UtilObject.getDefault(comentario, ComentarioLectorEntity.create());
        return this;
    }

    public ReporteEntity setRazon(final String razon) {
        this.razon = UtilText.applyTrim(razon);
        return this;
    }

    public ReporteEntity setTipo(final TipoReporteEntity tipoReporte) {
        this.tipo = UtilObject.getDefault(tipoReporte, TipoReporteEntity.create());
        return this;
    }

    public ReporteEntity setFechaReporte(final LocalDateTime fechaReporte) {
        this.fechaReporte = UtilDate.getDefault(fechaReporte);
        return this;
    }
    private ReporteEntity setEstado(EstadoEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
		return this;
	}
    public static ReporteEntity getDefaultObject (){
        return new ReporteEntity();
    }
}
