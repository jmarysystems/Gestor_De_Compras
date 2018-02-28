/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuario;

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
@Table(name = "USUARIO", catalog = "", schema = "SCHEMAJMARY")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findById", query = "SELECT u FROM Usuario u WHERE u.id = :id"),
    @NamedQuery(name = "Usuario.findByLogin", query = "SELECT u FROM Usuario u WHERE u.login = :login"),
    @NamedQuery(name = "Usuario.findBySenha", query = "SELECT u FROM Usuario u WHERE u.senha = :senha"),
    @NamedQuery(name = "Usuario.findByPermitiracesso", query = "SELECT u FROM Usuario u WHERE u.permitiracesso = :permitiracesso"),
    @NamedQuery(name = "Usuario.findByCadastrarusuario", query = "SELECT u FROM Usuario u WHERE u.cadastrarusuario = :cadastrarusuario"),
    @NamedQuery(name = "Usuario.findByCadastrarfornecedor", query = "SELECT u FROM Usuario u WHERE u.cadastrarfornecedor = :cadastrarfornecedor"),
    @NamedQuery(name = "Usuario.findByCadastrarproduto", query = "SELECT u FROM Usuario u WHERE u.cadastrarproduto = :cadastrarproduto"),
    @NamedQuery(name = "Usuario.findByCadastrarprodutoporfornecedor", query = "SELECT u FROM Usuario u WHERE u.cadastrarprodutoporfornecedor = :cadastrarprodutoporfornecedor"),
    @NamedQuery(name = "Usuario.findByCadastrargestordecompras", query = "SELECT u FROM Usuario u WHERE u.cadastrargestordecompras = :cadastrargestordecompras"),
    @NamedQuery(name = "Usuario.findByAlterarusuario", query = "SELECT u FROM Usuario u WHERE u.alterarusuario = :alterarusuario"),
    @NamedQuery(name = "Usuario.findByAlterarfornecedor", query = "SELECT u FROM Usuario u WHERE u.alterarfornecedor = :alterarfornecedor"),
    @NamedQuery(name = "Usuario.findByAlterarproduto", query = "SELECT u FROM Usuario u WHERE u.alterarproduto = :alterarproduto"),
    @NamedQuery(name = "Usuario.findByAlterarprodutoporfornecedor", query = "SELECT u FROM Usuario u WHERE u.alterarprodutoporfornecedor = :alterarprodutoporfornecedor"),
    @NamedQuery(name = "Usuario.findByAlterargestordecompras", query = "SELECT u FROM Usuario u WHERE u.alterargestordecompras = :alterargestordecompras"),
    @NamedQuery(name = "Usuario.findByAlterargestordecomprascusto", query = "SELECT u FROM Usuario u WHERE u.alterargestordecomprascusto = :alterargestordecomprascusto"),
    @NamedQuery(name = "Usuario.findByAlterargestordecomprasvenda", query = "SELECT u FROM Usuario u WHERE u.alterargestordecomprasvenda = :alterargestordecomprasvenda"),
    @NamedQuery(name = "Usuario.findByAlterargestordecomprasestoque", query = "SELECT u FROM Usuario u WHERE u.alterargestordecomprasestoque = :alterargestordecomprasestoque"),
    @NamedQuery(name = "Usuario.findByAlterargestordecompraspedido", query = "SELECT u FROM Usuario u WHERE u.alterargestordecompraspedido = :alterargestordecompraspedido"),
    @NamedQuery(name = "Usuario.findByExcluirusuario", query = "SELECT u FROM Usuario u WHERE u.excluirusuario = :excluirusuario"),
    @NamedQuery(name = "Usuario.findByExcluirfornecedor", query = "SELECT u FROM Usuario u WHERE u.excluirfornecedor = :excluirfornecedor"),
    @NamedQuery(name = "Usuario.findByExcluirproduto", query = "SELECT u FROM Usuario u WHERE u.excluirproduto = :excluirproduto"),
    @NamedQuery(name = "Usuario.findByExcluirprodutoporfornecedor", query = "SELECT u FROM Usuario u WHERE u.excluirprodutoporfornecedor = :excluirprodutoporfornecedor"),
    @NamedQuery(name = "Usuario.findByExcluirgestordecompras", query = "SELECT u FROM Usuario u WHERE u.excluirgestordecompras = :excluirgestordecompras"),
    @NamedQuery(name = "Usuario.findByPesquisarusuario", query = "SELECT u FROM Usuario u WHERE u.pesquisarusuario = :pesquisarusuario"),
    @NamedQuery(name = "Usuario.findByPesquisarfornecedor", query = "SELECT u FROM Usuario u WHERE u.pesquisarfornecedor = :pesquisarfornecedor"),
    @NamedQuery(name = "Usuario.findByPesquisarproduto", query = "SELECT u FROM Usuario u WHERE u.pesquisarproduto = :pesquisarproduto"),
    @NamedQuery(name = "Usuario.findByPesquisarprodutoporfornecedor", query = "SELECT u FROM Usuario u WHERE u.pesquisarprodutoporfornecedor = :pesquisarprodutoporfornecedor"),
    @NamedQuery(name = "Usuario.findByPesquisargestordecompras", query = "SELECT u FROM Usuario u WHERE u.pesquisargestordecompras = :pesquisargestordecompras")})
