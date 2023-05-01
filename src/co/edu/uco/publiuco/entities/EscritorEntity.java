package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public final class EscritorEntity {
    private UUID identificador;
    private PersonaEntity datosPersona;
    private TipoRelacionInstitucionEntity tipoRelacionInstitucion;
    private EstadoEntity estado;
    public static EscritorEntity DEFAULT_OBJECT = new EscritorEntity();

    private EscritorEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setDatosPersona(PersonaEntity.getDefaultObject());
        setTipoRelacionInstitucion(TipoRelacionInstitucionEntity.getDefaultObject());
        setEstado(EstadoEntity.getDefaultObject());
    }
    public EscritorEntity(UUID identificador, PersonaEntity datosPersona, TipoRelacionInstitucionEntity tipoRelacionInstitucion, EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setDatosPersona(datosPersona);
        setTipoRelacionInstitucion(tipoRelacionInstitucion);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PersonaEntity getDatosPersona() {
        return datosPersona;
    }

    public TipoRelacionInstitucionEntity getTipoRelacionInstitucion() {
        return tipoRelacionInstitucion;
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

    private void setTipoRelacionInstitucion(TipoRelacionInstitucionEntity tipoRelacionInstitucion) {
        this.tipoRelacionInstitucion = UtilObject.getDefault(tipoRelacionInstitucion, TipoRelacionInstitucionEntity.getDefaultObject());
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }
    public static EscritorEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
