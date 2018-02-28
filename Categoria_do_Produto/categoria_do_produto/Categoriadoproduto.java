/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package categoria_do_produto;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "CATEGORIADOPRODUTO", catalog = "", schema = "SCHEMAJMARY")
@NamedQueries({
    @NamedQuery(name = "Categoriadoproduto.findAll", query = "SELECT c FROM Categoriadoproduto c"),
    @NamedQuery(name = "Categoriadoproduto.findById", query = "SELECT c FROM Categoriadoproduto c WHERE c.id = :id"),
    @NamedQuery(name = "Categoriadoproduto.findByNomedacategoriadoproduto", query = "SELECT c FROM Categoriadoproduto c WHERE c.nomedacategoriadoproduto = :nomedacategoriadoproduto")})
public class Categoriadoproduto implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Column(name = "NOMEDACATEGORIADOPRODUTO", length = 300)
    private String nomedacategoriadoproduto;

    public Categoriadoproduto() {
    }

    public Categoriadoproduto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNomedacategoriadoproduto() {
        return nomedacategoriadoproduto;
    }

    public void setNomedacategoriadoproduto(String nomedacategoriadoproduto) {
        String oldNomedacategoriadoproduto = this.nomedacategoriadoproduto;
        this.nomedacategoriadoproduto = nomedacategoriadoproduto;
        changeSupport.firePropertyChange("nomedacategoriadoproduto", oldNomedacategoriadoproduto, nomedacategoriadoproduto);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoriadoproduto)) {
            return false;
        }
        Categoriadoproduto other = (Categoriadoproduto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Categoriadoproduto[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
