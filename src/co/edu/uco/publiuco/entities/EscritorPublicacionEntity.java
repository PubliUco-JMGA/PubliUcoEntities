package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class EscritorPublicacionEntity {
    private UUID identificador;
    private PublicacionEntity publicacion;
    private EscritorEntity escritor;
    private TipoEscritorEntity tipo;

    private EscritorPublicacionEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPublicacion(PublicacionEntity.create());
        setEscritor(EscritorEntity.create());
        setTipo(TipoEscritorEntity.create());
    }

    public EscritorPublicacionEntity(UUID identificador, PublicacionEntity publicacion, EscritorEntity escritor, TipoEscritorEntity tipo) {
        super();
        setIdentificador(identificador);
        setPublicacion(publicacion);
        setEscritor(escritor);
        setTipo(tipo);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PublicacionEntity getPublicacion() {
        return publicacion;
    }

    public EscritorEntity getEscritor() {
        return escritor;
    }

    public TipoEscritorEntity getTipo() {
        return tipo;
    }

    public EscritorPublicacionEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public EscritorPublicacionEntity setPublicacion(final PublicacionEntity publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.create());
        return this;
    }

    public EscritorPublicacionEntity setEscritor(final EscritorEntity escritor) {
        this.escritor = UtilObject.getDefault(escritor, EscritorEntity.create());
        return this;
    }

    public EscritorPublicacionEntity setTipo(final TipoEscritorEntity tipoEscritor) {
        this.tipo = UtilObject.getDefault(tipoEscritor, TipoEscritorEntity.create());
        return this;
    }
    public static EscritorPublicacionEntity create (){
        return new EscritorPublicacionEntity();
    }
}
