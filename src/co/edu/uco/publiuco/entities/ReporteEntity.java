package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class ReporteEntity {
    private UUID identificador;
    private LectorEntity lector;
    private ComentarioLectorEntity comentario;
    private String razon;
    private TipoReporteEntity tipoReporte;
    private LocalDateTime fechaReporte;
    public static ReporteEntity DEFAULT_OBJECT = new ReporteEntity();

    private ReporteEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setLector(LectorEntity.getDefaultObject());
        setComentario(ComentarioLectorEntity.getDefaultObject());
        setRazon(UtilText.getDefaultValue());
        setTipoReporte(TipoReporteEntity.getDefaultObject());
        setFechaReporte(UtilDate.getDefaultValue());
    }

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

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setLector(final LectorEntity lector) {
        this.lector = UtilObject.getDefault(lector, LectorEntity.getDefaultObject());
    }

    private void setComentario(final ComentarioLectorEntity comentario) {
        this.comentario = UtilObject.getDefault(comentario, ComentarioLectorEntity.getDefaultObject());
    }

    private void setRazon(final String razon) {
        this.razon = UtilText.applyTrim(razon);
    }

    private void setTipoReporte(final TipoReporteEntity tipoReporte) {
        this.tipoReporte = UtilObject.getDefault(tipoReporte, TipoReporteEntity.getDefaultObject());
    }

    private void setFechaReporte(final LocalDateTime fechaReporte) {
        this.fechaReporte = UtilDate.getDefault(fechaReporte);
    }
    public static ReporteEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
