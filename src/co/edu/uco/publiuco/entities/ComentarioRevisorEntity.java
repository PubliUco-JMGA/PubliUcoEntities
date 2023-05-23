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

    public ComentarioRevisorEntity(UUID identificador, RevisorRevisionEntity revisorRevision, TipoComentarioRevisorEntity tipo, String contenido) {
        setIdentificador(identificador);
        setRevisorRevision(revisorRevision);
        setTipo(tipo);
        setContenido(contenido);

    }
    private ComentarioRevisorEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setRevisorRevision(RevisorRevisionEntity.create());
        setTipo(TipoComentarioRevisorEntity.create());
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
    public ComentarioRevisorEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ComentarioRevisorEntity setRevisorRevision(final RevisorRevisionEntity revisorRevision) {
        this.revisorRevision = UtilObject.getDefault(revisorRevision, RevisorRevisionEntity.create());
        return this;
    }

    public ComentarioRevisorEntity setTipo(final TipoComentarioRevisorEntity tipoComentarioRevisor) {
        this.tipo = UtilObject.getDefault(tipoComentarioRevisor, TipoComentarioRevisorEntity.create());
        return this;
    }

    public ComentarioRevisorEntity setContenido(final String contenido) {
        this.contenido = UtilText.applyTrim(contenido);
        return this;
    }
    
    public static ComentarioRevisorEntity create (){
        return new ComentarioRevisorEntity();
    }
}
