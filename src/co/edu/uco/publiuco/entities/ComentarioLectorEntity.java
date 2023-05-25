package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilBoolean;
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
	 private boolean tienePadre;
	private String contenido;
	private LocalDateTime fechaComentario;
	private EstadoEntity estado;
	private static final ComentarioLectorEntity PADRE = new ComentarioLectorEntity(UtilUUID.generateNewUUID(),LectorEntity.create(),PublicacionEntity.create(),null,UtilText.getDefaultValue(),UtilDate.getDefaultValue(),EstadoEntity.create(),UtilBoolean.getDefaultValue());


	private ComentarioLectorEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultValue());
		setLector(LectorEntity.create());
		setPublicacion(PublicacionEntity.create());
		setComentarioPadre(PADRE);
		setContenido(UtilText.getDefaultValue());
		setFechaComentario(UtilDate.getDefaultValue());
		setEstado(EstadoEntity.create() );
		setTienePadre(UtilBoolean.getDefaultValue());
	}


	public ComentarioLectorEntity(UUID identificador, LectorEntity lector, PublicacionEntity publicacion, ComentarioLectorEntity comentarioPadre, String contenido, LocalDateTime fechaCalificacion, EstadoEntity estado,boolean tienePadre) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setComentarioPadre(comentarioPadre);
		setPublicacion(publicacion);
		setContenido(contenido);
		setFechaComentario(fechaCalificacion);
		setEstado(estado);
		setTienePadre(tienePadre);
	}



	public boolean tienePadre() {
		return tienePadre;
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

	public LocalDateTime getFechaComentario() {
		return fechaComentario;
	}

	public EstadoEntity getEstado() {
		return estado;
	}

	public ComentarioLectorEntity setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public ComentarioLectorEntity setLector(final LectorEntity lector) {
		this.lector = UtilObject.getDefault(lector, LectorEntity.create());
		return this;
	}

	public ComentarioLectorEntity setPublicacion(final PublicacionEntity publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.create());
		return this;
	}

	public ComentarioLectorEntity setComentarioPadre(final ComentarioLectorEntity comentarioPadre) {
		if(tienePadre()) {
			this.comentarioPadre = UtilObject.getDefault(comentarioPadre, ComentarioLectorEntity.create());
		}else {
			this.comentarioPadre = (ComentarioLectorEntity) UtilObject.getNullValue();
		}
		return this;
	}

	public ComentarioLectorEntity setEstado(final EstadoEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
		return this;
	}

	public ComentarioLectorEntity setContenido(final String cotenido) {
		this.contenido = UtilText.applyTrim(cotenido);
		return this;
	}

	public ComentarioLectorEntity setFechaComentario(final LocalDateTime fechaComentario) {
		this.fechaComentario = UtilDate.getDefault(fechaComentario);
		return this;
	}


	public ComentarioLectorEntity setTienePadre(boolean tienePadre) {
		this.tienePadre = UtilBoolean.getDefault(tienePadre);
		return this;
	}

	public static ComentarioLectorEntity create() {
		return new ComentarioLectorEntity();
	}
}