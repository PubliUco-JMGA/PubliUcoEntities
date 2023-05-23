package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class LectorEntity {
    private UUID identificador;
    private PersonaEntity datosPersona;
    private EstadoEntity estado;

    private LectorEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setDatosPersona(PersonaEntity.create());
        setEstado(EstadoEntity.create());
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

    public LectorEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public LectorEntity setDatosPersona(final PersonaEntity datosPersona) {
        this.datosPersona = UtilObject.getDefault(datosPersona, PersonaEntity.create());
        return this;
    }

    public LectorEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
    }
    public static LectorEntity create (){
        return new LectorEntity();
    }
}
