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
@Table(name = "MATERIAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Material.findAll", query = "SELECT m FROM Material m"),
    @NamedQuery(name = "Material.findByIdMaterial", query = "SELECT m FROM Material m WHERE m.idMaterial = :idMaterial"),
    @NamedQuery(name = "Material.findByNombreMaterial", query = "SELECT m FROM Material m WHERE m.nombreMaterial = :nombreMaterial"),
    @NamedQuery(name = "Material.findByDescMaterial", query = "SELECT m FROM Material m WHERE m.descMaterial = :descMaterial")})
public class Material implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_MATERIAL")
    private Short idMaterial;
    @Basic(optional = false)
    @Column(name = "NOMBRE_MATERIAL")
    private String nombreMaterial;
    @Basic(optional = false)
    @Column(name = "DESC_MATERIAL")
    private String descMaterial;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMaterial")
    private List<DonacionMaterial> donacionMaterialList;

    public Material() {
    }

    public Material(Short idMaterial) {
        this.idMaterial = idMaterial;
    }

    public Material(Short idMaterial, String nombreMaterial, String descMaterial) {
        this.idMaterial = idMaterial;
        this.nombreMaterial = nombreMaterial;
        this.descMaterial = descMaterial;
    }

    public Short getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Short idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public String getDescMaterial() {
        return descMaterial;
    }

    public void setDescMaterial(String descMaterial) {
        this.descMaterial = descMaterial;
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
        hash += (idMaterial != null ? idMaterial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Material)) {
            return false;
        }
        Material other = (Material) object;
        if ((this.idMaterial == null && other.idMaterial != null) || (this.idMaterial != null && !this.idMaterial.equals(other.idMaterial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "primavera.Material[ idMaterial=" + idMaterial + " ]";
    }
    
}
