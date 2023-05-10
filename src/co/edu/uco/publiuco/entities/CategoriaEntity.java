package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class CategoriaEntity {
    private UUID identificador;
    private CategoriaEntity categoriaPadre;
    private String nombre;
    private String descripcion;
    private EstadoEntity estado;
    public static CategoriaEntity DEFAULT_OBJECT = new CategoriaEntity();

    private CategoriaEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setCategoriaPadre(CategoriaEntity.getDefaultObject());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setEstado(EstadoEntity.getDefaultObject());
    }

    public CategoriaEntity(UUID identificador, CategoriaEntity categoriaPadre, String nombre, String descripcion, EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setCategoriaPadre(categoriaPadre);
        setNombre(nombre);
        setDescripcion(descripcion);
        setEstado(estado);
    }


    public UUID getIdentificador() {
        return identificador;
    }

    public CategoriaEntity getCategoriaPadre() {
        return categoriaPadre;
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

     private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
     }

    private void setCategoriaPadre(final CategoriaEntity categoriaPadre) {
        this.categoriaPadre = UtilObject.getDefault(categoriaPadre, CategoriaEntity.getDefaultObject());
    }

    private void setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
    }

    private void setDescripcion(final String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }
    public static CategoriaEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
