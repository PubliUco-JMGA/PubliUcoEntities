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
    public static PublicacionEntity DEFAULT_OBJECT = new PublicacionEntity();

    private PublicacionEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setCategoria(CategoriaEntity.getDefaultObject());
        setTipoAcceso(TipoAccesoEntity.getDefaultObject());
        setFechaPublicacion(UtilDate.getDefaultValue());
        setVersionPublicada(VersionEntity.getDefaultObject());
        setEstado(EstadoEntity.getDefaultObject());
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

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setCategoria(final CategoriaEntity categoria) {
        this.categoria = UtilObject.getDefault(categoria, CategoriaEntity.getDefaultObject());
    }

    private void setTipoAcceso(final TipoAccesoEntity tipoAcceso) {
        this.tipoAcceso = UtilObject.getDefault(tipoAcceso, TipoAccesoEntity.getDefaultObject());
    }

    private void setFechaPublicacion(final LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = UtilDate.getDefault(fechaPublicacion);
    }

    private void setVersionPublicada(final VersionEntity versionPublicada) {
        this.versionPublicada = UtilObject.getDefault(versionPublicada, VersionEntity.getDefaultObject());
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }
    public static PublicacionEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
