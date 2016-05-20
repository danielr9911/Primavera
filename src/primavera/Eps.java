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
@Table(name = "EPS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Eps.findAll", query = "SELECT e FROM Eps e"),
    @NamedQuery(name = "Eps.findByIdEps", query = "SELECT e FROM Eps e WHERE e.idEps = :idEps"),
    @NamedQuery(name = "Eps.findByNombreEps", query = "SELECT e FROM Eps e WHERE e.nombreEps = :nombreEps"),
    @NamedQuery(name = "Eps.findByTipoEps", query = "SELECT e FROM Eps e WHERE e.tipoEps = :tipoEps"),
    @NamedQuery(name = "Eps.findByTelefonoEps", query = "SELECT e FROM Eps e WHERE e.telefonoEps = :telefonoEps"),
    @NamedQuery(name = "Eps.findByCiudadEps", query = "SELECT e FROM Eps e WHERE e.ciudadEps = :ciudadEps")})
public class Eps implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_EPS")
    private Long idEps;
    @Basic(optional = false)
    @Column(name = "NOMBRE_EPS")
    private String nombreEps;
    @Basic(optional = false)
    @Column(name = "TIPO_EPS")
    private String tipoEps;
    @Basic(optional = false)
    @Column(name = "TELEFONO_EPS")
    private String telefonoEps;
    @Basic(optional = false)
    @Column(name = "CIUDAD_EPS")
    private String ciudadEps;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEps")
    private List<Personal> personalList;

    public Eps() {
    }

    public Eps(Long idEps) {
        this.idEps = idEps;
    }

    public Eps(Long idEps, String nombreEps, String tipoEps, String telefonoEps, String ciudadEps) {
        this.idEps = idEps;
        this.nombreEps = nombreEps;
        this.tipoEps = tipoEps;
        this.telefonoEps = telefonoEps;
        this.ciudadEps = ciudadEps;
    }

    public Long getIdEps() {
        return idEps;
    }

    public void setIdEps(Long idEps) {
        this.idEps = idEps;
    }

    public String getNombreEps() {
        return nombreEps;
    }

    public void setNombreEps(String nombreEps) {
        this.nombreEps = nombreEps;
    }

    public String getTipoEps() {
        return tipoEps;
    }

    public void setTipoEps(String tipoEps) {
        this.tipoEps = tipoEps;
    }

    public String getTelefonoEps() {
        return telefonoEps;
    }

    public void setTelefonoEps(String telefonoEps) {
        this.telefonoEps = telefonoEps;
    }

    public String getCiudadEps() {
        return ciudadEps;
    }

    public void setCiudadEps(String ciudadEps) {
        this.ciudadEps = ciudadEps;
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
        hash += (idEps != null ? idEps.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eps)) {
            return false;
        }
        Eps other = (Eps) object;
        if ((this.idEps == null && other.idEps != null) || (this.idEps != null && !this.idEps.equals(other.idEps))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "primavera.Eps[ idEps=" + idEps + " ]";
    }
    
}
