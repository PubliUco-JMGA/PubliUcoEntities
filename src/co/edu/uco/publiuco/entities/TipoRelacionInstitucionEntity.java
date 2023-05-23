package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class TipoRelacionInstitucionEntity {
    private UUID identificador;
    private String nombre;
    private String descripcion;
    private EstadoEntity estado;

    private TipoRelacionInstitucionEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setEstado(EstadoEntity.create());
    }
    public TipoRelacionInstitucionEntity(UUID identificador, String nombre, String descripcion, EstadoEntity estado) {
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public TipoRelacionInstitucionEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public TipoRelacionInstitucionEntity setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public TipoRelacionInstitucionEntity setDescripcion(final String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }

    public TipoRelacionInstitucionEntity setEstado(final EstadoEntity estado) {
        this.estado = estado;
        return this;
    }
    public static TipoRelacionInstitucionEntity create (){
        return new TipoRelacionInstitucionEntity();
    }

}


