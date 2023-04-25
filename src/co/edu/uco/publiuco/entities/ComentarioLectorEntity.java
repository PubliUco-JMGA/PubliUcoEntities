package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;
public final class ComentarioLectorEntity {

	private UUID identificador;
	private LectorEntity lector;
	private PublicacionEntity publicacion;
	private ComentarioLectorEntity comentarioPadre;
	private String cotenido;
	private LocalDateTime fechaCalificacion;
	private EstadoEntity estado;


	public ComentarioLectorEntity(UUID identificador, LectorEntity lector, PublicacionEntity publicacion, ComentarioLectorEntity comentarioPadre, String contenido, LocalDateTime fechaCalificacion, EstadoEntity estado) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setComentarioPadre(comentarioPadre);
		setCotenido(contenido);
		setFechaCalificacion(fechaCalificacion);
		setEstado(estado);
	}

	public UUID getIdentificador() {
		return identificador;
	}

	public LectorEntity getLector() {
		return lector;
	}

	public PublicacionEntity getPublicacion() {
		return publicacion;
	}

	public ComentarioLectorEntity getComentarioPadre() {
		return comentarioPadre;
	}

	public String getCotenido() {
		return cotenido;
	}

	public LocalDateTime getFechaCalificacion() {
		return fechaCalificacion;
	}

	public EstadoEntity getEstado() {
		return estado;
	}

	private ComentarioLectorEntity setIdentificador(UUID identificador) {
		this.identificador = identificador;
		return this;
	}

	private ComentarioLectorEntity setLector(LectorEntity lector) {
		this.lector = lector;
		return this;
	}

	private ComentarioLectorEntity setPublicacion(PublicacionEntity publicacion) {
		this.publicacion = publicacion;
		return this;
	}

	private ComentarioLectorEntity setComentarioPadre(ComentarioLectorEntity comentarioPadre) {
		this.comentarioPadre = comentarioPadre;
		return this;
	}

	private ComentarioLectorEntity setEstado(EstadoEntity estado) {
		this.estado = estado;
		return this;
	}

	private ComentarioLectorEntity setCotenido(String cotenido) {
		this.cotenido = cotenido;
		return this;
	}

	private ComentarioLectorEntity setFechaCalificacion(LocalDateTime fechaCalificacion) {
		this.fechaCalificacion = fechaCalificacion;
		return this;
	}
}