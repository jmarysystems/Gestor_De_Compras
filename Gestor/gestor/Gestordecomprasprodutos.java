/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestor;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "GESTORDECOMPRASPRODUTOS", catalog = "", schema = "SCHEMAJMARY")
@NamedQueries({
    @NamedQuery(name = "Gestordecomprasprodutos.findAll", query = "SELECT g FROM Gestordecomprasprodutos g"),
    @NamedQuery(name = "Gestordecomprasprodutos.findById", query = "SELECT g FROM Gestordecomprasprodutos g WHERE g.id = :id"),
    @NamedQuery(name = "Gestordecomprasprodutos.findByCodigoproduto", query = "SELECT g FROM Gestordecomprasprodutos g WHERE g.codigoproduto = :codigoproduto"),
    @NamedQuery(name = "Gestordecomprasprodutos.findByDescricaoproduto", query = "SELECT g FROM Gestordecomprasprodutos g WHERE g.descricaoproduto = :descricaoproduto"),
    @NamedQuery(name = "Gestordecomprasprodutos.findByCusto", query = "SELECT g FROM Gestordecomprasprodutos g WHERE g.custo = :custo"),
    @NamedQuery(name = "Gestordecomprasprodutos.findByVenda", query = "SELECT g FROM Gestordecomprasprodutos g WHERE g.venda = :venda"),
    @NamedQuery(name = "Gestordecomprasprodutos.findByEstoque", query = "SELECT g FROM Gestordecomprasprodutos g WHERE g.estoque = :estoque"),
    @NamedQuery(name = "Gestordecomprasprodutos.findByPedido", query = "SELECT g FROM Gestordecomprasprodutos g WHERE g.pedido = :pedido"),
    @NamedQuery(name = "Gestordecomprasprodutos.findByData", query = "SELECT g FROM Gestordecomprasprodutos g WHERE g.data = :data"),
    @NamedQuery(name = "Gestordecomprasprodutos.findByIdCategoriadoproduto", query = "SELECT g FROM Gestordecomprasprodutos g WHERE g.idCategoriadoproduto = :idCategoriadoproduto"),
    @NamedQuery(name = "Gestordecomprasprodutos.findByIdProduto", query = "SELECT g FROM Gestordecomprasprodutos g WHERE g.idProduto = :idProduto"),
    @NamedQuery(name = "Gestordecomprasprodutos.findByIdGestordecompras", query = "SELECT g FROM Gestordecomprasprodutos g WHERE g.idGestordecompras = :idGestordecompras"),
    @NamedQuery(name = "Gestordecomprasprodutos.findByIdFornecedor", query = "SELECT g FROM Gestordecomprasprodutos g WHERE g.idFornecedor = :idFornecedor")})
public class Gestordecomprasprodutos implements Serializable {
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CUSTO", precision = 52)
    private Double custo;
    @Column(name = "VENDA")
    private Integer venda;
    @Column(name = "ESTOQUE")
    private Integer estoque;
    @Column(name = "PEDIDO")
    private Integer pedido;
    @Basic(optional = false)
    @Column(name = "DATA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @Column(name = "ID_CATEGORIADOPRODUTO", nullable = false)
    private int idCategoriadoproduto;
    @Basic(optional = false)
    @Column(name = "ID_PRODUTO", nullable = false)
    private int idProduto;
    @Basic(optional = false)
    @Column(name = "ID_GESTORDECOMPRAS", nullable = false)
    private int idGestordecompras;
    @Basic(optional = false)
    @Column(name = "ID_FORNECEDOR", nullable = false)
    private int idFornecedor;

    public Gestordecomprasprodutos() {
    }

    public Gestordecomprasprodutos(Integer id) {
        this.id = id;
    }

    public Gestordecomprasprodutos(Integer id, Date data, int idCategoriadoproduto, int idProduto, int idGestordecompras, int idFornecedor) {
        this.id = id;
        this.data = data;
        this.idCategoriadoproduto = idCategoriadoproduto;
        this.idProduto = idProduto;
        this.idGestordecompras = idGestordecompras;
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

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        Double oldCusto = this.custo;
        this.custo = custo;
        changeSupport.firePropertyChange("custo", oldCusto, custo);
    }

    public Integer getVenda() {
        return venda;
    }

    public void setVenda(Integer venda) {
        Integer oldVenda = this.venda;
        this.venda = venda;
        changeSupport.firePropertyChange("venda", oldVenda, venda);
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        Integer oldEstoque = this.estoque;
        this.estoque = estoque;
        changeSupport.firePropertyChange("estoque", oldEstoque, estoque);
    }

    public Integer getPedido() {
        return pedido;
    }

    public void setPedido(Integer pedido) {
        Integer oldPedido = this.pedido;
        this.pedido = pedido;
        changeSupport.firePropertyChange("pedido", oldPedido, pedido);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        Date oldData = this.data;
        this.data = data;
        changeSupport.firePropertyChange("data", oldData, data);
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

    public int getIdGestordecompras() {
        return idGestordecompras;
    }

    public void setIdGestordecompras(int idGestordecompras) {
        int oldIdGestordecompras = this.idGestordecompras;
        this.idGestordecompras = idGestordecompras;
        changeSupport.firePropertyChange("idGestordecompras", oldIdGestordecompras, idGestordecompras);
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
        if (!(object instanceof Gestordecomprasprodutos)) {
            return false;
        }
        Gestordecomprasprodutos other = (Gestordecomprasprodutos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "teste.Gestordecomprasprodutos[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
