package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public final class PalabraClavePublicacionEntity {
    private UUID identificador;
    private PublicacionEntity publicacion;
    private String palabraClave;
    public static PalabraClavePublicacionEntity DEFAULT_OBJECT = new PalabraClavePublicacionEntity();

    private PalabraClavePublicacionEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPublicacion(PublicacionEntity.getDefaultObject());
        setPalabraClave(UtilText.getDefaultValue());
    }

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

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setPublicacion(final PublicacionEntity publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.getDefaultObject());
    }

    private void setPalabraClave(final String palabraClave) {
        this.palabraClave = UtilText.applyTrim(palabraClave);
    }
    public static PalabraClavePublicacionEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
