package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class PreferenciaCategoriaEntity {
    private UUID identificador;
    private PerfilEntity perfil;
    private CategoriaEntity categoria;

    private PreferenciaCategoriaEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPerfil(PerfilEntity.create());
        setCategoria(CategoriaEntity.create());
    }

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

    public PreferenciaCategoriaEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PreferenciaCategoriaEntity setPerfil(final PerfilEntity perfil) {
        this.perfil = UtilObject.getDefault(perfil, PerfilEntity.create());
        return this;
    }

    public PreferenciaCategoriaEntity setCategoria(final CategoriaEntity categoria) {
        this.categoria = UtilObject.getDefault(categoria, CategoriaEntity.create());
        return this;
    }
    public static PreferenciaCategoriaEntity create (){
        return new PreferenciaCategoriaEntity();
    }
}
