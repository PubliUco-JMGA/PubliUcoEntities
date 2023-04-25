package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class CategoriaEntity {
    private UUID identificador;
    private CategoriaEntity categoriaPadre;
    private String nombre;
    private String descripcion;
    private EstadoEntity estado;

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

    private CategoriaEntity setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    private CategoriaEntity setCategoriaPadre(CategoriaEntity categoriaPadre) {
        this.categoriaPadre = categoriaPadre;
        return this;
    }

    private CategoriaEntity setNombre(String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    private CategoriaEntity setDescripcion(String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }

    private CategoriaEntity setEstado(EstadoEntity estado) {
        this.estado = estado;
        return this;
    }
}
