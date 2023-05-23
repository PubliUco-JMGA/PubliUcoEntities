package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class SuscripcionCategoriaEntity {
    private UUID identificador;
    private PerfilEntity perfil;
    private PlanCategoriaEntity planCategoria;

    private SuscripcionCategoriaEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setPerfil(PerfilEntity.create());
        setPlanCategoria(PlanCategoriaEntity.create());
    }

    public SuscripcionCategoriaEntity(UUID identificador, PerfilEntity perfil, PlanCategoriaEntity planCategoria) {
        setIdentificador(identificador);
        setPerfil(perfil);
        setPlanCategoria(planCategoria);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PerfilEntity getPerfil() {
        return perfil;
    }

    public PlanCategoriaEntity getPlanCategoria() {
        return planCategoria;
    }

    public SuscripcionCategoriaEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public SuscripcionCategoriaEntity setPerfil(final PerfilEntity perfil) {
        this.perfil = UtilObject.getDefault(perfil, PerfilEntity.create());
        return this;
    }

    public SuscripcionCategoriaEntity setPlanCategoria(final PlanCategoriaEntity planCategoria) {
        this.planCategoria = UtilObject.getDefault(planCategoria, PlanCategoriaEntity.create());
        return this;
    }
    public static SuscripcionCategoriaEntity create (){
        return new SuscripcionCategoriaEntity();
    }
}
