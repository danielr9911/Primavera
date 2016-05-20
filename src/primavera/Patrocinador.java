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
@Table(name = "PATROCINADOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Patrocinador.findAll", query = "SELECT p FROM Patrocinador p"),
    @NamedQuery(name = "Patrocinador.findByIdPatrocinador", query = "SELECT p FROM Patrocinador p WHERE p.idPatrocinador = :idPatrocinador"),
    @NamedQuery(name = "Patrocinador.findByNombrePatr", query = "SELECT p FROM Patrocinador p WHERE p.nombrePatr = :nombrePatr"),
    @NamedQuery(name = "Patrocinador.findByTelefonoPatr", query = "SELECT p FROM Patrocinador p WHERE p.telefonoPatr = :telefonoPatr"),
    @NamedQuery(name = "Patrocinador.findByCorreoPatr", query = "SELECT p FROM Patrocinador p WHERE p.correoPatr = :correoPatr"),
    @NamedQuery(name = "Patrocinador.findByEstadoPatr", query = "SELECT p FROM Patrocinador p WHERE p.estadoPatr = :estadoPatr")})
public class Patrocinador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PATROCINADOR")
    private Long idPatrocinador;
    @Basic(optional = false)
    @Column(name = "NOMBRE_PATR")
    private String nombrePatr;
    @Basic(optional = false)
    @Column(name = "TELEFONO_PATR")
    private String telefonoPatr;
    @Basic(optional = false)
    @Column(name = "CORREO_PATR")
    private String correoPatr;
    @Basic(optional = false)
    @Column(name = "ESTADO_PATR")
    private String estadoPatr;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPatrocinador")
    private List<DonacionMaterial> donacionMaterialList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPatrocinador")
    private List<DonacionMonetaria> donacionMonetariaList;

    public Patrocinador() {
    }

    public Patrocinador(Long idPatrocinador) {
        this.idPatrocinador = idPatrocinador;
    }

    public Patrocinador(Long idPatrocinador, String nombrePatr, String telefonoPatr, String correoPatr, String estadoPatr) {
        this.idPatrocinador = idPatrocinador;
        this.nombrePatr = nombrePatr;
        this.telefonoPatr = telefonoPatr;
        this.correoPatr = correoPatr;
        this.estadoPatr = estadoPatr;
    }

    public Long getIdPatrocinador() {
        return idPatrocinador;
    }

    public void setIdPatrocinador(Long idPatrocinador) {
        this.idPatrocinador = idPatrocinador;
    }

    public String getNombrePatr() {
        return nombrePatr;
    }

    public void setNombrePatr(String nombrePatr) {
        this.nombrePatr = nombrePatr;
    }

    public String getTelefonoPatr() {
        return telefonoPatr;
    }

    public void setTelefonoPatr(String telefonoPatr) {
        this.telefonoPatr = telefonoPatr;
    }

    public String getCorreoPatr() {
        return correoPatr;
    }

    public void setCorreoPatr(String correoPatr) {
        this.correoPatr = correoPatr;
    }

    public String getEstadoPatr() {
        return estadoPatr;
    }

    public void setEstadoPatr(String estadoPatr) {
        this.estadoPatr = estadoPatr;
    }

    @XmlTransient
    public List<DonacionMaterial> getDonacionMaterialList() {
        return donacionMaterialList;
    }

    public void setDonacionMaterialList(List<DonacionMaterial> donacionMaterialList) {
        this.donacionMaterialList = donacionMaterialList;
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
        hash += (idPatrocinador != null ? idPatrocinador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patrocinador)) {
            return false;
        }
        Patrocinador other = (Patrocinador) object;
        if ((this.idPatrocinador == null && other.idPatrocinador != null) || (this.idPatrocinador != null && !this.idPatrocinador.equals(other.idPatrocinador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "primavera.Patrocinador[ idPatrocinador=" + idPatrocinador + " ]";
    }
    
}
