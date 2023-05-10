package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class ComentarioRevisorEntity {
    private UUID identificador;
    private RevisorRevisionEntity revisorRevision;
    private TipoComentarioRevisorEntity tipoComentarioRevisor;
    private String comentario;
    public static ComentarioRevisorEntity DEFAULT_OBJECT = new ComentarioRevisorEntity();

    public ComentarioRevisorEntity(UUID identificador, RevisorRevisionEntity revisorRevision, TipoComentarioRevisorEntity tipoComentarioRevisor, String comentario) {
        super();
        setIdentificador(identificador);
        setRevisorRevision(revisorRevision);
        setTipoComentarioRevisor(tipoComentarioRevisor);
        setComentario(comentario);

    }
    private ComentarioRevisorEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setRevisorRevision(RevisorRevisionEntity.getDefaultObject());
        setTipoComentarioRevisor(TipoComentarioRevisorEntity.getDefaultObject());
        setComentario(UtilText.getDefaultValue());

    }

    public UUID getIdentificador() {
        return identificador;
    }

    public RevisorRevisionEntity getRevisorRevision() {
        return revisorRevision;
    }

    public TipoComentarioRevisorEntity getTipoComentarioRevisor() {
        return tipoComentarioRevisor;
    }

    public String getComentario() {
        return comentario;
    }

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setRevisorRevision(final RevisorRevisionEntity revisorRevision) {
        this.revisorRevision = UtilObject.getDefault(revisorRevision, RevisorRevisionEntity.getDefaultObject());
    }

    private void setTipoComentarioRevisor(final TipoComentarioRevisorEntity tipoComentarioRevisor) {
        this.tipoComentarioRevisor = UtilObject.getDefault(tipoComentarioRevisor, TipoComentarioRevisorEntity.getDefaultObject());
    }

    private void setComentario(final String comentario) {
        this.comentario = UtilText.applyTrim(comentario);
    }
    public static ComentarioRevisorEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
