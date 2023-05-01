package co.edu.uco.publiuco.entities;


import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;


public final class EstadoEntity {

    private UUID identificador;
    private String nombre;
    private TipoEstadoEntity tipoEstado;
    public static EstadoEntity DEFAULT_OBJECT = new EstadoEntity();


    private EstadoEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setTipoEstado(TipoEstadoEntity.getDefaultObject());
    }


    public EstadoEntity(UUID identificador, String nombre, TipoEstadoEntity tipoEstado) {
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setTipoEstado(tipoEstado);
    }

    private final void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private final void setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
    }

    private final void setTipoEstado(final TipoEstadoEntity tipoEstado) {

        this.tipoEstado = UtilObject.getDefault(tipoEstado, TipoEstadoEntity.getDefaultObject());
    }

    public final UUID getIdentificador() {
        return identificador;
    }

    public final String getNombre() {
        return nombre;
    }

    public final TipoEstadoEntity getTipoEstado() {
        return tipoEstado;
    }

    public static EstadoEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
