package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public final class RevisorEntity {
    private UUID identificador;
    private PersonaEntity datosPersona;
    private EstadoEntity estado;
    public static RevisorEntity DEFAULT_OBJECT = new RevisorEntity();

    private RevisorEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setDatosPersona(PersonaEntity.getDefaultObject());
        setEstado(EstadoEntity.getDefaultObject());
    }
    public RevisorEntity(UUID identificador, PersonaEntity datosPersona, EstadoEntity estado) {
        setIdentificador(identificador);
        setDatosPersona(datosPersona);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PersonaEntity getDatosPersona() {
        return datosPersona;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setDatosPersona(final PersonaEntity datosPersona) {
        this.datosPersona = UtilObject.getDefault(datosPersona, PersonaEntity.getDefaultObject());
    }

    private void setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }
    public static RevisorEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
