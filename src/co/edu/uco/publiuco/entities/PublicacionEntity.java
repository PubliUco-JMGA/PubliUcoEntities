package co.edu.uco.publiuco.entities;

import java.time.LocalDateTime;
import java.util.UUID;

public class PublicacionEntity {
    private UUID identificador;
    private CategoriaEntity categoria;
    private TipoAccesoEntity tipoAcceso;
    private LocalDateTime fechaPublicacion;
    private VersionEntity versionPublicada;
    private EstadoEntity estado;


    public PublicacionEntity(UUID identificador, CategoriaEntity categoria, TipoAccesoEntity tipoAcceso, LocalDateTime fechaPublicacion, VersionEntity versionPublicada, EstadoEntity estado) {
        setIdentificador(identificador);
        setCategoria(categoria);
        setTipoAcceso(tipoAcceso);
        setFechaPublicacion(fechaPublicacion);
        setVersionPublicada(versionPublicada);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public CategoriaEntity getCategoria() {
        return categoria;
    }

    public TipoAccesoEntity getTipoAcceso() {
        return tipoAcceso;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public VersionEntity getVersionPublicada() {
        return versionPublicada;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    private void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    private void setCategoria(CategoriaEntity categoria) {
        this.categoria = categoria;
    }

    private void setTipoAcceso(TipoAccesoEntity tipoAcceso) {
        this.tipoAcceso = tipoAcceso;
    }

    private void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    private void setVersionPublicada(VersionEntity versionPublicada) {
        this.versionPublicada = versionPublicada;
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = estado;
    }
}
