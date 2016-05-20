/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primavera;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "TIPO_MONEDA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoMoneda.findAll", query = "SELECT t FROM TipoMoneda t"),
    @NamedQuery(name = "TipoMoneda.findByIdTipomoneda", query = "SELECT t FROM TipoMoneda t WHERE t.idTipomoneda = :idTipomoneda"),
    @NamedQuery(name = "TipoMoneda.findByNombreTipomoneda", query = "SELECT t FROM TipoMoneda t WHERE t.nombreTipomoneda = :nombreTipomoneda")})
public class TipoMoneda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TIPOMONEDA")
    private String idTipomoneda;
    @Basic(optional = false)
    @Column(name = "NOMBRE_TIPOMONEDA")
    private String nombreTipomoneda;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipomoneda")
    private List<DonacionMonetaria> donacionMonetariaList;

    public TipoMoneda() {
    }

    public TipoMoneda(String idTipomoneda) {
        this.idTipomoneda = idTipomoneda;
    }

    public TipoMoneda(String idTipomoneda, String nombreTipomoneda) {
        this.idTipomoneda = idTipomoneda;
        this.nombreTipomoneda = nombreTipomoneda;
    }

    public String getIdTipomoneda() {
        return idTipomoneda;
    }

    public void setIdTipomoneda(String idTipomoneda) {
        this.idTipomoneda = idTipomoneda;
    }

    public String getNombreTipomoneda() {
        return nombreTipomoneda;
    }

    public void setNombreTipomoneda(String nombreTipomoneda) {
        this.nombreTipomoneda = nombreTipomoneda;
    }

    @XmlTransient
    public List<DonacionMonetaria> getDonacionMonetariaList() {
        return donacionMonetariaList;
    }

    public void setDonacionMonetariaList(List<DonacionMonetaria> donacionMonetariaList) {
        this.donacionMonetariaList = donacionMonetariaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipomoneda != null ? idTipomoneda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoMoneda)) {
            return false;
        }
        TipoMoneda other = (TipoMoneda) object;
        if ((this.idTipomoneda == null && other.idTipomoneda != null) || (this.idTipomoneda != null && !this.idTipomoneda.equals(other.idTipomoneda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "primavera.TipoMoneda[ idTipomoneda=" + idTipomoneda + " ]";
    }
    
}
