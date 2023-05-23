package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;
public final class CategoriaAdministradorCategoriaEntity {

	private UUID identificador;
	private CategoriaEntity categoria;
	private AdministradorCategoriaEntity administradorCategoria;

	private CategoriaAdministradorCategoriaEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultValue());
		setCategoria(CategoriaEntity.create());
		setAdministradorCategoria(AdministradorCategoriaEntity.create());
	}


	public CategoriaAdministradorCategoriaEntity(UUID identificador, CategoriaEntity categoria, AdministradorCategoriaEntity administradorCategoria) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setAdministradorCategoria(administradorCategoria);
	}

	public final CategoriaAdministradorCategoriaEntity setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final CategoriaAdministradorCategoriaEntity setCategoria(final CategoriaEntity categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaEntity.create());
		return this;
	}

	public final CategoriaAdministradorCategoriaEntity setAdministradorCategoria(final AdministradorCategoriaEntity administradorCategoria) {

		this.administradorCategoria = UtilObject.getDefault(administradorCategoria, AdministradorCategoriaEntity.create());
		return this;
	}

	public UUID getIdentificador() {
		return identificador;
	}

	public CategoriaEntity getCategoria() {
		return categoria;
	}

	public AdministradorCategoriaEntity getAdministradorCategoria() {
		return administradorCategoria;
	}

	public static CategoriaAdministradorCategoriaEntity getDefaultObject (){
		return new CategoriaAdministradorCategoriaEntity();
	}
}