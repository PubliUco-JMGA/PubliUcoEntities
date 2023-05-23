package co.edu.uco.publiuco.entities;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class AdministradorCategoriaEntity {
    private UUID identificador;
    private PersonaEntity datosPersona;
    private EstadoEntity estado;
    private AdministradorCategoriaEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPersona(PersonaEntity.create());
        setEstado(EstadoEntity.create());
    }
    
    public AdministradorCategoriaEntity(UUID identificador, PersonaEntity persona, EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setPersona(persona);
        setEstado(estado);
    }

    public final AdministradorCategoriaEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public final AdministradorCategoriaEntity setPersona(final PersonaEntity datosPersona) {
        this.datosPersona = UtilObject.getDefault(datosPersona, PersonaEntity.create());
        return this;
    }

    public final AdministradorCategoriaEntity setEstado(final EstadoEntity estado) {

        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
    }

    public final UUID getIdentificador() {
        return identificador;
    }

    public final PersonaEntity getPersona() {
        return datosPersona;
    }

    public final EstadoEntity getEstado() {
        return estado;
    }

    public static AdministradorCategoriaEntity create(){
        return new AdministradorCategoriaEntity();
    }
}
