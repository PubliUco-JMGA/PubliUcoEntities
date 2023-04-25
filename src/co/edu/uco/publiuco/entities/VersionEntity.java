package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;

import java.time.LocalDateTime;
import java.util.UUID;

public class VersionEntity {
    private UUID identificador;
    private PublicacionEntity publicacion;
    private VersionEntity versionAnterior;
    private int numeroVersion;
    private LocalDateTime fechaCreacion;
    private LocalDateTime ultimaFechaModificacion;
    private String titulo;
    private String resumen;
    private String cuerpo;
    private EstadoEntity estado;

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

    public int getNumeroVersion() {
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

    private void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    private void setPublicacion(PublicacionEntity publicacion) {
        this.publicacion = publicacion;
    }

    private void setVersionAnterior(VersionEntity versionAnterior) {
        this.versionAnterior = versionAnterior;
    }

    private void setNumeroVersion(int numeroVersion) {
        this.numeroVersion = numeroVersion;
    }

    private void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    private void setUltimaFechaModificacion(LocalDateTime ultimaFechaModificacion) {
        this.ultimaFechaModificacion = ultimaFechaModificacion;
    }

    private void setTitulo(String titulo) {
        this.titulo = UtilText.applyTrim(titulo);
    }

    private void setResumen(String resumen) {
        this.resumen = UtilText.applyTrim(resumen);
    }

    private void setCuerpo(String cuerpo) {
        this.cuerpo = UtilText.applyTrim(cuerpo);
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = estado;
    }
}
