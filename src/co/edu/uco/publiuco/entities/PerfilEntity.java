package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class PerfilEntity {
    private UUID identificador;
    private LectorEntity lector;
    private RespuestaEntity deseaRecibirRecomendacionesDeCategoria;
    private RespuestaEntity deseaRecibirRecomendacionesDeAutor;

    private PerfilEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setLector(LectorEntity.create());
        setDeseaRecibirRecomendacionesDeCategoria(RespuestaEntity.create());
        setDeseaRecibirRecomendacionesDeAutor(RespuestaEntity.create());
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

    public PerfilEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PerfilEntity setLector(final LectorEntity lector) {
        this.lector = UtilObject.getDefault(lector, LectorEntity.create());
        return this;
    }

    public PerfilEntity setDeseaRecibirRecomendacionesDeCategoria(final RespuestaEntity deseaRecibirRecomendacionesDeCategoria) {
        this.deseaRecibirRecomendacionesDeCategoria = UtilObject.getDefault(deseaRecibirRecomendacionesDeCategoria, RespuestaEntity.create());
        return this;
    }

    public PerfilEntity setDeseaRecibirRecomendacionesDeAutor(final RespuestaEntity deseaRecibirRecomendacionesDeAutor) {
        this.deseaRecibirRecomendacionesDeAutor = UtilObject.getDefault(deseaRecibirRecomendacionesDeAutor, RespuestaEntity.create());
        return this;
    }
    public static PerfilEntity create (){
        return new PerfilEntity();
    }
}
