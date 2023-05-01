package co.edu.uco.publiuco.entities;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public final class AdministradorCategoriaEntity {
    private UUID identificador;
    private PersonaEntity datosPersona;
    private EstadoEntity estado;
    public static AdministradorCategoriaEntity DEFAULT_OBJECT = new AdministradorCategoriaEntity();
    private AdministradorCategoriaEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPersona(PersonaEntity.getDefaultObject());
        setEstado(EstadoEntity.getDefaultObject());
    }


    public AdministradorCategoriaEntity(UUID identificador, PersonaEntity persona, EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setPersona(persona);
        setEstado(estado);
    }

    private final void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private final void setPersona(final PersonaEntity datosPersona) {
        this.datosPersona = UtilObject.getDefault(datosPersona, PersonaEntity.getDefaultObject());
    }

    private final void setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }

    public final UUID getIdentificador() {
        return identificador;
    }

    public final PersonaEntity getNombre() {
        return datosPersona;
    }

    public final EstadoEntity getEstado() {
        return estado;
    }

    public static AdministradorCategoriaEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
