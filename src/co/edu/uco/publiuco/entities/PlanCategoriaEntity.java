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

    private PlanCategoriaEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setCategoria(CategoriaEntity.create());
        setPrecio(UtilNumber.getRealDefaultValue());
        setFechaDesde(UtilDate.getDefaultValue());
        setFechaHasta(UtilDate.getDefaultValue());
        setEstado(EstadoEntity.create());
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

    public PlanCategoriaEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PlanCategoriaEntity setCategoria(final CategoriaEntity categoria) {
        this.categoria = UtilObject.getDefault(categoria, CategoriaEntity.create());
        return this;
    }

    public PlanCategoriaEntity setPrecio(final Double precio) {
        this.precio = UtilNumber.getDefaultReal(precio);
        return this;
    }

    public PlanCategoriaEntity setFechaDesde(final LocalDateTime fechaDesde) {
        this.fechaDesde = UtilDate.getDefault(fechaDesde);
        return this;
    }

    public PlanCategoriaEntity setFechaHasta(final LocalDateTime fechaHasta) {
        this.fechaHasta = UtilDate.getDefault(fechaHasta);
        return this;
    }
    
    public PlanCategoriaEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
    }
    public static PlanCategoriaEntity create (){
        return new PlanCategoriaEntity();
    }
}
