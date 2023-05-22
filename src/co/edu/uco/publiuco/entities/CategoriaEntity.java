package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilBoolean;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class CategoriaEntity {
    private UUID identificador;
    private CategoriaEntity categoriaPadre;
    private boolean tienePadre;
    private String nombre;
    private String descripcion;
    private EstadoEntity estado;
    public static final CategoriaEntity DEFAULT_OBJECT = new CategoriaEntity();

    private CategoriaEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setCategoriaPadre(CategoriaEntity.getDefaultObject());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setEstado(EstadoEntity.getDefaultObject());
    }

    public CategoriaEntity(UUID identificador, CategoriaEntity categoriaPadre, String nombre, String descripcion, EstadoEntity estado, boolean tienePadre) {
        super();
        setIdentificador(identificador);
        setCategoriaPadre(categoriaPadre);
        setNombre(nombre);
        setDescripcion(descripcion);
        setEstado(estado);
    }


    public boolean tienePadre() {
		return tienePadre;
	}

	public void setTienePadre(boolean tienePadre) {
		this.tienePadre = UtilBoolean.getDefault(tienePadre);
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
    	if(tienePadre()) {
            this.categoriaPadre = UtilObject.getDefault(categoriaPadre, getDefaultObject());
        }else {
			this.categoriaPadre = (CategoriaEntity) UtilObject.getDefaultValue();
        }  
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
