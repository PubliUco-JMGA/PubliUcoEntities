package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;

import java.util.UUID;

public class PalabraClavePublicacionEntity {
    private UUID identificador;
    private PublicacionEntity publicacion;
    private String palabraClave;


    public PalabraClavePublicacionEntity(UUID identificador, PublicacionEntity publicacion, String palabraClave) {
        super();
        setIdentificador(identificador);
        setPublicacion(publicacion);
        setPalabraClave(palabraClave);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PublicacionEntity getPublicacion() {
        return publicacion;
    }

    public String getPalabraClave() {
        return palabraClave;
    }

    private void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    private void setPublicacion(PublicacionEntity publicacion) {
        this.publicacion = publicacion;
    }

    private void setPalabraClave(String palabraClave) {
        this.palabraClave = UtilText.applyTrim(palabraClave);
    }
}
