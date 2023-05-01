package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public final class SuscripcionPublicacionEntity {
    private UUID identificador;
    private PerfilEntity perfil;
    private PlanPublicacionEntity planPublicacion;
    public static SuscripcionPublicacionEntity DEFAULT_OBJECT = new SuscripcionPublicacionEntity();

    private SuscripcionPublicacionEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setPerfil(PerfilEntity.getDefaultObject());
        setPlanPublicacion(PlanPublicacionEntity.getDefaultObject());
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

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setPerfil(PerfilEntity perfil) {
        this.perfil = UtilObject.getDefault(perfil, PerfilEntity.getDefaultObject());
    }

    private void setPlanPublicacion(final PlanPublicacionEntity planPublicacion) {
        this.planPublicacion = UtilObject.getDefault(planPublicacion, PlanPublicacionEntity.getDefaultObject());
    }
    public static SuscripcionPublicacionEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
