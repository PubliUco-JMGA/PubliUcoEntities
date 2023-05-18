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
	 public static RespuestaReporteEntity DEFAULT_OBJECT = new RespuestaReporteEntity();
	
	private RespuestaReporteEntity() {
		setIdentificador(UtilUUID.getDefaultValue());
		setAdministradorCategoria(CategoriaAdministradorCategoriaEntity.getDefaultObject());
		setReporte(ReporteEntity.getDefaultObject());
		setFechaRespuestaReporte(UtilDate.getDefaultValue());
		setJustificacion(UtilText.getDefaultValue());
		setVeredicto(EstadoEntity.getDefaultObject());
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
	public RespuestaReporteEntity setIdentificador(UUID identificador) {
		this.identificador = identificador;
		return this;
	}
	public ReporteEntity getReporte() {
		return reporte;
	}
	private void setReporte(ReporteEntity reporte) {
		this.reporte = reporte;
	}
	public CategoriaAdministradorCategoriaEntity getAdministradorCategoria() {
		return administradorCategoria;
	}
	private void setAdministradorCategoria(CategoriaAdministradorCategoriaEntity administradorCategoria) {
		this.administradorCategoria = administradorCategoria;
	}
	public LocalDateTime getFechaRespuestaReporte() {
		return fechaRespuestaReporte;
	}
	private void setFechaRespuestaReporte(LocalDateTime fechaRespuestaReporte) {
		this.fechaRespuestaReporte = fechaRespuestaReporte;
	}
	public String getJustificacion() {
		return justificacion;
	}
	private void setJustificacion(String justificacion) {
		this.justificacion = justificacion;
	}
	public EstadoEntity getVeredicto() {
		return veredicto;
	}
	private void setVeredicto(EstadoEntity veredicto) {
		this.veredicto = veredicto;
	}
	public static RespuestaReporteEntity create (){
        return new RespuestaReporteEntity();
    }
	public static RespuestaReporteEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
	
	
	
}
