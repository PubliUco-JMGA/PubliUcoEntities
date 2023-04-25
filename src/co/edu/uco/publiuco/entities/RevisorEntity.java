package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class RevisorEntity {
    private UUID identificador;
    private PersonaEntity datosPersona;
    private EstadoEntity estado;


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

    public RevisorEntity setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public RevisorEntity setDatosPersona(PersonaEntity datosPersona) {
        this.datosPersona = datosPersona;
        return this;
    }

    public RevisorEntity setEstado(EstadoEntity estado) {
        this.estado = estado;
        return this;
    }
}
