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
@Table(name = "PROFESION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profesion.findAll", query = "SELECT p FROM Profesion p"),
    @NamedQuery(name = "Profesion.findByIdProfesion", query = "SELECT p FROM Profesion p WHERE p.idProfesion = :idProfesion"),
    @NamedQuery(name = "Profesion.findByNombreProfesion", query = "SELECT p FROM Profesion p WHERE p.nombreProfesion = :nombreProfesion"),
    @NamedQuery(name = "Profesion.findByDescProfesion", query = "SELECT p FROM Profesion p WHERE p.descProfesion = :descProfesion")})
public class Profesion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PROFESION")
    private Long idProfesion;
    @Basic(optional = false)
    @Column(name = "NOMBRE_PROFESION")
    private String nombreProfesion;
    @Basic(optional = false)
    @Column(name = "DESC_PROFESION")
    private String descProfesion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProfesion")
    private List<Personal> personalList;

    public Profesion() {
    }

    public Profesion(Long idProfesion) {
        this.idProfesion = idProfesion;
    }

    public Profesion(Long idProfesion, String nombreProfesion, String descProfesion) {
        this.idProfesion = idProfesion;
        this.nombreProfesion = nombreProfesion;
        this.descProfesion = descProfesion;
    }

    public Long getIdProfesion() {
        return idProfesion;
    }

    public void setIdProfesion(Long idProfesion) {
        this.idProfesion = idProfesion;
    }

    public String getNombreProfesion() {
        return nombreProfesion;
    }

    public void setNombreProfesion(String nombreProfesion) {
        this.nombreProfesion = nombreProfesion;
    }

    public String getDescProfesion() {
        return descProfesion;
    }

    public void setDescProfesion(String descProfesion) {
        this.descProfesion = descProfesion;
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
        hash += (idProfesion != null ? idProfesion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesion)) {
            return false;
        }
        Profesion other = (Profesion) object;
        if ((this.idProfesion == null && other.idProfesion != null) || (this.idProfesion != null && !this.idProfesion.equals(other.idProfesion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "primavera.Profesion[ idProfesion=" + idProfesion + " ]";
    }
    
}
