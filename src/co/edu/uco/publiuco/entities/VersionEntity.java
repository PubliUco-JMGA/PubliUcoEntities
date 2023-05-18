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
        setVersionAnterior(getDefaultObject());
        setNumeroVersion(UtilNumber.getIntegerDefaultValue());
        setFechaCreacion(UtilDate.getDefaultValue());
        setFechaUltimaModificacion(UtilDate.getDefaultValue());
        setTitulo(UtilText.getDefaultValue());
        setResumen(UtilText.getDefaultValue());
        setCuerpo(UtilText.getDefaultValue());
        setEstado(EstadoEntity.getDefaultObject());
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

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setVersionAnterior(VersionEntity versionAnterior) {
        this.versionAnterior = UtilObject.getDefault(versionAnterior, VersionEntity.getDefaultObject());
    }

    private void setNumeroVersion(final Integer numeroVersion) {
        this.numeroVersion = UtilNumber.getDefaultInt(numeroVersion);
    }

    private void setFechaCreacion(final LocalDateTime fechaCreacion) {
        this.fechaCreacion = UtilDate.getDefault(fechaCreacion);
    }

    private void setFechaUltimaModificacion(final LocalDateTime fechaUltimaModificacion) {
        this.fechaUltimaModificacion = UtilDate.getDefault(fechaUltimaModificacion);
    }

    private void setTitulo(final String titulo) {
        this.titulo = UtilText.applyTrim(titulo);	
    }

    private void setResumen(final String resumen) {
        this.resumen = UtilText.applyTrim(resumen);
    }

    private void setCuerpo(final String cuerpo) {
        this.cuerpo = UtilText.applyTrim(cuerpo);
    }

    private void setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }
    public static VersionEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
