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
@Table(name = "CARROSOLAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carrosolar.findAll", query = "SELECT c FROM Carrosolar c"),
    @NamedQuery(name = "Carrosolar.findByIdCarro", query = "SELECT c FROM Carrosolar c WHERE c.idCarro = :idCarro"),
    @NamedQuery(name = "Carrosolar.findByNombreCarro", query = "SELECT c FROM Carrosolar c WHERE c.nombreCarro = :nombreCarro"),
    @NamedQuery(name = "Carrosolar.findByPlacaCarro", query = "SELECT c FROM Carrosolar c WHERE c.placaCarro = :placaCarro"),
    @NamedQuery(name = "Carrosolar.findByEstadoCarro", query = "SELECT c FROM Carrosolar c WHERE c.estadoCarro = :estadoCarro")})
public class Carrosolar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CARRO")
    private Long idCarro;
    @Basic(optional = false)
    @Column(name = "NOMBRE_CARRO")
    private String nombreCarro;
    @Basic(optional = false)
    @Column(name = "PLACA_CARRO")
    private String placaCarro;
    @Basic(optional = false)
    @Column(name = "ESTADO_CARRO")
    private String estadoCarro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCarro")
    private List<Subsistema> subsistemaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCarro")
    private List<DonacionMonetaria> donacionMonetariaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCarro")
    private List<Gastos> gastosList;

    public Carrosolar() {
    }

    public Carrosolar(Long idCarro) {
        this.idCarro = idCarro;
    }

    public Carrosolar(Long idCarro, String nombreCarro, String placaCarro, String estadoCarro) {
        this.idCarro = idCarro;
        this.nombreCarro = nombreCarro;
        this.placaCarro = placaCarro;
        this.estadoCarro = estadoCarro;
    }

    public Long getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(Long idCarro) {
        this.idCarro = idCarro;
    }

    public String getNombreCarro() {
        return nombreCarro;
    }

    public void setNombreCarro(String nombreCarro) {
        this.nombreCarro = nombreCarro;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public String getEstadoCarro() {
        return estadoCarro;
    }

    public void setEstadoCarro(String estadoCarro) {
        this.estadoCarro = estadoCarro;
    }

    @XmlTransient
    public List<Subsistema> getSubsistemaList() {
        return subsistemaList;
    }

    public void setSubsistemaList(List<Subsistema> subsistemaList) {
        this.subsistemaList = subsistemaList;
    }

    @XmlTransient
    public List<DonacionMonetaria> getDonacionMonetariaList() {
        return donacionMonetariaList;
    }

    public void setDonacionMonetariaList(List<DonacionMonetaria> donacionMonetariaList) {
        this.donacionMonetariaList = donacionMonetariaList;
    }

    @XmlTransient
    public List<Gastos> getGastosList() {
        return gastosList;
    }

    public void setGastosList(List<Gastos> gastosList) {
        this.gastosList = gastosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCarro != null ? idCarro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carrosolar)) {
            return false;
        }
        Carrosolar other = (Carrosolar) object;
        if ((this.idCarro == null && other.idCarro != null) || (this.idCarro != null && !this.idCarro.equals(other.idCarro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "primavera.Carrosolar[ idCarro=" + idCarro + " ]";
    }
    
}
