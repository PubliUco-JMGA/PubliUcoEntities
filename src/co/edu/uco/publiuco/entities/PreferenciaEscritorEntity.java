package co.edu.uco.publiuco.entities;

import java.util.UUID;

public class PreferenciaEscritorEntity {
    private UUID identificador;
    private PerfilEntity perfil;
    private EscritorEntity escritor;


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

    private void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    private void setPerfil(PerfilEntity perfil) {
        this.perfil = perfil;
    }

    private void setEscritor(EscritorEntity escritor) {
        this.escritor = escritor;
    }
}
