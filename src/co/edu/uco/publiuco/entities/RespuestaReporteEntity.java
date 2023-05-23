package co.edu.uco.publiuco.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import co.edu.uco.publiuco.utils.UtilDate;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

public class RespuestaReporteEntity {
	private UUID identificador;
	private ReporteEntity reporte;
	private CategoriaAdministradorCategoriaEntity administradorCategoria;
	private LocalDateTime fechaRespuestaReporte;
	private String justificacion;
	private EstadoEntity veredicto;
	
	private RespuestaReporteEntity() {
		setIdentificador(UtilUUID.getDefaultValue());
		setAdministradorCategoria(CategoriaAdministradorCategoriaEntity.getDefaultObject());
		setReporte(ReporteEntity.getDefaultObject());
		setFechaRespuestaReporte(UtilDate.getDefaultValue());
		setJustificacion(UtilText.getDefaultValue());
		setVeredicto(EstadoEntity.create());
	}
	public RespuestaReporteEntity(UUID identificador, ReporteEntity reporte,
			CategoriaAdministradorCategoriaEntity administradorCategoria, LocalDateTime fechaRespuestaReporte,
			String justificacion, EstadoEntity veredicto) {
		setIdentificador(identificador);
		setReporte(reporte);
		setAdministradorCategoria(administradorCategoria);
		setFechaRespuestaReporte(fechaRespuestaReporte);
		setJustificacion(justificacion);
		setVeredicto(veredicto);
	}
	public UUID getIdentificador() {
		return identificador;
	}
	public ReporteEntity getReporte() {
		return reporte;
	}
	public CategoriaAdministradorCategoriaEntity getAdministradorCategoria() {
		return administradorCategoria;
	}
	public LocalDateTime getFechaRespuestaReporte() {
		return fechaRespuestaReporte;
	}
	public String getJustificacion() {
		return justificacion;
	}
	public EstadoEntity getVeredicto() {
		return veredicto;
	}
	public RespuestaReporteEntity setIdentificador(UUID identificador) {
		this.identificador = identificador;
		return this;
	}
	public RespuestaReporteEntity setReporte(ReporteEntity reporte) {
		this.reporte = reporte;
		return this;
	}
	public RespuestaReporteEntity setAdministradorCategoria(CategoriaAdministradorCategoriaEntity administradorCategoria) {
		this.administradorCategoria = administradorCategoria;
		return this;
	}
	public RespuestaReporteEntity setFechaRespuestaReporte(LocalDateTime fechaRespuestaReporte) {
		this.fechaRespuestaReporte = fechaRespuestaReporte;
		return this;
	}
	public RespuestaReporteEntity setJustificacion(String justificacion) {
		this.justificacion = justificacion;
		return this;
	}
	public RespuestaReporteEntity setVeredicto(EstadoEntity veredicto) {
		this.veredicto = veredicto;
		return this;
	}
	
	public static RespuestaReporteEntity create (){
        return new RespuestaReporteEntity();
    }
	
	
	
}
