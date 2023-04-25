package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;

import java.util.UUID;

public class TipoEstadoEntity {
    private UUID identificador;
    private String nombre;


    public TipoEstadoEntity(UUID identificador, String nombre) {
        setIdentificador(identificador);
        setNombre(nombre);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }



    private void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    private void setNombre(String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
    }




}

