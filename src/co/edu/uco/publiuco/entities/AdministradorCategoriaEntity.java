package co.edu.uco.publiuco.entities;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public final class AdministradorCategoriaEntity {
    private UUID identificador;
    private PersonaEntity datosPersona;
    private EstadoEntity estado;

    public AdministradorCategoriaEntity(UUID identificador, PersonaEntity persona, EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setPersona(persona);
        setEstado(estado);
    }

    private final AdministradorCategoriaEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    private final AdministradorCategoriaEntity setPersona(final PersonaEntity datosPersona) {
        this.datosPersona = datosPersona;
        return this;
    }

    private final AdministradorCategoriaEntity setEstado(final EstadoEntity estado) {

        this.estado = estado;
        return this;
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



}
