package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class ComentarioRevisorEntity {
    private UUID identificador;
    private RevisorRevisionEntity revisorRevision;
    private TipoComentarioRevisorEntity tipo;
    private String contenido;
    public static ComentarioRevisorEntity DEFAULT_OBJECT = new ComentarioRevisorEntity();

    public ComentarioRevisorEntity(UUID identificador, RevisorRevisionEntity revisorRevision, TipoComentarioRevisorEntity tipo, String contenido) {
        setIdentificador(identificador);
        setRevisorRevision(revisorRevision);
        setTipo(tipo);
        setContenido(contenido);

    }
    private ComentarioRevisorEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setRevisorRevision(RevisorRevisionEntity.getDefaultObject());
        setTipo(TipoComentarioRevisorEntity.getDefaultObject());
        setContenido(UtilText.getDefaultValue());

    }

    public UUID getIdentificador() {
        return identificador;
    }

    public RevisorRevisionEntity getRevisorRevision() {
        return revisorRevision;
    }

    public TipoComentarioRevisorEntity getTipo() {
        return tipo;
    }

    public String getContenido() {
        return contenido;
    }

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setRevisorRevision(final RevisorRevisionEntity revisorRevision) {
        this.revisorRevision = UtilObject.getDefault(revisorRevision, RevisorRevisionEntity.getDefaultObject());
    }

    private void setTipo(final TipoComentarioRevisorEntity tipo) {
        this.tipo = UtilObject.getDefault(tipo, TipoComentarioRevisorEntity.getDefaultObject());
    }

    private void setContenido(final String contenido) {
        this.contenido = UtilText.applyTrim(contenido);
    }
    public static ComentarioRevisorEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
