/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package produto;

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
 * @author caixa
 */
@Entity
@Table(name = "PRODUTO", catalog = "", schema = "SCHEMAJMARY")
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.findById", query = "SELECT p FROM Produto p WHERE p.id = :id"),
    @NamedQuery(name = "Produto.findByCodigoproduto", query = "SELECT p FROM Produto p WHERE p.codigoproduto = :codigoproduto"),
    @NamedQuery(name = "Produto.findByDescricaoproduto", query = "SELECT p FROM Produto p WHERE p.descricaoproduto = :descricaoproduto"),
    @NamedQuery(name = "Produto.findByNomedacategoriadoproduto", query = "SELECT p FROM Produto p WHERE p.nomedacategoriadoproduto = :nomedacategoriadoproduto"),
    @NamedQuery(name = "Produto.findByNomedaembalagem", query = "SELECT p FROM Produto p WHERE p.nomedaembalagem = :nomedaembalagem"),
    @NamedQuery(name = "Produto.findByCodigodaembalagem", query = "SELECT p FROM Produto p WHERE p.codigodaembalagem = :codigodaembalagem"),
    @NamedQuery(name = "Produto.findByQuantidadedeitensnaembalagem", query = "SELECT p FROM Produto p WHERE p.quantidadedeitensnaembalagem = :quantidadedeitensnaembalagem"),
    @NamedQuery(name = "Produto.findByIdCategoriadoproduto", query = "SELECT p FROM Produto p WHERE p.idCategoriadoproduto = :idCategoriadoproduto"),
    @NamedQuery(name = "Produto.findByIdEmbalagem", query = "SELECT p FROM Produto p WHERE p.idEmbalagem = :idEmbalagem")})
public class Produto implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Column(name = "CODIGOPRODUTO", length = 300)
    private String codigoproduto;
    @Column(name = "DESCRICAOPRODUTO", length = 300)
    private String descricaoproduto;
    @Column(name = "NOMEDACATEGORIADOPRODUTO", length = 300)
    private String nomedacategoriadoproduto;
    @Column(name = "NOMEDAEMBALAGEM", length = 300)
    private String nomedaembalagem;
    @Column(name = "CODIGODAEMBALAGEM", length = 300)
    private String codigodaembalagem;
    @Column(name = "QUANTIDADEDEITENSNAEMBALAGEM")
    private Integer quantidadedeitensnaembalagem;
    @Basic(optional = false)
    @Column(name = "ID_CATEGORIADOPRODUTO", nullable = false)
    private int idCategoriadoproduto;
    @Basic(optional = false)
    @Column(name = "ID_EMBALAGEM", nullable = false)
    private int idEmbalagem;

    public Produto() {
    }

    public Produto(Integer id) {
        this.id = id;
    }

    public Produto(Integer id, int idCategoriadoproduto, int idEmbalagem) {
        this.id = id;
        this.idCategoriadoproduto = idCategoriadoproduto;
        this.idEmbalagem = idEmbalagem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getCodigoproduto() {
        return codigoproduto;
    }

    public void setCodigoproduto(String codigoproduto) {
        String oldCodigoproduto = this.codigoproduto;
        this.codigoproduto = codigoproduto;
        changeSupport.firePropertyChange("codigoproduto", oldCodigoproduto, codigoproduto);
    }

    public String getDescricaoproduto() {
        return descricaoproduto;
    }

    public void setDescricaoproduto(String descricaoproduto) {
        String oldDescricaoproduto = this.descricaoproduto;
        this.descricaoproduto = descricaoproduto;
        changeSupport.firePropertyChange("descricaoproduto", oldDescricaoproduto, descricaoproduto);
    }

    public String getNomedacategoriadoproduto() {
        return nomedacategoriadoproduto;
    }

    public void setNomedacategoriadoproduto(String nomedacategoriadoproduto) {
        String oldNomedacategoriadoproduto = this.nomedacategoriadoproduto;
        this.nomedacategoriadoproduto = nomedacategoriadoproduto;
        changeSupport.firePropertyChange("nomedacategoriadoproduto", oldNomedacategoriadoproduto, nomedacategoriadoproduto);
    }

    public String getNomedaembalagem() {
        return nomedaembalagem;
    }

    public void setNomedaembalagem(String nomedaembalagem) {
        String oldNomedaembalagem = this.nomedaembalagem;
        this.nomedaembalagem = nomedaembalagem;
        changeSupport.firePropertyChange("nomedaembalagem", oldNomedaembalagem, nomedaembalagem);
    }

    public String getCodigodaembalagem() {
        return codigodaembalagem;
    }

    public void setCodigodaembalagem(String codigodaembalagem) {
        String oldCodigodaembalagem = this.codigodaembalagem;
        this.codigodaembalagem = codigodaembalagem;
        changeSupport.firePropertyChange("codigodaembalagem", oldCodigodaembalagem, codigodaembalagem);
    }

    public Integer getQuantidadedeitensnaembalagem() {
        return quantidadedeitensnaembalagem;
    }

    public void setQuantidadedeitensnaembalagem(Integer quantidadedeitensnaembalagem) {
        Integer oldQuantidadedeitensnaembalagem = this.quantidadedeitensnaembalagem;
        this.quantidadedeitensnaembalagem = quantidadedeitensnaembalagem;
        changeSupport.firePropertyChange("quantidadedeitensnaembalagem", oldQuantidadedeitensnaembalagem, quantidadedeitensnaembalagem);
    }

    public int getIdCategoriadoproduto() {
        return idCategoriadoproduto;
    }

    public void setIdCategoriadoproduto(int idCategoriadoproduto) {
        int oldIdCategoriadoproduto = this.idCategoriadoproduto;
        this.idCategoriadoproduto = idCategoriadoproduto;
        changeSupport.firePropertyChange("idCategoriadoproduto", oldIdCategoriadoproduto, idCategoriadoproduto);
    }

    public int getIdEmbalagem() {
        return idEmbalagem;
    }

    public void setIdEmbalagem(int idEmbalagem) {
        int oldIdEmbalagem = this.idEmbalagem;
        this.idEmbalagem = idEmbalagem;
        changeSupport.firePropertyChange("idEmbalagem", oldIdEmbalagem, idEmbalagem);
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
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testes.Produto[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
