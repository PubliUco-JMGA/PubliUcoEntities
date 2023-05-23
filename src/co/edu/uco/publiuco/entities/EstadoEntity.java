package co.edu.uco.publiuco.entities;


import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;


public final class EstadoEntity {

    private UUID identificador;
    private String nombre;
    private TipoEstadoEntity tipo;


    private EstadoEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setTipo(TipoEstadoEntity.create());
    }


    public EstadoEntity(UUID identificador, String nombre, TipoEstadoEntity tipo) {
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setTipo(tipo);
    }

    public final EstadoEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public final EstadoEntity setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public final EstadoEntity setTipo(final TipoEstadoEntity tipoEstado) {

        this.tipo = UtilObject.getDefault(tipoEstado, TipoEstadoEntity.create());
        return this;
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

    public static EstadoEntity create(){
        return new EstadoEntity();
    }
}
