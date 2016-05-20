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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "SUBSISTEMA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subsistema.findAll", query = "SELECT s FROM Subsistema s"),
    @NamedQuery(name = "Subsistema.findByIdSubsistema", query = "SELECT s FROM Subsistema s WHERE s.idSubsistema = :idSubsistema"),
    @NamedQuery(name = "Subsistema.findByNombreSubs", query = "SELECT s FROM Subsistema s WHERE s.nombreSubs = :nombreSubs"),
    @NamedQuery(name = "Subsistema.findByEstadoSubs", query = "SELECT s FROM Subsistema s WHERE s.estadoSubs = :estadoSubs")})
public class Subsistema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_SUBSISTEMA")
    private Long idSubsistema;
    @Basic(optional = false)
    @Column(name = "NOMBRE_SUBS")
    private String nombreSubs;
    @Basic(optional = false)
    @Column(name = "ESTADO_SUBS")
    private String estadoSubs;
    @JoinColumn(name = "ID_CARRO", referencedColumnName = "ID_CARRO")
    @ManyToOne(optional = false)
    private Carrosolar idCarro;
    @JoinColumn(name = "ID_LABORATORIO", referencedColumnName = "ID_LABORATORIO")
    @ManyToOne(optional = false)
    private Laboratorios idLaboratorio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSubsistema")
    private List<Personal> personalList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSubsistema")
    private List<DonacionMaterial> donacionMaterialList;

    public Subsistema() {
    }

    public Subsistema(Long idSubsistema) {
        this.idSubsistema = idSubsistema;
    }

    public Subsistema(Long idSubsistema, String nombreSubs, String estadoSubs) {
        this.idSubsistema = idSubsistema;
        this.nombreSubs = nombreSubs;
        this.estadoSubs = estadoSubs;
    }

    public Long getIdSubsistema() {
        return idSubsistema;
    }

    public void setIdSubsistema(Long idSubsistema) {
        this.idSubsistema = idSubsistema;
    }

    public String getNombreSubs() {
        return nombreSubs;
    }

    public void setNombreSubs(String nombreSubs) {
        this.nombreSubs = nombreSubs;
    }

    public String getEstadoSubs() {
        return estadoSubs;
    }

    public void setEstadoSubs(String estadoSubs) {
        this.estadoSubs = estadoSubs;
    }

    public Carrosolar getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(Carrosolar idCarro) {
        this.idCarro = idCarro;
    }

    public Laboratorios getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(Laboratorios idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    @XmlTransient
    public List<Personal> getPersonalList() {
        return personalList;
    }

    public void setPersonalList(List<Personal> personalList) {
        this.personalList = personalList;
    }

    @XmlTransient
    public List<DonacionMaterial> getDonacionMaterialList() {
        return donacionMaterialList;
    }

    public void setDonacionMaterialList(List<DonacionMaterial> donacionMaterialList) {
        this.donacionMaterialList = donacionMaterialList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSubsistema != null ? idSubsistema.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subsistema)) {
            return false;
        }
        Subsistema other = (Subsistema) object;
        if ((this.idSubsistema == null && other.idSubsistema != null) || (this.idSubsistema != null && !this.idSubsistema.equals(other.idSubsistema))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "primavera.Subsistema[ idSubsistema=" + idSubsistema + " ]";
    }
    
}
