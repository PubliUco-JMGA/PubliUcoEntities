package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class PreferenciaEscritorEntity {
    private UUID identificador;
    private PerfilEntity perfil;
    private EscritorEntity escritor;

    private PreferenciaEscritorEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setPerfil(PerfilEntity.create());
        setEscritor(EscritorEntity.create());
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

    public PreferenciaEscritorEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PreferenciaEscritorEntity setPerfil(final PerfilEntity perfil) {
        this.perfil = UtilObject.getDefault(perfil, PerfilEntity.create());
        return this;
    }

    public PreferenciaEscritorEntity setEscritor(final EscritorEntity escritor) {
        this.escritor = UtilObject.getDefault(escritor, EscritorEntity.create());
        return this;
    }
    public static PreferenciaEscritorEntity create (){
        return new PreferenciaEscritorEntity();
    }
}
