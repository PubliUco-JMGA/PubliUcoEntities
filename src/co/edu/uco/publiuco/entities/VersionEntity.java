package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.*;

import java.time.LocalDateTime;
import java.util.UUID;

public final class VersionEntity {
    private UUID identificador;
    private VersionEntity versionAnterior;
    private boolean tieneVersionAnterior;
    private Integer numeroVersion;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaUltimaModificacion;
    private String titulo;
    private String resumen;
    private String cuerpo;
    private EstadoEntity estado;

    public static final VersionEntity DEFAULT_OBJECT = new VersionEntity();


    private VersionEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setVersionAnterior(create());
        setNumeroVersion(UtilNumber.getIntegerDefaultValue());
        setFechaCreacion(UtilDate.getDefaultValue());
        setFechaUltimaModificacion(UtilDate.getDefaultValue());
        setTitulo(UtilText.getDefaultValue());
        setResumen(UtilText.getDefaultValue());
        setCuerpo(UtilText.getDefaultValue());
        setEstado(EstadoEntity.create());
        setTieneVersionAnterior(UtilBoolean.getDefaultValue());
    }

    public VersionEntity(UUID identificador, VersionEntity versionAnterior, int numeroVersion, LocalDateTime fechaCreacion, LocalDateTime fechaUltimaModificacion, String titulo, String resumen, String cuerpo, EstadoEntity estado,boolean tieneVersionAnterior) {
        setIdentificador(identificador);
        setVersionAnterior(versionAnterior);
        setNumeroVersion(numeroVersion);
        setFechaCreacion(fechaCreacion);
        setFechaUltimaModificacion(fechaUltimaModificacion);
        setTitulo(titulo);
        setResumen(resumen);
        setCuerpo(cuerpo);
        setEstado(estado);
        setTieneVersionAnterior(tieneVersionAnterior);
    }

    
    public boolean tieneVersionAnterior() {
		return tieneVersionAnterior;
	}

	private void setTieneVersionAnterior(boolean tieneVersionAnterior) {
		this.tieneVersionAnterior = UtilBoolean.getDefault(tieneVersionAnterior);
	}

	public UUID getIdentificador() {
        return identificador;
    }


    public VersionEntity getVersionAnterior() {
        return versionAnterior;
    }

    public Integer getNumeroVersion() {
        return numeroVersion;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDateTime getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public VersionEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }


    public VersionEntity setVersionAnterior(final VersionEntity versionAnterior) {
    	if(tieneVersionAnterior()) {
            this.versionAnterior = UtilObject.getDefault(versionAnterior, VersionEntity.create());
        }else {
			this.versionAnterior = (VersionEntity) UtilObject.getNullValue();
        }
    	return this;
    }

    public VersionEntity setNumeroVersion(final Integer numeroVersion) {
        this.numeroVersion = UtilNumber.getDefaultInt(numeroVersion);
        return this;
    }

    public VersionEntity setFechaCreacion(final LocalDateTime fechaCreacion) {
        this.fechaCreacion = UtilDate.getDefault(fechaCreacion);
        return this;
    }

    public VersionEntity setFechaUltimaModificacion(final LocalDateTime ultimaFechaModificacion) {
        this.fechaUltimaModificacion = UtilDate.getDefault(ultimaFechaModificacion);
        return this;
    }

    public VersionEntity setTitulo(final String titulo) {
        this.titulo = UtilText.applyTrim(titulo);
        return this;
    }

    public VersionEntity setResumen(final String resumen) {
        this.resumen = UtilText.applyTrim(resumen);
        return this;
    }

    public VersionEntity setCuerpo(final String cuerpo) {
        this.cuerpo = UtilText.applyTrim(cuerpo);
        return this;
    }

    public VersionEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
    }
    public static VersionEntity create (){
        return new VersionEntity();
    }
}
