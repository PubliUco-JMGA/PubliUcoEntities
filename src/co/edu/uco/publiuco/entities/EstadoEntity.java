package co.edu.uco.publiuco.entities;


import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;


public final class EstadoEntity {

    private UUID identificador;
    private String nombre;
    private TipoEstadoEntity tipo;
    public static EstadoEntity DEFAULT_OBJECT = new EstadoEntity();


    private EstadoEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setTipo(TipoEstadoEntity.getDefaultObject());
    }


    public EstadoEntity(UUID identificador, String nombre, TipoEstadoEntity tipo) {
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setTipo(tipo);
    }

    private final void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private final void setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
    }

    private final void setTipo(final TipoEstadoEntity tipo) {

        this.tipo = UtilObject.getDefault(tipo, TipoEstadoEntity.getDefaultObject());
    }

    public final UUID getIdentificador() {
        return identificador;
    }

    public final String getNombre() {
        return nombre;
    }

    public final TipoEstadoEntity getTipo() {
        return tipo;
    }

    public static EstadoEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
