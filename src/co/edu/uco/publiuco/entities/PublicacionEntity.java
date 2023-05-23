package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilDate;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class PublicacionEntity {
    private UUID identificador;
    private CategoriaEntity categoria;
    private TipoAccesoEntity tipoAcceso;
    private LocalDateTime fechaPublicacion;
    private VersionEntity versionPublicada;
    private EstadoEntity estado;

    private PublicacionEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setCategoria(CategoriaEntity.create());
        setTipoAcceso(TipoAccesoEntity.create());
        setFechaPublicacion(UtilDate.getDefaultValue());
        setVersionPublicada(VersionEntity.create());
        setEstado(EstadoEntity.create());
    }

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

    public PublicacionEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PublicacionEntity setCategoria(final CategoriaEntity categoria) {
        this.categoria = UtilObject.getDefault(categoria, CategoriaEntity.create());
        return this;
    }

    public PublicacionEntity setTipoAcceso(final TipoAccesoEntity tipoAcceso) {
        this.tipoAcceso = UtilObject.getDefault(tipoAcceso, TipoAccesoEntity.create());
        return this;
    }

    public PublicacionEntity setFechaPublicacion(final LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = UtilDate.getDefault(fechaPublicacion);
        return this;
    }

    public PublicacionEntity setVersionPublicada(final VersionEntity versionPublicada) {
        this.versionPublicada = UtilObject.getDefault(versionPublicada, VersionEntity.create());
        return this;
    }

    public PublicacionEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
    }
    public static PublicacionEntity create (){
        return new PublicacionEntity();
    }
}
