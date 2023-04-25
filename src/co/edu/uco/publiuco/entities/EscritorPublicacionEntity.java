package co.edu.uco.publiuco.entities;

import java.util.UUID;

public class EscritorPublicacionEntity {
    private UUID identificador;
    private PublicacionEntity publicacion;
    private EscritorEntity escritor;
    private TipoEscritorEntity tipoEscritor;


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

    private void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    private void setPublicacion(PublicacionEntity publicacion) {
        this.publicacion = publicacion;
    }

    private void setEscritor(EscritorEntity escritor) {
        this.escritor = escritor;
    }

    private void setTipoEscritor(TipoEscritorEntity tipoEscritor) {
        this.tipoEscritor = tipoEscritor;
    }
}
