/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primavera;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "DONACION_MONETARIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DonacionMonetaria.findAll", query = "SELECT d FROM DonacionMonetaria d"),
    @NamedQuery(name = "DonacionMonetaria.findByIdMonetaria", query = "SELECT d FROM DonacionMonetaria d WHERE d.idMonetaria = :idMonetaria"),
    @NamedQuery(name = "DonacionMonetaria.findByCantidadMoneOriginal", query = "SELECT d FROM DonacionMonetaria d WHERE d.cantidadMoneOriginal = :cantidadMoneOriginal"),
    @NamedQuery(name = "DonacionMonetaria.findByFechaMone", query = "SELECT d FROM DonacionMonetaria d WHERE d.fechaMone = :fechaMone"),
    @NamedQuery(name = "DonacionMonetaria.findByTasaCambio", query = "SELECT d FROM DonacionMonetaria d WHERE d.tasaCambio = :tasaCambio"),
    @NamedQuery(name = "DonacionMonetaria.findByCantidadCop", query = "SELECT d FROM DonacionMonetaria d WHERE d.cantidadCop = :cantidadCop")})
public class DonacionMonetaria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_MONETARIA")
    private Long idMonetaria;
    @Basic(optional = false)
    @Column(name = "CANTIDAD_MONE_ORIGINAL")
    private BigInteger cantidadMoneOriginal;
    @Basic(optional = false)
    @Column(name = "FECHA_MONE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaMone;
    @Basic(optional = false)
    @Column(name = "TASA_CAMBIO")
    private BigInteger tasaCambio;
    @Basic(optional = false)
    @Column(name = "CANTIDAD_COP")
    private BigInteger cantidadCop;
    @JoinColumn(name = "ID_CARRO", referencedColumnName = "ID_CARRO")
    @ManyToOne(optional = false)
    private Carrosolar idCarro;
    @JoinColumn(name = "ID_PATROCINADOR", referencedColumnName = "ID_PATROCINADOR")
    @ManyToOne(optional = false)
    private Patrocinador idPatrocinador;
    @JoinColumn(name = "ID_TIPOMONEDA", referencedColumnName = "ID_TIPOMONEDA")
    @ManyToOne(optional = false)
    private TipoMoneda idTipomoneda;

    public DonacionMonetaria() {
    }

    public DonacionMonetaria(Long idMonetaria) {
        this.idMonetaria = idMonetaria;
    }

    public DonacionMonetaria(Long idMonetaria, BigInteger cantidadMoneOriginal, Date fechaMone, BigInteger tasaCambio, BigInteger cantidadCop) {
        this.idMonetaria = idMonetaria;
        this.cantidadMoneOriginal = cantidadMoneOriginal;
        this.fechaMone = fechaMone;
        this.tasaCambio = tasaCambio;
        this.cantidadCop = cantidadCop;
    }

    public Long getIdMonetaria() {
        return idMonetaria;
    }

    public void setIdMonetaria(Long idMonetaria) {
        this.idMonetaria = idMonetaria;
    }

    public BigInteger getCantidadMoneOriginal() {
        return cantidadMoneOriginal;
    }

    public void setCantidadMoneOriginal(BigInteger cantidadMoneOriginal) {
        this.cantidadMoneOriginal = cantidadMoneOriginal;
    }

    public Date getFechaMone() {
        return fechaMone;
    }

    public void setFechaMone(Date fechaMone) {
        this.fechaMone = fechaMone;
    }

    public BigInteger getTasaCambio() {
        return tasaCambio;
    }

    public void setTasaCambio(BigInteger tasaCambio) {
        this.tasaCambio = tasaCambio;
    }

    public BigInteger getCantidadCop() {
        return cantidadCop;
    }

    public void setCantidadCop(BigInteger cantidadCop) {
        this.cantidadCop = cantidadCop;
    }

    public Carrosolar getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(Carrosolar idCarro) {
        this.idCarro = idCarro;
    }

    public Patrocinador getIdPatrocinador() {
        return idPatrocinador;
    }

    public void setIdPatrocinador(Patrocinador idPatrocinador) {
        this.idPatrocinador = idPatrocinador;
    }

    public TipoMoneda getIdTipomoneda() {
        return idTipomoneda;
    }

    public void setIdTipomoneda(TipoMoneda idTipomoneda) {
        this.idTipomoneda = idTipomoneda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMonetaria != null ? idMonetaria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DonacionMonetaria)) {
            return false;
        }
        DonacionMonetaria other = (DonacionMonetaria) object;
        if ((this.idMonetaria == null && other.idMonetaria != null) || (this.idMonetaria != null && !this.idMonetaria.equals(other.idMonetaria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "primavera.DonacionMonetaria[ idMonetaria=" + idMonetaria + " ]";
    }
    
}
