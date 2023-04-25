package co.edu.uco.publiuco.entities;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;
public final class CategoriaAdministradorCategoriaEntity {

	private UUID identificador;
	private CategoriaEntity categoria;
	private AdministradorCategoriaEntity administradorCategoria;


	public CategoriaAdministradorCategoriaEntity(UUID identificador, CategoriaEntity categoria, AdministradorCategoriaEntity administradorCategoria) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setAdministradorCategoria(administradorCategoria);
	}

	private final CategoriaAdministradorCategoriaEntity setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	private final CategoriaAdministradorCategoriaEntity setCategoria(final CategoriaEntity categoria) {
		this.categoria = categoria;
		return this;
	}

	private final CategoriaAdministradorCategoriaEntity setAdministradorCategoria(final AdministradorCategoriaEntity administradorCategoria) {

		this.administradorCategoria = administradorCategoria;
		return this;
	}

	private UUID getIdentificador() {
		return identificador;
	}

	private CategoriaEntity getCategoria() {
		return categoria;
	}

	private AdministradorCategoriaEntity getAdministradorCategoria() {
		return administradorCategoria;
	}

}