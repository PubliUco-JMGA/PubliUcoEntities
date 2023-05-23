package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class PaisEntity {
    private UUID identificador;
    private String nombre;
    private String indicadorPais;

    private PaisEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setIndicadorPais(UtilText.getDefaultValue());
    }

    public PaisEntity(UUID identificador, String nombre, String indicadorPais) {
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setIndicadorPais(indicadorPais);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIndicadorPais() {
        return indicadorPais;
    }

    public PaisEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PaisEntity setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public PaisEntity setIndicadorPais(final String indicadorPais) {
        this.indicadorPais = UtilText.applyTrim(indicadorPais);
        return this;
    }
    public static PaisEntity create (){
        return new PaisEntity();
    }
}
