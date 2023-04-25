package co.edu.uco.publiuco.entities;

import java.util.UUID;

public class SuscripcionCategoriaEntity {
    private UUID identificador;
    private PerfilEntity perfil;
    private PlanCategoriaEntity planCategoria;


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

    private void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    private void setPerfil(PerfilEntity perfil) {
        this.perfil = perfil;
    }

    private void setPlanCategoria(PlanCategoriaEntity planCategoria) {
        this.planCategoria = planCategoria;
    }
}
