/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primavera;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "GASTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gastos.findAll", query = "SELECT g FROM Gastos g"),
    @NamedQuery(name = "Gastos.findByIdGasto", query = "SELECT g FROM Gastos g WHERE g.idGasto = :idGasto"),
    @NamedQuery(name = "Gastos.findByCantidadGasto", query = "SELECT g FROM Gastos g WHERE g.cantidadGasto = :cantidadGasto"),
    @NamedQuery(name = "Gastos.findByDescGasto", query = "SELECT g FROM Gastos g WHERE g.descGasto = :descGasto"),
    @NamedQuery(name = "Gastos.findByFechaGasto", query = "SELECT g FROM Gastos g WHERE g.fechaGasto = :fechaGasto")})
public class Gastos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_GASTO")
    private Integer idGasto;
    @Basic(optional = false)
    @Column(name = "CANTIDAD_GASTO")
    private long cantidadGasto;
    @Basic(optional = false)
    @Column(name = "DESC_GASTO")
    private String descGasto;
    @Basic(optional = false)
    @Column(name = "FECHA_GASTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaGasto;
    @JoinColumn(name = "ID_CARRO", referencedColumnName = "ID_CARRO")
    @ManyToOne(optional = false)
    private Carrosolar idCarro;

    public Gastos() {
    }

    public Gastos(Integer idGasto) {
        this.idGasto = idGasto;
    }

    public Gastos(Integer idGasto, long cantidadGasto, String descGasto, Date fechaGasto) {
        this.idGasto = idGasto;
        this.cantidadGasto = cantidadGasto;
        this.descGasto = descGasto;
        this.fechaGasto = fechaGasto;
    }

    public Integer getIdGasto() {
        return idGasto;
    }

    public void setIdGasto(Integer idGasto) {
        this.idGasto = idGasto;
    }

    public long getCantidadGasto() {
        return cantidadGasto;
    }

    public void setCantidadGasto(long cantidadGasto) {
        this.cantidadGasto = cantidadGasto;
    }

    public String getDescGasto() {
        return descGasto;
    }

    public void setDescGasto(String descGasto) {
        this.descGasto = descGasto;
    }

    public Date getFechaGasto() {
        return fechaGasto;
    }

    public void setFechaGasto(Date fechaGasto) {
        this.fechaGasto = fechaGasto;
    }

    public Carrosolar getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(Carrosolar idCarro) {
        this.idCarro = idCarro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGasto != null ? idGasto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gastos)) {
            return false;
        }
        Gastos other = (Gastos) object;
        if ((this.idGasto == null && other.idGasto != null) || (this.idGasto != null && !this.idGasto.equals(other.idGasto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "primavera.Gastos[ idGasto=" + idGasto + " ]";
    }
    
}
