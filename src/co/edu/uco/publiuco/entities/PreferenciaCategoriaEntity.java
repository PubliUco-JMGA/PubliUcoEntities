package co.edu.uco.publiuco.entities;

import java.util.UUID;

public class PreferenciaCategoriaEntity {
    private UUID identificador;
    private PerfilEntity perfil;
    private CategoriaEntity categoria;



    public PreferenciaCategoriaEntity(UUID identificador, PerfilEntity perfil, CategoriaEntity categoria) {
     super();
     setIdentificador(identificador);
     setPerfil(perfil);
     setCategoria(categoria);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PerfilEntity getPerfil() {
        return perfil;
    }

    public CategoriaEntity getCategoria() {
        return categoria;
    }

    private void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    private void setPerfil(PerfilEntity perfil) {
        this.perfil = perfil;
    }

    private void setCategoria(CategoriaEntity categoria) {
        this.categoria = categoria;
    }
}
