package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;

import java.time.LocalDateTime;
import java.util.UUID;

public class ReporteEntity {
    private UUID identificador;
    private LectorEntity lector;
    private ComentarioLectorEntity comentario;
    private String razon;
    private TipoReporteEntity tipoReporte;
    private LocalDateTime fechaReporte;


    public ReporteEntity(UUID identificador, LectorEntity lector, ComentarioLectorEntity comentario, String razon, TipoReporteEntity tipoReporte, LocalDateTime fechaReporte) {
        setIdentificador(identificador);
        setLector(lector);
        setComentario(comentario);
        setRazon(razon);
        setTipoReporte(tipoReporte);
        setFechaReporte(fechaReporte);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public LectorEntity getLector() {
        return lector;
    }

    public ComentarioLectorEntity getComentario() {
        return comentario;
    }

    public String getRazon() {
        return razon;
    }

    public TipoReporteEntity getTipoReporte() {
        return tipoReporte;
    }

    public LocalDateTime getFechaReporte() {
        return fechaReporte;
    }

    private void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    private void setLector(LectorEntity lector) {
        this.lector = lector;
    }

    private void setComentario(ComentarioLectorEntity comentario) {
        this.comentario = comentario;
    }

    private void setRazon(String razon) {
        this.razon = UtilText.applyTrim(razon);
    }

    private void setTipoReporte(TipoReporteEntity tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    private void setFechaReporte(LocalDateTime fechaReporte) {
        this.fechaReporte = fechaReporte;
    }
}
