package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public final class SuscripcionCategoriaEntity {
    private UUID identificador;
    private PerfilEntity perfil;
    private PlanCategoriaEntity planCategoria;
    public static SuscripcionCategoriaEntity DEFAULT_OBJECT = new SuscripcionCategoriaEntity();

    private SuscripcionCategoriaEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setPerfil(PerfilEntity.getDefaultObject());
        setPlanCategoria(PlanCategoriaEntity.getDefaultObject());
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

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setPerfil(final PerfilEntity perfil) {
        this.perfil = UtilObject.getDefault(perfil, PerfilEntity.getDefaultObject());
    }

    private void setPlanCategoria(final PlanCategoriaEntity planCategoria) {
        this.planCategoria = UtilObject.getDefault(planCategoria, PlanCategoriaEntity.getDefaultObject());
    }
    public static SuscripcionCategoriaEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
