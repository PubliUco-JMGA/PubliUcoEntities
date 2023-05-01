package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class LectorEntity {
    private UUID identificador;
    private PersonaEntity datosPersona;
    private EstadoEntity estado;
    public static LectorEntity DEFAULT_OBJECT= new LectorEntity();

    private LectorEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setDatosPersona(PersonaEntity.getDefaultObject());
        setEstado(EstadoEntity.getDefaultObject());
    }

    public LectorEntity(UUID identificador, PersonaEntity datosPersona, EstadoEntity estado) {
        super();
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

    public LectorEntity setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    private void setDatosPersona(PersonaEntity datosPersona) {
        this.datosPersona = UtilObject.getDefault(datosPersona, PersonaEntity.getDefaultObject());
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }
    public static LectorEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
