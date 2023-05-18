package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class PersonaEntity {
    private UUID identificador;
    private TipoIdentificacionEntity tipoIdentificacionDTO;
    private String numeroIdentificacion;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String correoElectronico;
    private PaisEntity paisTelefono;
    private String numeroTelefono;
    private EstadoEntity estado;
    private TipoRelacionInstitucionEntity relacionInstitucion;
    public static PersonaEntity DEFAULT_OBJECT = new PersonaEntity();

    private PersonaEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setTipoIdentificacionDTO(TipoIdentificacionEntity.getDefaultObject());
        setNumeroIdentificacion(UtilText.getDefaultValue());
        setPrimerNombre(UtilText.getDefaultValue());
        setSegundoNombre(UtilText.getDefaultValue());
        setPrimerApellido(UtilText.getDefaultValue());
        setSegundoApellido(UtilText.getDefaultValue());
        setCorreoElectronico(UtilText.getDefaultValue());
        setPaisTelefono(PaisEntity.getDefaultObject());
        setNumeroTelefono(UtilText.getDefaultValue());
        setEstado(EstadoEntity.getDefaultObject());
    }

    public PersonaEntity(UUID identificador, TipoIdentificacionEntity tipoIdentificacionDTO, String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String correoElectronico, PaisEntity paisTelefono, String numeroTelefono, EstadoEntity estado, TipoRelacionInstitucionEntity relacionInstitucion) {
        super();
        setIdentificador(identificador);
        setTipoIdentificacionDTO(tipoIdentificacionDTO);
        setNumeroIdentificacion(numeroIdentificacion);
        setPrimerNombre(primerNombre);
        setSegundoNombre(segundoNombre);
        setPrimerApellido(primerApellido);
        setSegundoApellido(segundoApellido);
        setCorreoElectronico(correoElectronico);
        setPaisTelefono(paisTelefono);
        setNumeroTelefono(numeroTelefono);
        setTipoRelacionInstitucion(relacionInstitucion);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public TipoIdentificacionEntity getTipoIdentificacionDTO() {
        return tipoIdentificacionDTO;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public PaisEntity getPaisTelefono() {
        return paisTelefono;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public TipoRelacionInstitucionEntity getRelacionInstitucion() {
        return relacionInstitucion;
    }

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setTipoIdentificacionDTO(final TipoIdentificacionEntity tipoIdentificacionDTO) {
        this.tipoIdentificacionDTO = UtilObject.getDefault(tipoIdentificacionDTO, TipoIdentificacionEntity.getDefaultObject());
    }

    private void setNumeroIdentificacion(final String numeroIdentificacion) {
        this.numeroIdentificacion = UtilText.applyTrim(numeroIdentificacion);
    }

    private void setPrimerNombre(final String primerNombre) {
        this.primerNombre = UtilText.applyTrim(primerNombre);
    }

    private void setSegundoNombre(final String segundoNombre) {
        this.segundoNombre = UtilText.applyTrim(segundoNombre);
    }

    private void setPrimerApellido(final String primerApellido) {
        this.primerApellido = UtilText.applyTrim(primerApellido);
    }

    private void setSegundoApellido(final String segundoApellido) {
        this.segundoApellido = UtilText.applyTrim(segundoApellido);
    }

    private void setCorreoElectronico(final String correoElectronico) {
        this.correoElectronico = UtilText.applyTrim(correoElectronico);
    }

    private void setPaisTelefono(final PaisEntity paisTelefono) {
        this.paisTelefono = UtilObject.getDefault(paisTelefono, PaisEntity.getDefaultObject());
    }

    private void setNumeroTelefono(final String numeroTelefono) {
        this.numeroTelefono = UtilText.applyTrim(numeroTelefono);
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }

    private void setTipoRelacionInstitucion(TipoRelacionInstitucionEntity relacionInstitucion) {
        this.relacionInstitucion = UtilObject.getDefault(relacionInstitucion, TipoRelacionInstitucionEntity.getDefaultObject());
    }
    public static PersonaEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
