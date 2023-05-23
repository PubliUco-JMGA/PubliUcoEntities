package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class SuscripcionPublicacionEntity {
    private UUID identificador;
    private PerfilEntity perfil;
    private PlanPublicacionEntity planPublicacion;

    private SuscripcionPublicacionEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setPerfil(PerfilEntity.create());
        setPlanPublicacion(PlanPublicacionEntity.create());
    }
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

    public SuscripcionPublicacionEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public SuscripcionPublicacionEntity setPerfil(final PerfilEntity perfil) {
        this.perfil = UtilObject.getDefault(perfil, PerfilEntity.create());
        return this;
    }

    public SuscripcionPublicacionEntity setPlanPublicacion(final PlanPublicacionEntity planPublicacion) {
        this.planPublicacion = UtilObject.getDefault(planPublicacion, PlanPublicacionEntity.create());
        return this;
    }
    public static SuscripcionPublicacionEntity create (){
        return new SuscripcionPublicacionEntity();
    }
}
