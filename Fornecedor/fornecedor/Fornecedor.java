/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fornecedor;

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
@Table(name = "FORNECEDOR", catalog = "", schema = "SCHEMAJMARY")
@NamedQueries({
    @NamedQuery(name = "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f"),
    @NamedQuery(name = "Fornecedor.findById", query = "SELECT f FROM Fornecedor f WHERE f.id = :id"),
    @NamedQuery(name = "Fornecedor.findByNomeourazaosocial", query = "SELECT f FROM Fornecedor f WHERE f.nomeourazaosocial = :nomeourazaosocial"),
    @NamedQuery(name = "Fornecedor.findByNomefantasia", query = "SELECT f FROM Fornecedor f WHERE f.nomefantasia = :nomefantasia"),
    @NamedQuery(name = "Fornecedor.findByNomesupervisor", query = "SELECT f FROM Fornecedor f WHERE f.nomesupervisor = :nomesupervisor"),
    @NamedQuery(name = "Fornecedor.findByTelefonesupervisor", query = "SELECT f FROM Fornecedor f WHERE f.telefonesupervisor = :telefonesupervisor"),
    @NamedQuery(name = "Fornecedor.findByNomevendedor", query = "SELECT f FROM Fornecedor f WHERE f.nomevendedor = :nomevendedor"),
    @NamedQuery(name = "Fornecedor.findByTelefonevendedor", query = "SELECT f FROM Fornecedor f WHERE f.telefonevendedor = :telefonevendedor"),
    @NamedQuery(name = "Fornecedor.findByPrazodeentrega", query = "SELECT f FROM Fornecedor f WHERE f.prazodeentrega = :prazodeentrega"),
    @NamedQuery(name = "Fornecedor.findByPrazodepagamento", query = "SELECT f FROM Fornecedor f WHERE f.prazodepagamento = :prazodepagamento"),
    @NamedQuery(name = "Fornecedor.findByTipodepessoa", query = "SELECT f FROM Fornecedor f WHERE f.tipodepessoa = :tipodepessoa"),
    @NamedQuery(name = "Fornecedor.findByCnpj", query = "SELECT f FROM Fornecedor f WHERE f.cnpj = :cnpj")})
public class Fornecedor implements Serializable {
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
    @Column(name = "NOMESUPERVISOR", length = 300)
    private String nomesupervisor;
    @Column(name = "TELEFONESUPERVISOR", length = 300)
    private String telefonesupervisor;
    @Column(name = "NOMEVENDEDOR", length = 300)
    private String nomevendedor;
    @Column(name = "TELEFONEVENDEDOR", length = 300)
    private String telefonevendedor;
    @Column(name = "PRAZODEENTREGA", length = 300)
    private String prazodeentrega;
    @Column(name = "PRAZODEPAGAMENTO", length = 300)
    private String prazodepagamento;
    @Column(name = "TIPODEPESSOA", length = 300)
    private String tipodepessoa;
    @Column(name = "CNPJ", length = 300)
    private String cnpj;

    public Fornecedor() {
    }

    public Fornecedor(Integer id) {
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

    public String getNomesupervisor() {
        return nomesupervisor;
    }

    public void setNomesupervisor(String nomesupervisor) {
        String oldNomesupervisor = this.nomesupervisor;
        this.nomesupervisor = nomesupervisor;
        changeSupport.firePropertyChange("nomesupervisor", oldNomesupervisor, nomesupervisor);
    }

    public String getTelefonesupervisor() {
        return telefonesupervisor;
    }

    public void setTelefonesupervisor(String telefonesupervisor) {
        String oldTelefonesupervisor = this.telefonesupervisor;
        this.telefonesupervisor = telefonesupervisor;
        changeSupport.firePropertyChange("telefonesupervisor", oldTelefonesupervisor, telefonesupervisor);
    }

    public String getNomevendedor() {
        return nomevendedor;
    }

    public void setNomevendedor(String nomevendedor) {
        String oldNomevendedor = this.nomevendedor;
        this.nomevendedor = nomevendedor;
        changeSupport.firePropertyChange("nomevendedor", oldNomevendedor, nomevendedor);
    }

    public String getTelefonevendedor() {
        return telefonevendedor;
    }

    public void setTelefonevendedor(String telefonevendedor) {
        String oldTelefonevendedor = this.telefonevendedor;
        this.telefonevendedor = telefonevendedor;
        changeSupport.firePropertyChange("telefonevendedor", oldTelefonevendedor, telefonevendedor);
    }

    public String getPrazodeentrega() {
        return prazodeentrega;
    }

    public void setPrazodeentrega(String prazodeentrega) {
        String oldPrazodeentrega = this.prazodeentrega;
        this.prazodeentrega = prazodeentrega;
        changeSupport.firePropertyChange("prazodeentrega", oldPrazodeentrega, prazodeentrega);
    }

    public String getPrazodepagamento() {
        return prazodepagamento;
    }

    public void setPrazodepagamento(String prazodepagamento) {
        String oldPrazodepagamento = this.prazodepagamento;
        this.prazodepagamento = prazodepagamento;
        changeSupport.firePropertyChange("prazodepagamento", oldPrazodepagamento, prazodepagamento);
    }

    public String getTipodepessoa() {
        return tipodepessoa;
    }

    public void setTipodepessoa(String tipodepessoa) {
        String oldTipodepessoa = this.tipodepessoa;
        this.tipodepessoa = tipodepessoa;
        changeSupport.firePropertyChange("tipodepessoa", oldTipodepessoa, tipodepessoa);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        String oldCnpj = this.cnpj;
        this.cnpj = cnpj;
        changeSupport.firePropertyChange("cnpj", oldCnpj, cnpj);
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
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Fornecedor[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