public class Usuario implements Serializable { 
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Column(name = "LOGIN", length = 300)
    private String login;
    @Column(name = "SENHA", length = 300)
    private String senha;
    @Column(name = "PERMITIRACESSO")
    private boolean permitiracesso;
    @Column(name = "CADASTRARUSUARIO")
    private boolean cadastrarusuario;
    @Column(name = "CADASTRARFORNECEDOR")
    private boolean cadastrarfornecedor;
    @Column(name = "CADASTRARPRODUTO")
    private boolean cadastrarproduto;
    @Column(name = "CADASTRARPRODUTOPORFORNECEDOR")
    private boolean cadastrarprodutoporfornecedor;
    @Column(name = "CADASTRARGESTORDECOMPRAS")
    private boolean cadastrargestordecompras;
    @Column(name = "ALTERARUSUARIO")
    private boolean alterarusuario;
    @Column(name = "ALTERARFORNECEDOR")
    private boolean alterarfornecedor;
    @Column(name = "ALTERARPRODUTO")
    private boolean alterarproduto;
    @Column(name = "ALTERARPRODUTOPORFORNECEDOR")
    private boolean alterarprodutoporfornecedor;
    @Column(name = "ALTERARGESTORDECOMPRAS")
    private boolean alterargestordecompras;
    @Column(name = "ALTERARGESTORDECOMPRASCUSTO")
    private boolean alterargestordecomprascusto;
    @Column(name = "ALTERARGESTORDECOMPRASVENDA")
    private boolean alterargestordecomprasvenda;
    @Column(name = "ALTERARGESTORDECOMPRASESTOQUE")
    private boolean alterargestordecomprasestoque;
    @Column(name = "ALTERARGESTORDECOMPRASPEDIDO")
    private boolean alterargestordecompraspedido;
    @Column(name = "EXCLUIRUSUARIO")
    private boolean excluirusuario;
    @Column(name = "EXCLUIRFORNECEDOR")
    private boolean excluirfornecedor;
    @Column(name = "EXCLUIRPRODUTO")
    private boolean excluirproduto;
    @Column(name = "EXCLUIRPRODUTOPORFORNECEDOR")
    private boolean excluirprodutoporfornecedor;
    @Column(name = "EXCLUIRGESTORDECOMPRAS")
    private boolean excluirgestordecompras;
    @Column(name = "PESQUISARUSUARIO")
    private boolean pesquisarusuario;
    @Column(name = "PESQUISARFORNECEDOR")
    private boolean pesquisarfornecedor;
    @Column(name = "PESQUISARPRODUTO")
    private boolean pesquisarproduto;
    @Column(name = "PESQUISARPRODUTOPORFORNECEDOR")
    private boolean pesquisarprodutoporfornecedor;
    @Column(name = "PESQUISARGESTORDECOMPRAS")
    private boolean pesquisargestordecompras;

