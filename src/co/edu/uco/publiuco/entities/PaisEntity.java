package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public final class PaisEntity {
    private UUID identificador;
    private String nombre;
    private String indicadorPais;
    public static PaisEntity DEFAULT_OBJECT = new PaisEntity();

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

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
    }

    private void setIndicadorPais(final String indicadorPais) {
        this.indicadorPais = UtilText.applyTrim(indicadorPais);
    }
    public static PaisEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
