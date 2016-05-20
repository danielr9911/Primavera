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
@Table(name = "TIPO_SANGRE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoSangre.findAll", query = "SELECT t FROM TipoSangre t"),
    @NamedQuery(name = "TipoSangre.findByIdSangre", query = "SELECT t FROM TipoSangre t WHERE t.idSangre = :idSangre"),
    @NamedQuery(name = "TipoSangre.findByGs", query = "SELECT t FROM TipoSangre t WHERE t.gs = :gs"),
    @NamedQuery(name = "TipoSangre.findByRh", query = "SELECT t FROM TipoSangre t WHERE t.rh = :rh")})
public class TipoSangre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_SANGRE")
    private Long idSangre;
    @Basic(optional = false)
    @Column(name = "GS")
    private String gs;
    @Basic(optional = false)
    @Column(name = "RH")
    private String rh;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoSangre")
    private List<Personal> personalList;

    public TipoSangre() {
    }

    public TipoSangre(Long idSangre) {
        this.idSangre = idSangre;
    }

    public TipoSangre(Long idSangre, String gs, String rh) {
        this.idSangre = idSangre;
        this.gs = gs;
        this.rh = rh;
    }

    public Long getIdSangre() {
        return idSangre;
    }

    public void setIdSangre(Long idSangre) {
        this.idSangre = idSangre;
    }

    public String getGs() {
        return gs;
    }

    public void setGs(String gs) {
        this.gs = gs;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    @XmlTransient
    public List<Personal> getPersonalList() {
        return personalList;
    }

    public void setPersonalList(List<Personal> personalList) {
        this.personalList = personalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSangre != null ? idSangre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoSangre)) {
            return false;
        }
        TipoSangre other = (TipoSangre) object;
        if ((this.idSangre == null && other.idSangre != null) || (this.idSangre != null && !this.idSangre.equals(other.idSangre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "primavera.TipoSangre[ idSangre=" + idSangre + " ]";
    }
    
}
