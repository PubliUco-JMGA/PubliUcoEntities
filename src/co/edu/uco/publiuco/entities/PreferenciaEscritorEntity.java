package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public final class PreferenciaEscritorEntity {
    private UUID identificador;
    private PerfilEntity perfil;
    private EscritorEntity escritor;
    public static PreferenciaEscritorEntity DEFAULT_OBJECT = new PreferenciaEscritorEntity();

    private PreferenciaEscritorEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setPerfil(PerfilEntity.getDefaultObject());
        setEscritor(EscritorEntity.getDefaultObject());
    }
    public PreferenciaEscritorEntity(UUID identificador, PerfilEntity perfil, EscritorEntity escritor) {
        setIdentificador(identificador);
        setPerfil(perfil);
        setEscritor(escritor);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PerfilEntity getPerfil() {
        return perfil;
    }

    public EscritorEntity getEscritor() {
        return escritor;
    }

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setPerfil(final PerfilEntity perfil) {
        this.perfil = UtilObject.getDefault(perfil, PerfilEntity.getDefaultObject());
    }

    private void setEscritor(final EscritorEntity escritor) {
        this.escritor = UtilObject.getDefault(escritor, EscritorEntity.getDefaultObject());
    }
    public static PreferenciaEscritorEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
