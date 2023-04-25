package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class SuscripcionPublicacionEntity {
    private UUID identificador;
    private PerfilEntity perfil;
    private PlanPublicacionEntity planPublicacion;


    public SuscripcionPublicacionEntity(UUID identificador, PerfilEntity perfil, PlanPublicacionEntity planPublicacion) {
        setIdentificador(identificador);
        setPerfil(perfil);
        setPlanPublicacion(planPublicacion);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PerfilEntity getPerfil() {
        return perfil;
    }

    public PlanPublicacionEntity getPlanPublicacion() {
        return planPublicacion;
    }

    public SuscripcionPublicacionEntity setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public SuscripcionPublicacionEntity setPerfil(PerfilEntity perfil) {
        this.perfil = perfil;
        return this;
    }

    public SuscripcionPublicacionEntity setPlanPublicacion(PlanPublicacionEntity planPublicacion) {
        this.planPublicacion = planPublicacion;
        return this;
    }
}
