package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class TipoEscritorEntity {
    private UUID identificador;
    private String nombre;
    private String descripcion;
    private EstadoEntity estado;

    private TipoEscritorEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setEstado(EstadoEntity.create());
    }
    public TipoEscritorEntity(UUID identificador, String nombre, String descripcion, EstadoEntity estado) {
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
    public TipoEscritorEntity  setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public TipoEscritorEntity  setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public TipoEscritorEntity  setDescripcion(final String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }

    public TipoEscritorEntity  setEstado(final EstadoEntity  estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity .create());
        return this;
    }
    
    public static TipoEscritorEntity create (){
        return new TipoEscritorEntity();
    }

}

