/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primavera;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "PERSONAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personal.findAll", query = "SELECT p FROM Personal p"),
    @NamedQuery(name = "Personal.findByIdentificacion", query = "SELECT p FROM Personal p WHERE p.identificacion = :identificacion"),
    @NamedQuery(name = "Personal.findByNombrePers", query = "SELECT p FROM Personal p WHERE p.nombrePers = :nombrePers"),
    @NamedQuery(name = "Personal.findByTelefonoPers", query = "SELECT p FROM Personal p WHERE p.telefonoPers = :telefonoPers"),
    @NamedQuery(name = "Personal.findByCorreoPers", query = "SELECT p FROM Personal p WHERE p.correoPers = :correoPers"),
    @NamedQuery(name = "Personal.findByEstadoPers", query = "SELECT p FROM Personal p WHERE p.estadoPers = :estadoPers"),
    @NamedQuery(name = "Personal.findBySalarioPers", query = "SELECT p FROM Personal p WHERE p.salarioPers = :salarioPers")})
public class Personal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDENTIFICACION")
    private Long identificacion;
    @Basic(optional = false)
    @Column(name = "NOMBRE_PERS")
    private String nombrePers;
    @Basic(optional = false)
    @Column(name = "TELEFONO_PERS")
    private String telefonoPers;
    @Basic(optional = false)
    @Column(name = "CORREO_PERS")
    private String correoPers;
    @Basic(optional = false)
    @Column(name = "ESTADO_PERS")
    private String estadoPers;
    @Basic(optional = false)
    @Column(name = "SALARIO_PERS")
    private int salarioPers;
    @JoinColumn(name = "ID_EPS", referencedColumnName = "ID_EPS")
    @ManyToOne(optional = false)
    private Eps idEps;
    @JoinColumn(name = "ID_PROFESION", referencedColumnName = "ID_PROFESION")
    @ManyToOne(optional = false)
    private Profesion idProfesion;
    @JoinColumn(name = "ID_SUBSISTEMA", referencedColumnName = "ID_SUBSISTEMA")
    @ManyToOne(optional = false)
    private Subsistema idSubsistema;
    @JoinColumn(name = "ID_TIPOPERSONA", referencedColumnName = "ID_TIPOPERSONA")
    @ManyToOne(optional = false)
    private TipoPersona idTipopersona;
    @JoinColumn(name = "TIPO_SANGRE", referencedColumnName = "ID_SANGRE")
    @ManyToOne(optional = false)
    private TipoSangre tipoSangre;

    public Personal() {
    }

    public Personal(Long identificacion) {
        this.identificacion = identificacion;
    }

    public Personal(Long identificacion, String nombrePers, String telefonoPers, String correoPers, String estadoPers, int salarioPers) {
        this.identificacion = identificacion;
        this.nombrePers = nombrePers;
        this.telefonoPers = telefonoPers;
        this.correoPers = correoPers;
        this.estadoPers = estadoPers;
        this.salarioPers = salarioPers;
    }

    public Long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Long identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombrePers() {
        return nombrePers;
    }

    public void setNombrePers(String nombrePers) {
        this.nombrePers = nombrePers;
    }

    public String getTelefonoPers() {
        return telefonoPers;
    }

    public void setTelefonoPers(String telefonoPers) {
        this.telefonoPers = telefonoPers;
    }

    public String getCorreoPers() {
        return correoPers;
    }

    public void setCorreoPers(String correoPers) {
        this.correoPers = correoPers;
    }

    public String getEstadoPers() {
        return estadoPers;
    }

    public void setEstadoPers(String estadoPers) {
        this.estadoPers = estadoPers;
    }

    public int getSalarioPers() {
        return salarioPers;
    }

    public void setSalarioPers(int salarioPers) {
        this.salarioPers = salarioPers;
    }

    public Eps getIdEps() {
        return idEps;
    }

    public void setIdEps(Eps idEps) {
        this.idEps = idEps;
    }

    public Profesion getIdProfesion() {
        return idProfesion;
    }

    public void setIdProfesion(Profesion idProfesion) {
        this.idProfesion = idProfesion;
    }

    public Subsistema getIdSubsistema() {
        return idSubsistema;
    }

    public void setIdSubsistema(Subsistema idSubsistema) {
        this.idSubsistema = idSubsistema;
    }

    public TipoPersona getIdTipopersona() {
        return idTipopersona;
    }

    public void setIdTipopersona(TipoPersona idTipopersona) {
        this.idTipopersona = idTipopersona;
    }

    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identificacion != null ? identificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personal)) {
            return false;
        }
        Personal other = (Personal) object;
        if ((this.identificacion == null && other.identificacion != null) || (this.identificacion != null && !this.identificacion.equals(other.identificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "primavera.Personal[ identificacion=" + identificacion + " ]";
    }
    
}
