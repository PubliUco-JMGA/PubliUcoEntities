package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class LectorEntity {
    private UUID identificador;
    private PersonaEntity datosPersona;
    private EstadoEntity estado;


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

    private void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    private void setDatosPersona(PersonaEntity datosPersona) {
        this.datosPersona = datosPersona;
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = estado;
    }
}
