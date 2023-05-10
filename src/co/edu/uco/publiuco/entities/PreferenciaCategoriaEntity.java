package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class PreferenciaCategoriaEntity {
    private UUID identificador;
    private PerfilEntity perfil;
    private CategoriaEntity categoria;
    public static PreferenciaCategoriaEntity DEFAULT_OBJECT = new PreferenciaCategoriaEntity();

    private PreferenciaCategoriaEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPerfil(PerfilEntity.getDefaultObject());
        setCategoria(CategoriaEntity.getDefaultObject());
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

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setPerfil(final PerfilEntity perfil) {
        this.perfil = UtilObject.getDefault(perfil, PerfilEntity.getDefaultObject());
    }

    private void setCategoria(final CategoriaEntity categoria) {
        this.categoria = UtilObject.getDefault(categoria, CategoriaEntity.getDefaultObject());
    }
    public static PreferenciaCategoriaEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
