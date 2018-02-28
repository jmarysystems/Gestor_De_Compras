/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package syspdv;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "PRODUTOAUX", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Produtoaux.findAll", query = "SELECT p FROM Produtoaux p"),
    @NamedQuery(name = "Produtoaux.findByProcodaux", query = "SELECT p FROM Produtoaux p WHERE p.procodaux = :procodaux"),
    @NamedQuery(name = "Produtoaux.findByProcod", query = "SELECT p FROM Produtoaux p WHERE p.procod = :procod"),
    @NamedQuery(name = "Produtoaux.findByProfatormult", query = "SELECT p FROM Produtoaux p WHERE p.profatormult = :profatormult")})
public class Produtoaux implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PROCODAUX")
    private String procodaux;
    @Column(name = "PROCOD")
    private String procod;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PROFATORMULT")
    private BigDecimal profatormult;

    public Produtoaux() {
    }

    public Produtoaux(String procodaux) {
        this.procodaux = procodaux;
    }

    public String getProcodaux() {
        return procodaux;
    }

    public void setProcodaux(String procodaux) {
        String oldProcodaux = this.procodaux;
        this.procodaux = procodaux;
        changeSupport.firePropertyChange("procodaux", oldProcodaux, procodaux);
    }

    public String getProcod() {
        return procod;
    }

    public void setProcod(String procod) {
        String oldProcod = this.procod;
        this.procod = procod;
        changeSupport.firePropertyChange("procod", oldProcod, procod);
    }

    public BigDecimal getProfatormult() {
        return profatormult;
    }

    public void setProfatormult(BigDecimal profatormult) {
        BigDecimal oldProfatormult = this.profatormult;
        this.profatormult = profatormult;
        changeSupport.firePropertyChange("profatormult", oldProfatormult, profatormult);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (procodaux != null ? procodaux.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produtoaux)) {
            return false;
        }
        Produtoaux other = (Produtoaux) object;
        if ((this.procodaux == null && other.procodaux != null) || (this.procodaux != null && !this.procodaux.equals(other.procodaux))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "teste2.Produtoaux[ procodaux=" + procodaux + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
