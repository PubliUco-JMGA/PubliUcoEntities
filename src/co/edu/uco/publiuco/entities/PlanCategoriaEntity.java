package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilDate;
import co.edu.uco.publiuco.utils.UtilNumber;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;
import java.time.LocalDateTime;

public final class PlanCategoriaEntity {
    private UUID identificador;
    private CategoriaEntity categoria;
    private Double precio;
    private LocalDateTime fechaDesde;
    private LocalDateTime fechaHasta;
    private EstadoEntity estado;
    public static PlanCategoriaEntity DEFAULT_OBJECT = new PlanCategoriaEntity();

    private PlanCategoriaEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setCategoria(CategoriaEntity.getDefaultObject());
        setPrecio(UtilNumber.getRealDefaultValue());
        setFechaDesde(UtilDate.getDefaultValue());
        setFechaHasta(UtilDate.getDefaultValue());
        setEstado(EstadoEntity.getDefaultObject());
    }

    public PlanCategoriaEntity(UUID identificador, CategoriaEntity categoria, Double precio, LocalDateTime fechaDesde, LocalDateTime fechaHasta, EstadoEntity estado) {
       super();
       setIdentificador(identificador);
       setCategoria(categoria);
       setPrecio(precio);
       setFechaDesde(fechaDesde);
       setFechaHasta(fechaHasta);
       setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public CategoriaEntity getCategoria() {
        return categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public LocalDateTime getFechaDesde() {
        return fechaDesde;
    }

    public LocalDateTime getFechaHasta() {
        return fechaHasta;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setCategoria(final CategoriaEntity categoria) {
        this.categoria = UtilObject.getDefault(categoria, CategoriaEntity.getDefaultObject());
    }

    private void setPrecio(final Double precio) {
        this.precio = UtilNumber.getDefaultReal(precio);
    }

    private void setFechaDesde(final LocalDateTime fechaDesde) {
        this.fechaDesde = UtilDate.getDefault(fechaDesde);
    }

    private void setFechaHasta(final LocalDateTime fechaHasta) {
        this.fechaHasta = UtilDate.getDefault(fechaHasta);
    }

    private void setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }
    public static PlanCategoriaEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