    public Usuario() {
    }

    public Usuario(Integer id) {
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        String oldLogin = this.login;
        this.login = login;
        changeSupport.firePropertyChange("login", oldLogin, login);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        String oldSenha = this.senha;
        this.senha = senha;
        changeSupport.firePropertyChange("senha", oldSenha, senha);
    }

    public boolean getPermitiracesso() {
        return permitiracesso;
    }

    public void setPermitiracesso(boolean permitiracesso) {
        boolean oldPermitiracesso = this.permitiracesso;
        this.permitiracesso = permitiracesso;
        changeSupport.firePropertyChange("permitiracesso", oldPermitiracesso, permitiracesso);
    }

    public boolean getCadastrarusuario() {
        return cadastrarusuario;
    }

    public void setCadastrarusuario(boolean cadastrarusuario) {
        boolean oldCadastrarusuario = this.cadastrarusuario;
        this.cadastrarusuario = cadastrarusuario;
        changeSupport.firePropertyChange("cadastrarusuario", oldCadastrarusuario, cadastrarusuario);
    }

    public boolean getCadastrarfornecedor() {
        return cadastrarfornecedor;
    }

    public void setCadastrarfornecedor(boolean cadastrarfornecedor) {
        boolean oldCadastrarfornecedor = this.cadastrarfornecedor;
        this.cadastrarfornecedor = cadastrarfornecedor;
        changeSupport.firePropertyChange("cadastrarfornecedor", oldCadastrarfornecedor, cadastrarfornecedor);
    }

    public boolean getCadastrarproduto() {
        return cadastrarproduto;
    }

    public void setCadastrarproduto(boolean cadastrarproduto) {
        boolean oldCadastrarproduto = this.cadastrarproduto;
        this.cadastrarproduto = cadastrarproduto;
        changeSupport.firePropertyChange("cadastrarproduto", oldCadastrarproduto, cadastrarproduto);
    }

    public boolean getCadastrarprodutoporfornecedor() {
        return cadastrarprodutoporfornecedor;
    }

    public void setCadastrarprodutoporfornecedor(boolean cadastrarprodutoporfornecedor) {
        boolean oldCadastrarprodutoporfornecedor = this.cadastrarprodutoporfornecedor;
        this.cadastrarprodutoporfornecedor = cadastrarprodutoporfornecedor;
        changeSupport.firePropertyChange("cadastrarprodutoporfornecedor", oldCadastrarprodutoporfornecedor, cadastrarprodutoporfornecedor);
    }

    public boolean getCadastrargestordecompras() {
        return cadastrargestordecompras;
    }

    public void setCadastrargestordecompras(boolean cadastrargestordecompras) {
        boolean oldCadastrargestordecompras = this.cadastrargestordecompras;
        this.cadastrargestordecompras = cadastrargestordecompras;
        changeSupport.firePropertyChange("cadastrargestordecompras", oldCadastrargestordecompras, cadastrargestordecompras);
    }

    public boolean getAlterarusuario() {
        return alterarusuario;
    }

    public void setAlterarusuario(boolean alterarusuario) {
        boolean oldAlterarusuario = this.alterarusuario;
        this.alterarusuario = alterarusuario;
        changeSupport.firePropertyChange("alterarusuario", oldAlterarusuario, alterarusuario);
    }

    public boolean getAlterarfornecedor() {
        return alterarfornecedor;
    }

