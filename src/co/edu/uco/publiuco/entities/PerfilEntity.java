package co.edu.uco.publiuco.entities;

import java.util.UUID;

public class PerfilEntity {
    private UUID identificador;
    private LectorEntity lector;
    private RespuestaEntity deseaRecibirRecomendacionesDeCategoria;
    private RespuestaEntity deseaRecibirRecomendacionesDeAutor;



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

    public PerfilEntity setIdentificador(UUID identificaodr) {
        this.identificador = identificador;
        return this;
    }

    private void setLector(LectorEntity lector) {
        this.lector = lector;
    }

    private void setDeseaRecibirRecomendacionesDeCategoria(RespuestaEntity deseaRecibirRecomendacionesDeCategoria) {
        this.deseaRecibirRecomendacionesDeCategoria = deseaRecibirRecomendacionesDeCategoria;
    }

    private void setDeseaRecibirRecomendacionesDeAutor(RespuestaEntity deseaRecibirRecomendacionesDeAutor) {
        this.deseaRecibirRecomendacionesDeAutor = deseaRecibirRecomendacionesDeAutor;
    }
}
