package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class PerfilEntity {
    private UUID identificador;
    private LectorEntity lector;
    private RespuestaEntity deseaRecibirRecomendacionesDeCategoria;
    private RespuestaEntity deseaRecibirRecomendacionesDeAutor;
    public static PerfilEntity DEFAULT_OBJECT = new PerfilEntity();

    private PerfilEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setLector(LectorEntity.getDefaultObject());
        setDeseaRecibirRecomendacionesDeCategoria(RespuestaEntity.getDefaultObject());
        setDeseaRecibirRecomendacionesDeAutor(RespuestaEntity.getDefaultObject());
    }

    public PerfilEntity(UUID identificador, LectorEntity lector, RespuestaEntity deseaRecibirRecomendacionesDeCategoria, RespuestaEntity deseaRecibirRecomendacionesDeAutor) {
       super();
       setIdentificador(identificador);
       setLector(lector);
       setDeseaRecibirRecomendacionesDeCategoria(deseaRecibirRecomendacionesDeCategoria);
       setDeseaRecibirRecomendacionesDeAutor(deseaRecibirRecomendacionesDeAutor);
    }

    public UUID getIdentificador(){
        return identificador;
    }

    public LectorEntity getLector() {
        return lector;
    }

    public RespuestaEntity getDeseaRecibirRecomendacionesDeCategoria() {
        return deseaRecibirRecomendacionesDeCategoria;
    }

    public RespuestaEntity getDeseaRecibirRecomendacionesDeAutor() {
        return deseaRecibirRecomendacionesDeAutor;
    }

    public PerfilEntity setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    private void setLector(final LectorEntity lector) {
        this.lector = UtilObject.getDefault(lector, LectorEntity.getDefaultObject());
    }

    private void setDeseaRecibirRecomendacionesDeCategoria(final RespuestaEntity deseaRecibirRecomendacionesDeCategoria) {
        this.deseaRecibirRecomendacionesDeCategoria = UtilObject.getDefault(deseaRecibirRecomendacionesDeCategoria, RespuestaEntity.getDefaultObject());
    }

    private void setDeseaRecibirRecomendacionesDeAutor(final RespuestaEntity deseaRecibirRecomendacionesDeAutor) {
        this.deseaRecibirRecomendacionesDeAutor = UtilObject.getDefault(deseaRecibirRecomendacionesDeAutor, RespuestaEntity.getDefaultObject());
    }
    public static PerfilEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