    public void setAlterarfornecedor(boolean alterarfornecedor) {
        boolean oldAlterarfornecedor = this.alterarfornecedor;
        this.alterarfornecedor = alterarfornecedor;
        changeSupport.firePropertyChange("alterarfornecedor", oldAlterarfornecedor, alterarfornecedor);
    }

    public boolean getAlterarproduto() {
        return alterarproduto;
    }

    public void setAlterarproduto(boolean alterarproduto) {
        boolean oldAlterarproduto = this.alterarproduto;
        this.alterarproduto = alterarproduto;
        changeSupport.firePropertyChange("alterarproduto", oldAlterarproduto, alterarproduto);
    }

    public boolean getAlterarprodutoporfornecedor() {
        return alterarprodutoporfornecedor;
    }

    public void setAlterarprodutoporfornecedor(boolean alterarprodutoporfornecedor) {
        boolean oldAlterarprodutoporfornecedor = this.alterarprodutoporfornecedor;
        this.alterarprodutoporfornecedor = alterarprodutoporfornecedor;
        changeSupport.firePropertyChange("alterarprodutoporfornecedor", oldAlterarprodutoporfornecedor, alterarprodutoporfornecedor);
    }

    public boolean getAlterargestordecompras() {
        return alterargestordecompras;
    }

    public void setAlterargestordecompras(boolean alterargestordecompras) {
        boolean oldAlterargestordecompras = this.alterargestordecompras;
        this.alterargestordecompras = alterargestordecompras;
        changeSupport.firePropertyChange("alterargestordecompras", oldAlterargestordecompras, alterargestordecompras);
    }

    public boolean getAlterargestordecomprascusto() {
        return alterargestordecomprascusto;
    }

    public void setAlterargestordecomprascusto(boolean alterargestordecomprascusto) {
        boolean oldAlterargestordecomprascusto = this.alterargestordecomprascusto;
        this.alterargestordecomprascusto = alterargestordecomprascusto;
        changeSupport.firePropertyChange("alterargestordecomprascusto", oldAlterargestordecomprascusto, alterargestordecomprascusto);
    }

    public boolean getAlterargestordecomprasvenda() {
        return alterargestordecomprasvenda;
    }

    public void setAlterargestordecomprasvenda(boolean alterargestordecomprasvenda) {
        boolean oldAlterargestordecomprasvenda = this.alterargestordecomprasvenda;
        this.alterargestordecomprasvenda = alterargestordecomprasvenda;
        changeSupport.firePropertyChange("alterargestordecomprasvenda", oldAlterargestordecomprasvenda, alterargestordecomprasvenda);
    }

    public boolean getAlterargestordecomprasestoque() {
        return alterargestordecomprasestoque;
    }

    public void setAlterargestordecomprasestoque(boolean alterargestordecomprasestoque) {
        boolean oldAlterargestordecomprasestoque = this.alterargestordecomprasestoque;
        this.alterargestordecomprasestoque = alterargestordecomprasestoque;
        changeSupport.firePropertyChange("alterargestordecomprasestoque", oldAlterargestordecomprasestoque, alterargestordecomprasestoque);
    }

    public boolean getAlterargestordecompraspedido() {
        return alterargestordecompraspedido;
    }

    public void setAlterargestordecompraspedido(boolean alterargestordecompraspedido) {
        boolean oldAlterargestordecompraspedido = this.alterargestordecompraspedido;
        this.alterargestordecompraspedido = alterargestordecompraspedido;
        changeSupport.firePropertyChange("alterargestordecompraspedido", oldAlterargestordecompraspedido, alterargestordecompraspedido);
    }

    public boolean getExcluirusuario() {
        return excluirusuario;
    }

    public void setExcluirusuario(boolean excluirusuario) {
        boolean oldExcluirusuario = this.excluirusuario;
        this.excluirusuario = excluirusuario;
        changeSupport.firePropertyChange("excluirusuario", oldExcluirusuario, excluirusuario);
    }

    public boolean getExcluirfornecedor() {
        return excluirfornecedor;
    }

