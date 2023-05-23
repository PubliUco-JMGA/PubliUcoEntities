package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class PalabraClavePublicacionEntity {
    private UUID identificador;
    private PublicacionEntity publicacion;
    private String palabraClave;

    private PalabraClavePublicacionEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPublicacion(PublicacionEntity.create());
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

    public PalabraClavePublicacionEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PalabraClavePublicacionEntity setPublicacion(final PublicacionEntity publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion,PublicacionEntity.create());
        return this;
    }

    public PalabraClavePublicacionEntity setPalabraClave(final String palabraClave) {
        this.palabraClave = UtilText.applyTrim(palabraClave);
        return this;
    }
    public static PalabraClavePublicacionEntity create (){
        return new PalabraClavePublicacionEntity();
    }
}
