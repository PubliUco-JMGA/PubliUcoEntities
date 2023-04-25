package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.dto.TipoIdentificacionEntity;

import java.util.UUID;

public class PersonaEntity {
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



    public PersonaEntity(UUID identificador, TipoIdentificacionEntity tipoIdentificacion, String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String correoElectronico, PaisEntity indicadorPais, String numeroTelefonoMovil, EstadoEntity estado, TipoRelacionInstitucionEntity tipoRelacionInstitucion) {
        super();
        setIdentificador(identificador);
        setTipoIdentificacionDTO(tipoIdentificacion);
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

    private void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    private void setTipoIdentificacionDTO(TipoIdentificacionEntity tipoIdentificacionDTO) {
        this.tipoIdentificacionDTO = tipoIdentificacionDTO;
    }

    private void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = UtilText.applyTrim(numeroIdentificacion);
    }

    private void setPrimerNombre(String primerNombre) {
        this.primerNombre = UtilText.applyTrim(primerNombre);
    }

    private void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = UtilText.applyTrim(segundoNombre);
    }

    private void setPrimerApellido(String primerApellido) {
        this.primerApellido = UtilText.applyTrim(primerApellido);
    }

    private void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = UtilText.applyTrim(segundoApellido);
    }

    private void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = UtilText.applyTrim(correoElectronico);
    }

    private void setIndicadorPais(PaisEntity indicadorPais) {
        this.indicadorPais = indicadorPais;
    }

    private void setNumeroTelefonoMovil(String numeroTelefonoMovil) {
        this.numeroTelefonoMovil = UtilText.applyTrim(numeroTelefonoMovil);
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = estado;
    }

    private void setTipoRelacionInstitucion(TipoRelacionInstitucionEntity tipoRelacionInstitucion) {
        this.tipoRelacionInstitucion = tipoRelacionInstitucion;
    }
}
