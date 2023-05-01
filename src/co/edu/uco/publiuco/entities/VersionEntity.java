package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.*;

import java.time.LocalDateTime;
import java.util.UUID;

public final class VersionEntity {
    private UUID identificador;
    private PublicacionEntity publicacion;
    private VersionEntity versionAnterior;
    private Integer numeroVersion;
    private LocalDateTime fechaCreacion;
    private LocalDateTime ultimaFechaModificacion;
    private String titulo;
    private String resumen;
    private String cuerpo;
    private EstadoEntity estado;

    public static VersionEntity DEFAULT_OBJECT = new VersionEntity();


    private VersionEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setPublicacion(PublicacionEntity.getDefaultObject());
        setVersionAnterior(getDefaultObject());
        setNumeroVersion(UtilNumber.getIntegerDefaultValue());
        setFechaCreacion(UtilDate.getDefaultValue());
        setUltimaFechaModificacion(UtilDate.getDefaultValue());
        setTitulo(UtilText.getDefaultValue());
        setResumen(UtilText.getDefaultValue());
        setCuerpo(UtilText.getDefaultValue());
        setEstado(EstadoEntity.getDefaultObject());
    }

    public VersionEntity(UUID identificador, PublicacionEntity publicacion, VersionEntity versionAnterior, int numeroVersion, LocalDateTime fechaCreacion, LocalDateTime ultimaFechaModificacion, String titulo, String resumen, String cuerpo, EstadoEntity estado) {
        setIdentificador(identificador);
        setPublicacion(publicacion);
        setVersionAnterior(versionAnterior);
        setNumeroVersion(numeroVersion);
        setFechaCreacion(fechaCreacion);
        setUltimaFechaModificacion(ultimaFechaModificacion);
        setTitulo(titulo);
        setResumen(resumen);
        setCuerpo(cuerpo);
        setEstado(estado);
    }


    public UUID getIdentificador() {
        return identificador;
    }

    public PublicacionEntity getPublicacion() {
        return publicacion;
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

    public LocalDateTime getUltimaFechaModificacion() {
        return ultimaFechaModificacion;
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

    private void setPublicacion(final PublicacionEntity publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.getDefaultObject());
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

    private void setUltimaFechaModificacion(final LocalDateTime ultimaFechaModificacion) {
        this.ultimaFechaModificacion = UtilDate.getDefault(ultimaFechaModificacion);
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
