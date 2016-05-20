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
@Table(name = "LABORATORIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Laboratorios.findAll", query = "SELECT l FROM Laboratorios l"),
    @NamedQuery(name = "Laboratorios.findByIdLaboratorio", query = "SELECT l FROM Laboratorios l WHERE l.idLaboratorio = :idLaboratorio"),
    @NamedQuery(name = "Laboratorios.findByNombreLab", query = "SELECT l FROM Laboratorios l WHERE l.nombreLab = :nombreLab"),
    @NamedQuery(name = "Laboratorios.findByTama\u00f1oLab", query = "SELECT l FROM Laboratorios l WHERE l.tama\u00f1oLab = :tama\u00f1oLab")})
public class Laboratorios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_LABORATORIO")
    private Long idLaboratorio;
    @Basic(optional = false)
    @Column(name = "NOMBRE_LAB")
    private String nombreLab;
    @Basic(optional = false)
    @Column(name = "TAMA\u00d1O_LAB")
    private String tamañoLab;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLaboratorio")
    private List<Subsistema> subsistemaList;

    public Laboratorios() {
    }

    public Laboratorios(Long idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public Laboratorios(Long idLaboratorio, String nombreLab, String tamañoLab) {
        this.idLaboratorio = idLaboratorio;
        this.nombreLab = nombreLab;
        this.tamañoLab = tamañoLab;
    }

    public Long getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(Long idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public String getNombreLab() {
        return nombreLab;
    }

    public void setNombreLab(String nombreLab) {
        this.nombreLab = nombreLab;
    }

    public String getTamañoLab() {
        return tamañoLab;
    }

    public void setTamañoLab(String tamañoLab) {
        this.tamañoLab = tamañoLab;
    }

    @XmlTransient
    public List<Subsistema> getSubsistemaList() {
        return subsistemaList;
    }

    public void setSubsistemaList(List<Subsistema> subsistemaList) {
        this.subsistemaList = subsistemaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLaboratorio != null ? idLaboratorio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Laboratorios)) {
            return false;
        }
        Laboratorios other = (Laboratorios) object;
        if ((this.idLaboratorio == null && other.idLaboratorio != null) || (this.idLaboratorio != null && !this.idLaboratorio.equals(other.idLaboratorio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "primavera.Laboratorios[ idLaboratorio=" + idLaboratorio + " ]";
    }
    
}
