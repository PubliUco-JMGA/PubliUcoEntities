package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public final class EscritorPublicacionEntity {
    private UUID identificador;
    private PublicacionEntity publicacion;
    private EscritorEntity escritor;
    private TipoEscritorEntity tipoEscritor;
    public static EscritorPublicacionEntity DEFAULT_OBJECT = new EscritorPublicacionEntity();

    private EscritorPublicacionEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPublicacion(PublicacionEntity.getDefaultObject());
        setEscritor(EscritorEntity.getDefaultObject());
        setTipoEscritor(TipoEscritorEntity.getDefaultObject());
    }

    public EscritorPublicacionEntity(UUID identificador, PublicacionEntity publicacion, EscritorEntity escritor, TipoEscritorEntity tipoEscritor) {
        super();
        setIdentificador(identificador);
        setPublicacion(publicacion);
        setEscritor(escritor);
        setTipoEscritor(tipoEscritor);
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

    public TipoEscritorEntity getTipoEscritor() {
        return tipoEscritor;
    }

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setPublicacion(final PublicacionEntity publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.getDefaultObject());
    }

    private void setEscritor(final EscritorEntity escritor) {
        this.escritor = UtilObject.getDefault(escritor, EscritorEntity.getDefaultObject());
    }

    private void setTipoEscritor(final TipoEscritorEntity tipoEscritor) {
        this.tipoEscritor = UtilObject.getDefault(tipoEscritor, TipoEscritorEntity.getDefaultObject());
    }
    public static EscritorPublicacionEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