    public void setExcluirfornecedor(boolean excluirfornecedor) {
        boolean oldExcluirfornecedor = this.excluirfornecedor;
        this.excluirfornecedor = excluirfornecedor;
        changeSupport.firePropertyChange("excluirfornecedor", oldExcluirfornecedor, excluirfornecedor);
    }

    public boolean getExcluirproduto() {
        return excluirproduto;
    }

    public void setExcluirproduto(boolean excluirproduto) {
        boolean oldExcluirproduto = this.excluirproduto;
        this.excluirproduto = excluirproduto;
        changeSupport.firePropertyChange("excluirproduto", oldExcluirproduto, excluirproduto);
    }

    public boolean getExcluirprodutoporfornecedor() {
        return excluirprodutoporfornecedor;
    }

    public void setExcluirprodutoporfornecedor(boolean excluirprodutoporfornecedor) {
        boolean oldExcluirprodutoporfornecedor = this.excluirprodutoporfornecedor;
        this.excluirprodutoporfornecedor = excluirprodutoporfornecedor;
        changeSupport.firePropertyChange("excluirprodutoporfornecedor", oldExcluirprodutoporfornecedor, excluirprodutoporfornecedor);
    }

    public boolean getExcluirgestordecompras() {
        return excluirgestordecompras;
    }

    public void setExcluirgestordecompras(boolean excluirgestordecompras) {
        boolean oldExcluirgestordecompras = this.excluirgestordecompras;
        this.excluirgestordecompras = excluirgestordecompras;
        changeSupport.firePropertyChange("excluirgestordecompras", oldExcluirgestordecompras, excluirgestordecompras);
    }

    public boolean getPesquisarusuario() {
        return pesquisarusuario;
    }

    public void setPesquisarusuario(boolean pesquisarusuario) {
        boolean oldPesquisarusuario = this.pesquisarusuario;
        this.pesquisarusuario = pesquisarusuario;
        changeSupport.firePropertyChange("pesquisarusuario", oldPesquisarusuario, pesquisarusuario);
    }

    public boolean getPesquisarfornecedor() {
        return pesquisarfornecedor;
    }

    public void setPesquisarfornecedor(boolean pesquisarfornecedor) {
        boolean oldPesquisarfornecedor = this.pesquisarfornecedor;
        this.pesquisarfornecedor = pesquisarfornecedor;
        changeSupport.firePropertyChange("pesquisarfornecedor", oldPesquisarfornecedor, pesquisarfornecedor);
    }

    public boolean getPesquisarproduto() {
        return pesquisarproduto;
    }

    public void setPesquisarproduto(boolean pesquisarproduto) {
        boolean oldPesquisarproduto = this.pesquisarproduto;
        this.pesquisarproduto = pesquisarproduto;
        changeSupport.firePropertyChange("pesquisarproduto", oldPesquisarproduto, pesquisarproduto);
    }

    public boolean getPesquisarprodutoporfornecedor() {
        return pesquisarprodutoporfornecedor;
    }

    public void setPesquisarprodutoporfornecedor(boolean pesquisarprodutoporfornecedor) {
        boolean oldPesquisarprodutoporfornecedor = this.pesquisarprodutoporfornecedor;
        this.pesquisarprodutoporfornecedor = pesquisarprodutoporfornecedor;
        changeSupport.firePropertyChange("pesquisarprodutoporfornecedor", oldPesquisarprodutoporfornecedor, pesquisarprodutoporfornecedor);
    }

    public boolean getPesquisargestordecompras() {
        return pesquisargestordecompras;
    }

    public void setPesquisargestordecompras(boolean pesquisargestordecompras) {
        boolean oldPesquisargestordecompras = this.pesquisargestordecompras;
        this.pesquisargestordecompras = pesquisargestordecompras;
        changeSupport.firePropertyChange("pesquisargestordecompras", oldPesquisargestordecompras, pesquisargestordecompras);
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Usuario[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
