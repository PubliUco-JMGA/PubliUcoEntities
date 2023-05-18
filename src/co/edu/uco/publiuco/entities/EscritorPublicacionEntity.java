package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class EscritorPublicacionEntity {
    private UUID identificador;
    private PublicacionEntity publicacion;
    private EscritorEntity escritor;
    private TipoEscritorEntity tipo;
    public static EscritorPublicacionEntity DEFAULT_OBJECT = new EscritorPublicacionEntity();

    private EscritorPublicacionEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPublicacion(PublicacionEntity.getDefaultObject());
        setEscritor(EscritorEntity.getDefaultObject());
        setTipo(TipoEscritorEntity.getDefaultObject());
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

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setPublicacion(final PublicacionEntity publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.getDefaultObject());
    }

    private void setEscritor(final EscritorEntity escritor) {
        this.escritor = UtilObject.getDefault(escritor, EscritorEntity.getDefaultObject());
    }

    private void setTipo(final TipoEscritorEntity tipo) {
        this.tipo = UtilObject.getDefault(tipo, TipoEscritorEntity.getDefaultObject());
    }
    public static EscritorPublicacionEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
