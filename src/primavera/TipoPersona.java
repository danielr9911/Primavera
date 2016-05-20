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
@Table(name = "TIPO_PERSONA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoPersona.findAll", query = "SELECT t FROM TipoPersona t"),
    @NamedQuery(name = "TipoPersona.findByIdTipopersona", query = "SELECT t FROM TipoPersona t WHERE t.idTipopersona = :idTipopersona"),
    @NamedQuery(name = "TipoPersona.findByNombTipopersona", query = "SELECT t FROM TipoPersona t WHERE t.nombTipopersona = :nombTipopersona")})
public class TipoPersona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TIPOPERSONA")
    private Short idTipopersona;
    @Basic(optional = false)
    @Column(name = "NOMB_TIPOPERSONA")
    private String nombTipopersona;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipopersona")
    private List<Personal> personalList;

    public TipoPersona() {
    }

    public TipoPersona(Short idTipopersona) {
        this.idTipopersona = idTipopersona;
    }

    public TipoPersona(Short idTipopersona, String nombTipopersona) {
        this.idTipopersona = idTipopersona;
        this.nombTipopersona = nombTipopersona;
    }

    public Short getIdTipopersona() {
        return idTipopersona;
    }

    public void setIdTipopersona(Short idTipopersona) {
        this.idTipopersona = idTipopersona;
    }

    public String getNombTipopersona() {
        return nombTipopersona;
    }

    public void setNombTipopersona(String nombTipopersona) {
        this.nombTipopersona = nombTipopersona;
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
        hash += (idTipopersona != null ? idTipopersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPersona)) {
            return false;
        }
        TipoPersona other = (TipoPersona) object;
        if ((this.idTipopersona == null && other.idTipopersona != null) || (this.idTipopersona != null && !this.idTipopersona.equals(other.idTipopersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "primavera.TipoPersona[ idTipopersona=" + idTipopersona + " ]";
    }
    
}
