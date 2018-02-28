/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package produto_por_fornecedor;

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
@Table(name = "PRODUTOPORFORNECEDOR", catalog = "", schema = "SCHEMAJMARY")
@NamedQueries({
    @NamedQuery(name = "Produtoporfornecedor.findAll", query = "SELECT p FROM Produtoporfornecedor p"),
    @NamedQuery(name = "Produtoporfornecedor.findById", query = "SELECT p FROM Produtoporfornecedor p WHERE p.id = :id"),
    @NamedQuery(name = "Produtoporfornecedor.findByNomeourazaosocial", query = "SELECT p FROM Produtoporfornecedor p WHERE p.nomeourazaosocial = :nomeourazaosocial"),
    @NamedQuery(name = "Produtoporfornecedor.findByNomefantasia", query = "SELECT p FROM Produtoporfornecedor p WHERE p.nomefantasia = :nomefantasia"),
    @NamedQuery(name = "Produtoporfornecedor.findByCodigoproduto", query = "SELECT p FROM Produtoporfornecedor p WHERE p.codigoproduto = :codigoproduto"),
    @NamedQuery(name = "Produtoporfornecedor.findByDescricaoproduto", query = "SELECT p FROM Produtoporfornecedor p WHERE p.descricaoproduto = :descricaoproduto"),
    @NamedQuery(name = "Produtoporfornecedor.findByNomedacategoriadoproduto", query = "SELECT p FROM Produtoporfornecedor p WHERE p.nomedacategoriadoproduto = :nomedacategoriadoproduto"),
    @NamedQuery(name = "Produtoporfornecedor.findByNomedaembalagem", query = "SELECT p FROM Produtoporfornecedor p WHERE p.nomedaembalagem = :nomedaembalagem"),
    @NamedQuery(name = "Produtoporfornecedor.findByCodigodaembalagem", query = "SELECT p FROM Produtoporfornecedor p WHERE p.codigodaembalagem = :codigodaembalagem"),
    @NamedQuery(name = "Produtoporfornecedor.findByQuantidadedeitensnaembalagem", query = "SELECT p FROM Produtoporfornecedor p WHERE p.quantidadedeitensnaembalagem = :quantidadedeitensnaembalagem"),
    @NamedQuery(name = "Produtoporfornecedor.findByIdEmbalagem", query = "SELECT p FROM Produtoporfornecedor p WHERE p.idEmbalagem = :idEmbalagem"),
    @NamedQuery(name = "Produtoporfornecedor.findByIdCategoriadoproduto", query = "SELECT p FROM Produtoporfornecedor p WHERE p.idCategoriadoproduto = :idCategoriadoproduto"),
    @NamedQuery(name = "Produtoporfornecedor.findByIdProduto", query = "SELECT p FROM Produtoporfornecedor p WHERE p.idProduto = :idProduto"),
    @NamedQuery(name = "Produtoporfornecedor.findByIdFornecedor", query = "SELECT p FROM Produtoporfornecedor p WHERE p.idFornecedor = :idFornecedor")})
public class Produtoporfornecedor implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Column(name = "NOMEOURAZAOSOCIAL", length = 300)
    private String nomeourazaosocial;
    @Column(name = "NOMEFANTASIA", length = 300)
    private String nomefantasia;
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
    @Column(name = "ID_EMBALAGEM", nullable = false)
    private int idEmbalagem;
    @Basic(optional = false)
    @Column(name = "ID_CATEGORIADOPRODUTO", nullable = false)
    private int idCategoriadoproduto;
    @Basic(optional = false)
    @Column(name = "ID_PRODUTO", nullable = false)
    private int idProduto;
    @Basic(optional = false)
    @Column(name = "ID_FORNECEDOR", nullable = false)
    private int idFornecedor;

    public Produtoporfornecedor() {
    }

    public Produtoporfornecedor(Integer id) {
        this.id = id;
    }

    public Produtoporfornecedor(Integer id, int idEmbalagem, int idCategoriadoproduto, int idProduto, int idFornecedor) {
        this.id = id;
        this.idEmbalagem = idEmbalagem;
        this.idCategoriadoproduto = idCategoriadoproduto;
        this.idProduto = idProduto;
        this.idFornecedor = idFornecedor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNomeourazaosocial() {
        return nomeourazaosocial;
    }

    public void setNomeourazaosocial(String nomeourazaosocial) {
        String oldNomeourazaosocial = this.nomeourazaosocial;
        this.nomeourazaosocial = nomeourazaosocial;
        changeSupport.firePropertyChange("nomeourazaosocial", oldNomeourazaosocial, nomeourazaosocial);
    }

    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        String oldNomefantasia = this.nomefantasia;
        this.nomefantasia = nomefantasia;
        changeSupport.firePropertyChange("nomefantasia", oldNomefantasia, nomefantasia);
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

    public int getIdEmbalagem() {
        return idEmbalagem;
    }

    public void setIdEmbalagem(int idEmbalagem) {
        int oldIdEmbalagem = this.idEmbalagem;
        this.idEmbalagem = idEmbalagem;
        changeSupport.firePropertyChange("idEmbalagem", oldIdEmbalagem, idEmbalagem);
    }

    public int getIdCategoriadoproduto() {
        return idCategoriadoproduto;
    }

    public void setIdCategoriadoproduto(int idCategoriadoproduto) {
        int oldIdCategoriadoproduto = this.idCategoriadoproduto;
        this.idCategoriadoproduto = idCategoriadoproduto;
        changeSupport.firePropertyChange("idCategoriadoproduto", oldIdCategoriadoproduto, idCategoriadoproduto);
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        int oldIdProduto = this.idProduto;
        this.idProduto = idProduto;
        changeSupport.firePropertyChange("idProduto", oldIdProduto, idProduto);
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        int oldIdFornecedor = this.idFornecedor;
        this.idFornecedor = idFornecedor;
        changeSupport.firePropertyChange("idFornecedor", oldIdFornecedor, idFornecedor);
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
        if (!(object instanceof Produtoporfornecedor)) {
            return false;
        }
        Produtoporfornecedor other = (Produtoporfornecedor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Produtoporfornecedor[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
