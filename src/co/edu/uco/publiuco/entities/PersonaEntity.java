package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

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
    private PaisEntity indicadorPais;
    private String numeroTelefonoMovil;
    private EstadoEntity estado;
    private TipoRelacionInstitucionEntity tipoRelacionInstitucion;
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
        setIndicadorPais(PaisEntity.getDefaultObject());
        setNumeroTelefonoMovil(UtilText.getDefaultValue());
        setEstado(EstadoEntity.getDefaultObject());
    }

    public PersonaEntity(UUID identificador, TipoIdentificacionEntity tipoIdentificacionDTO, String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String correoElectronico, PaisEntity indicadorPais, String numeroTelefonoMovil, EstadoEntity estado, TipoRelacionInstitucionEntity tipoRelacionInstitucion) {
        super();
        setIdentificador(identificador);
        setTipoIdentificacionDTO(tipoIdentificacionDTO);
        setNumeroIdentificacion(numeroIdentificacion);
        setPrimerNombre(primerNombre);
        setSegundoNombre(segundoNombre);
        setPrimerApellido(primerApellido);
        setSegundoApellido(segundoApellido);
        setCorreoElectronico(correoElectronico);
        setIndicadorPais(indicadorPais);
        setNumeroTelefonoMovil(numeroTelefonoMovil);
        setTipoRelacionInstitucion(tipoRelacionInstitucion);
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

    public PaisEntity getIndicadorPais() {
        return indicadorPais;
    }

    public String getNumeroTelefonoMovil() {
        return numeroTelefonoMovil;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public TipoRelacionInstitucionEntity getTipoRelacionInstitucion() {
        return tipoRelacionInstitucion;
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

    private void setIndicadorPais(final PaisEntity indicadorPais) {
        this.indicadorPais = UtilObject.getDefault(indicadorPais, PaisEntity.getDefaultObject());
    }

    private void setNumeroTelefonoMovil(final String numeroTelefonoMovil) {
        this.numeroTelefonoMovil = UtilText.applyTrim(numeroTelefonoMovil);
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }

    private void setTipoRelacionInstitucion(TipoRelacionInstitucionEntity tipoRelacionInstitucion) {
        this.tipoRelacionInstitucion = UtilObject.getDefault(tipoRelacionInstitucion, TipoRelacionInstitucionEntity.getDefaultObject());
    }
    public static PersonaEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
