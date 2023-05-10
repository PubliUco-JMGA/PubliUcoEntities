package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilDate;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;
public final class ComentarioLectorEntity {

	private UUID identificador;
	private LectorEntity lector;
	private PublicacionEntity publicacion;
	private ComentarioLectorEntity comentarioPadre;
	private String contenido;
	private LocalDateTime fechaCalificacion;
	private EstadoEntity estado;
	public static ComentarioLectorEntity DEFAULT_OBJECT = new ComentarioLectorEntity();


	private ComentarioLectorEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultValue());
		setLector(LectorEntity.getDefaultObject());
		setPublicacion(PublicacionEntity.getDefaultObject());
		setComentarioPadre(getDefaultObject());
		setContenido(UtilText.getDefaultValue());
		setFechaCalificacion(UtilDate.getDefaultValue());
		setEstado(EstadoEntity.getDefaultObject() );
	}


	public ComentarioLectorEntity(UUID identificador, LectorEntity lector, PublicacionEntity publicacion, ComentarioLectorEntity comentarioPadre, String contenido, LocalDateTime fechaCalificacion, EstadoEntity estado) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setComentarioPadre(comentarioPadre);
		setPublicacion(publicacion);
		setContenido(contenido);
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
		return contenido;
	}

	public LocalDateTime getFechaCalificacion() {
		return fechaCalificacion;
	}

	public EstadoEntity getEstado() {
		return estado;
	}

	private void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	private void setLector(final LectorEntity lector) {
		this.lector = UtilObject.getDefault(lector, LectorEntity.getDefaultObject());
	}

	private void setPublicacion(final PublicacionEntity publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.getDefaultObject());
	}

	private void setComentarioPadre(final ComentarioLectorEntity comentarioPadre) {
		this.comentarioPadre = UtilObject.getDefault(comentarioPadre, ComentarioLectorEntity.getDefaultObject());
	}

	private void setEstado(final EstadoEntity estado) {
		this.estado = estado;
	}

	private void setContenido(final String contenido) {
		this.contenido = contenido;
	}

	private void setFechaCalificacion(final LocalDateTime fechaCalificacion) {
		this.fechaCalificacion = fechaCalificacion;
	}

	public static ComentarioLectorEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
}