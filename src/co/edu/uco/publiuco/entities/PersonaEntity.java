package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class PersonaEntity {
    private UUID identificador;
    private TipoIdentificacionEntity tipoIdentificacion;
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

    private PersonaEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setTipoIdentificacion(TipoIdentificacionEntity.create());
        setNumeroIdentificacion(UtilText.getDefaultValue());
        setPrimerNombre(UtilText.getDefaultValue());
        setSegundoNombre(UtilText.getDefaultValue());
        setPrimerApellido(UtilText.getDefaultValue());
        setSegundoApellido(UtilText.getDefaultValue());
        setCorreoElectronico(UtilText.getDefaultValue());
        setPaisTelefono(PaisEntity.create());
        setNumeroTelefono(UtilText.getDefaultValue());
        setEstado(EstadoEntity.create());
    }

    public PersonaEntity(UUID identificador, TipoIdentificacionEntity tipoIdentificacionDTO, String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String correoElectronico, PaisEntity paisTelefono, String numeroTelefono, EstadoEntity estado, TipoRelacionInstitucionEntity relacionInstitucion) {
        super();
        setIdentificador(identificador);
        setTipoIdentificacion(tipoIdentificacionDTO);
        setNumeroIdentificacion(numeroIdentificacion);
        setPrimerNombre(primerNombre);
        setSegundoNombre(segundoNombre);
        setPrimerApellido(primerApellido);
        setSegundoApellido(segundoApellido);
        setCorreoElectronico(correoElectronico);
        setPaisTelefono(paisTelefono);
        setNumeroTelefono(numeroTelefono);
        setRelacionInstitucion(relacionInstitucion);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public TipoIdentificacionEntity getTipoIdentificacionDTO() {
        return tipoIdentificacion;
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

    public PersonaEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PersonaEntity setTipoIdentificacion(final TipoIdentificacionEntity tipoIdentificacion) {
        this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionEntity.create());
        return this;
    }

    public PersonaEntity setNumeroIdentificacion(final String numeroIdentificacion) {
        this.numeroIdentificacion = UtilText.applyTrim(numeroIdentificacion);
        return this;
    }

    public PersonaEntity setPrimerNombre(final String primerNombre) {
        this.primerNombre = UtilText.applyTrim(primerNombre);
        return this;
    }

    public PersonaEntity setSegundoNombre(final String segundoNombre) {
        this.segundoNombre = UtilText.applyTrim(segundoNombre);
        return this;
    }

    public PersonaEntity setPrimerApellido(final String primerApellido) {
        this.primerApellido = UtilText.applyTrim(primerApellido);
        return this;
    }

    public PersonaEntity setSegundoApellido(final String segundoApellido) {
        this.segundoApellido = UtilText.applyTrim(segundoApellido);
        return this;
    }

    public PersonaEntity setCorreoElectronico(final String correoElectronico) {
        this.correoElectronico = UtilText.applyTrim(correoElectronico);
        return this;
    }

    public PersonaEntity setPaisTelefono(final PaisEntity paisTelefono) {
        this.paisTelefono = UtilObject.getDefault(paisTelefono, PaisEntity.create());
        return this;
    }

    public PersonaEntity setNumeroTelefono(final String numeroTelefonoMovil) {
        this.numeroTelefono = UtilText.applyTrim(numeroTelefonoMovil);
        return this;
    }

    public PersonaEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
    }

    public PersonaEntity setRelacionInstitucion(final TipoRelacionInstitucionEntity relacionInstitucion) {
        this.relacionInstitucion = UtilObject.getDefault(relacionInstitucion, TipoRelacionInstitucionEntity.create());
        return this;
    }
    public static PersonaEntity create (){
        return new PersonaEntity();
    }
}
