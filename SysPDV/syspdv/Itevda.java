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
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author caixa
 */
@Entity
@Table(name = "ITEVDA", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Itevda.findAll", query = "SELECT i FROM Itevda i"),
    @NamedQuery(name = "Itevda.findById", query = "SELECT i FROM Itevda i WHERE i.id = :id"),
    @NamedQuery(name = "Itevda.findByTrnseq", query = "SELECT i FROM Itevda i WHERE i.trnseq = :trnseq"),
    @NamedQuery(name = "Itevda.findByCxanum", query = "SELECT i FROM Itevda i WHERE i.cxanum = :cxanum"),
    @NamedQuery(name = "Itevda.findByTrndat", query = "SELECT i FROM Itevda i WHERE i.trndat = :trndat"),
    @NamedQuery(name = "Itevda.findByLojcod", query = "SELECT i FROM Itevda i WHERE i.lojcod = :lojcod"),
    @NamedQuery(name = "Itevda.findByFuncod", query = "SELECT i FROM Itevda i WHERE i.funcod = :funcod"),
    @NamedQuery(name = "Itevda.findByProcod", query = "SELECT i FROM Itevda i WHERE i.procod = :procod"),
    @NamedQuery(name = "Itevda.findByItvqtdvda", query = "SELECT i FROM Itevda i WHERE i.itvqtdvda = :itvqtdvda"),
    @NamedQuery(name = "Itevda.findByItvvlruni", query = "SELECT i FROM Itevda i WHERE i.itvvlruni = :itvvlruni"),
    @NamedQuery(name = "Itevda.findByItvvlracr", query = "SELECT i FROM Itevda i WHERE i.itvvlracr = :itvvlracr"),
    @NamedQuery(name = "Itevda.findByItvvlrdcn", query = "SELECT i FROM Itevda i WHERE i.itvvlrdcn = :itvvlrdcn"),
    @NamedQuery(name = "Itevda.findByItvvlrtot", query = "SELECT i FROM Itevda i WHERE i.itvvlrtot = :itvvlrtot"),
    @NamedQuery(name = "Itevda.findByItvfuncap", query = "SELECT i FROM Itevda i WHERE i.itvfuncap = :itvfuncap"),
    @NamedQuery(name = "Itevda.findByItvfunpro", query = "SELECT i FROM Itevda i WHERE i.itvfunpro = :itvfunpro"),
    @NamedQuery(name = "Itevda.findByItvcomcap", query = "SELECT i FROM Itevda i WHERE i.itvcomcap = :itvcomcap"),
    @NamedQuery(name = "Itevda.findByItvcompro", query = "SELECT i FROM Itevda i WHERE i.itvcompro = :itvcompro"),
    @NamedQuery(name = "Itevda.findByItvcomven", query = "SELECT i FROM Itevda i WHERE i.itvcomven = :itvcomven"),
    @NamedQuery(name = "Itevda.findByPrvnum", query = "SELECT i FROM Itevda i WHERE i.prvnum = :prvnum"),
    @NamedQuery(name = "Itevda.findByItvprcvda", query = "SELECT i FROM Itevda i WHERE i.itvprcvda = :itvprcvda"),
    @NamedQuery(name = "Itevda.findByItvbontip", query = "SELECT i FROM Itevda i WHERE i.itvbontip = :itvbontip"),
    @NamedQuery(name = "Itevda.findByItvbonfat", query = "SELECT i FROM Itevda i WHERE i.itvbonfat = :itvbonfat"),
    @NamedQuery(name = "Itevda.findByItvcomred", query = "SELECT i FROM Itevda i WHERE i.itvcomred = :itvcomred"),
    @NamedQuery(name = "Itevda.findByItvctrest", query = "SELECT i FROM Itevda i WHERE i.itvctrest = :itvctrest"),
    @NamedQuery(name = "Itevda.findByItvprocomp", query = "SELECT i FROM Itevda i WHERE i.itvprocomp = :itvprocomp"),
    @NamedQuery(name = "Itevda.findByItvprccst", query = "SELECT i FROM Itevda i WHERE i.itvprccst = :itvprccst"),
    @NamedQuery(name = "Itevda.findByItvprccstmed", query = "SELECT i FROM Itevda i WHERE i.itvprccstmed = :itvprccstmed"),
    @NamedQuery(name = "Itevda.findByItvprccstfis", query = "SELECT i FROM Itevda i WHERE i.itvprccstfis = :itvprccstfis"),
    @NamedQuery(name = "Itevda.findByItvtip", query = "SELECT i FROM Itevda i WHERE i.itvtip = :itvtip"),
    @NamedQuery(name = "Itevda.findByItvfunaut", query = "SELECT i FROM Itevda i WHERE i.itvfunaut = :itvfunaut"),
    @NamedQuery(name = "Itevda.findByItvserpro", query = "SELECT i FROM Itevda i WHERE i.itvserpro = :itvserpro"),
    @NamedQuery(name = "Itevda.findByItvtrbid", query = "SELECT i FROM Itevda i WHERE i.itvtrbid = :itvtrbid"),
    @NamedQuery(name = "Itevda.findByItvtrbsim", query = "SELECT i FROM Itevda i WHERE i.itvtrbsim = :itvtrbsim"),
    @NamedQuery(name = "Itevda.findByItvtrbalq", query = "SELECT i FROM Itevda i WHERE i.itvtrbalq = :itvtrbalq"),
    @NamedQuery(name = "Itevda.findByItvtrbred", query = "SELECT i FROM Itevda i WHERE i.itvtrbred = :itvtrbred"),
    @NamedQuery(name = "Itevda.findByItvdcnmgc", query = "SELECT i FROM Itevda i WHERE i.itvdcnmgc = :itvdcnmgc"),
    @NamedQuery(name = "Itevda.findByItvtxaent", query = "SELECT i FROM Itevda i WHERE i.itvtxaent = :itvtxaent"),
    @NamedQuery(name = "Itevda.findByItvtipprc", query = "SELECT i FROM Itevda i WHERE i.itvtipprc = :itvtipprc"),
    @NamedQuery(name = "Itevda.findByItvvccod", query = "SELECT i FROM Itevda i WHERE i.itvvccod = :itvvccod"),
    @NamedQuery(name = "Itevda.findByItvecftrb", query = "SELECT i FROM Itevda i WHERE i.itvecftrb = :itvecftrb"),
    @NamedQuery(name = "Itevda.findByItvseq", query = "SELECT i FROM Itevda i WHERE i.itvseq = :itvseq"),
    @NamedQuery(name = "Itevda.findByItvcomtip", query = "SELECT i FROM Itevda i WHERE i.itvcomtip = :itvcomtip"),
    @NamedQuery(name = "Itevda.findByItvtdccod", query = "SELECT i FROM Itevda i WHERE i.itvtdccod = :itvtdccod"),
    @NamedQuery(name = "Itevda.findByItvoriprv", query = "SELECT i FROM Itevda i WHERE i.itvoriprv = :itvoriprv"),
    @NamedQuery(name = "Itevda.findByItvprmdcntip", query = "SELECT i FROM Itevda i WHERE i.itvprmdcntip = :itvprmdcntip"),
    @NamedQuery(name = "Itevda.findByItviat", query = "SELECT i FROM Itevda i WHERE i.itviat = :itviat"),
    @NamedQuery(name = "Itevda.findByItvstapaf", query = "SELECT i FROM Itevda i WHERE i.itvstapaf = :itvstapaf"),
    @NamedQuery(name = "Itevda.findByItvtaba", query = "SELECT i FROM Itevda i WHERE i.itvtaba = :itvtaba"),
    @NamedQuery(name = "Itevda.findByItvtabb", query = "SELECT i FROM Itevda i WHERE i.itvtabb = :itvtabb"),
    @NamedQuery(name = "Itevda.findByItvcstpis", query = "SELECT i FROM Itevda i WHERE i.itvcstpis = :itvcstpis"),
    @NamedQuery(name = "Itevda.findByItvcstcofins", query = "SELECT i FROM Itevda i WHERE i.itvcstcofins = :itvcstcofins"),
    @NamedQuery(name = "Itevda.findByItvalqpis", query = "SELECT i FROM Itevda i WHERE i.itvalqpis = :itvalqpis"),
    @NamedQuery(name = "Itevda.findByItvalqcofins", query = "SELECT i FROM Itevda i WHERE i.itvalqcofins = :itvalqcofins"),
    @NamedQuery(name = "Itevda.findByItvncm", query = "SELECT i FROM Itevda i WHERE i.itvncm = :itvncm"),
    @NamedQuery(name = "Itevda.findByItvncmexc", query = "SELECT i FROM Itevda i WHERE i.itvncmexc = :itvncmexc"),
    @NamedQuery(name = "Itevda.findByItvnatureza", query = "SELECT i FROM Itevda i WHERE i.itvnatureza = :itvnatureza"),
    @NamedQuery(name = "Itevda.findByItvcsosn", query = "SELECT i FROM Itevda i WHERE i.itvcsosn = :itvcsosn")})
public class Itevda implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "TRNSEQ")
    private String trnseq;
    @Basic(optional = false)
    @Column(name = "CXANUM")
    private String cxanum;
    @Basic(optional = false)
    @Column(name = "TRNDAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date trndat;
    @Column(name = "LOJCOD")
    private String lojcod;
    @Column(name = "FUNCOD")
    private String funcod;
    @Column(name = "PROCOD")
    private String procod;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ITVQTDVDA")
    private BigDecimal itvqtdvda;
    @Column(name = "ITVVLRUNI")
    private BigDecimal itvvlruni;
    @Column(name = "ITVVLRACR")
    private BigDecimal itvvlracr;
    @Column(name = "ITVVLRDCN")
    private BigDecimal itvvlrdcn;
    @Column(name = "ITVVLRTOT")
    private BigDecimal itvvlrtot;
    @Column(name = "ITVFUNCAP")
    private String itvfuncap;
    @Column(name = "ITVFUNPRO")
    private String itvfunpro;
    @Column(name = "ITVCOMCAP")
    private BigDecimal itvcomcap;
    @Column(name = "ITVCOMPRO")
    private BigDecimal itvcompro;
    @Column(name = "ITVCOMVEN")
    private BigDecimal itvcomven;
    @Column(name = "PRVNUM")
    private String prvnum;
    @Column(name = "ITVPRCVDA")
    private BigDecimal itvprcvda;
    @Column(name = "ITVBONTIP")
    private Character itvbontip;
    @Column(name = "ITVBONFAT")
    private BigDecimal itvbonfat;
    @Column(name = "ITVCOMRED")
    private BigDecimal itvcomred;
    @Column(name = "ITVCTREST")
    private Character itvctrest;
    @Column(name = "ITVPROCOMP")
    private Character itvprocomp;
    @Column(name = "ITVPRCCST")
    private BigDecimal itvprccst;
    @Column(name = "ITVPRCCSTMED")
    private BigDecimal itvprccstmed;
    @Column(name = "ITVPRCCSTFIS")
    private BigDecimal itvprccstfis;
    @Column(name = "ITVTIP")
    private Character itvtip;
    @Column(name = "ITVFUNAUT")
    private String itvfunaut;
    @Column(name = "ITVSERPRO")
    private String itvserpro;
    @Column(name = "ITVTRBID")
    private String itvtrbid;
    @Column(name = "ITVTRBSIM")
    private Character itvtrbsim;
    @Column(name = "ITVTRBALQ")
    private BigDecimal itvtrbalq;
    @Column(name = "ITVTRBRED")
    private BigDecimal itvtrbred;
    @Column(name = "ITVDCNMGC")
    private BigDecimal itvdcnmgc;
    @Column(name = "ITVTXAENT")
    private Character itvtxaent;
    @Column(name = "ITVTIPPRC")
    private Character itvtipprc;
    @Column(name = "ITVVCCOD")
    private String itvvccod;
    @Column(name = "ITVECFTRB")
    private String itvecftrb;
    @Column(name = "ITVSEQ")
    private String itvseq;
    @Column(name = "ITVCOMTIP")
    private Character itvcomtip;
    @Column(name = "ITVTDCCOD")
    private String itvtdccod;
    @Column(name = "ITVORIPRV")
    private Character itvoriprv;
    @Column(name = "ITVPRMDCNTIP")
    private Character itvprmdcntip;
    @Column(name = "ITVIAT")
    private Character itviat;
    @Column(name = "ITVSTAPAF")
    private Character itvstapaf;
    @Column(name = "ITVTABA")
    private Character itvtaba;
    @Column(name = "ITVTABB")
    private String itvtabb;
    @Column(name = "ITVCSTPIS")
    private String itvcstpis;
    @Column(name = "ITVCSTCOFINS")
    private String itvcstcofins;
    @Column(name = "ITVALQPIS")
    private BigDecimal itvalqpis;
    @Column(name = "ITVALQCOFINS")
    private BigDecimal itvalqcofins;
    @Column(name = "ITVNCM")
    private String itvncm;
    @Column(name = "ITVNCMEXC")
    private String itvncmexc;
    @Column(name = "ITVNATUREZA")
    private String itvnatureza;
    @Column(name = "ITVCSOSN")
    private String itvcsosn;

    public Itevda() {
    }

    public Itevda(Integer id) {
        this.id = id;
    }

    public Itevda(Integer id, String trnseq, String cxanum, Date trndat) {
        this.id = id;
        this.trnseq = trnseq;
        this.cxanum = cxanum;
        this.trndat = trndat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getTrnseq() {
        return trnseq;
    }

    public void setTrnseq(String trnseq) {
        String oldTrnseq = this.trnseq;
        this.trnseq = trnseq;
        changeSupport.firePropertyChange("trnseq", oldTrnseq, trnseq);
    }

    public String getCxanum() {
        return cxanum;
    }

    public void setCxanum(String cxanum) {
        String oldCxanum = this.cxanum;
        this.cxanum = cxanum;
        changeSupport.firePropertyChange("cxanum", oldCxanum, cxanum);
    }

    public Date getTrndat() {
        return trndat;
    }

    public void setTrndat(Date trndat) {
        Date oldTrndat = this.trndat;
        this.trndat = trndat;
        changeSupport.firePropertyChange("trndat", oldTrndat, trndat);
    }

    public String getLojcod() {
        return lojcod;
    }

    public void setLojcod(String lojcod) {
        String oldLojcod = this.lojcod;
        this.lojcod = lojcod;
        changeSupport.firePropertyChange("lojcod", oldLojcod, lojcod);
    }

    public String getFuncod() {
        return funcod;
    }

    public void setFuncod(String funcod) {
        String oldFuncod = this.funcod;
        this.funcod = funcod;
        changeSupport.firePropertyChange("funcod", oldFuncod, funcod);
    }

    public String getProcod() {
        return procod;
    }

    public void setProcod(String procod) {
        String oldProcod = this.procod;
        this.procod = procod;
        changeSupport.firePropertyChange("procod", oldProcod, procod);
    }

    public BigDecimal getItvqtdvda() {
        return itvqtdvda;
    }

    public void setItvqtdvda(BigDecimal itvqtdvda) {
        BigDecimal oldItvqtdvda = this.itvqtdvda;
        this.itvqtdvda = itvqtdvda;
        changeSupport.firePropertyChange("itvqtdvda", oldItvqtdvda, itvqtdvda);
    }

    public BigDecimal getItvvlruni() {
        return itvvlruni;
    }

    public void setItvvlruni(BigDecimal itvvlruni) {
        BigDecimal oldItvvlruni = this.itvvlruni;
        this.itvvlruni = itvvlruni;
        changeSupport.firePropertyChange("itvvlruni", oldItvvlruni, itvvlruni);
    }

    public BigDecimal getItvvlracr() {
        return itvvlracr;
    }

    public void setItvvlracr(BigDecimal itvvlracr) {
        BigDecimal oldItvvlracr = this.itvvlracr;
        this.itvvlracr = itvvlracr;
        changeSupport.firePropertyChange("itvvlracr", oldItvvlracr, itvvlracr);
    }

    public BigDecimal getItvvlrdcn() {
        return itvvlrdcn;
    }

    public void setItvvlrdcn(BigDecimal itvvlrdcn) {
        BigDecimal oldItvvlrdcn = this.itvvlrdcn;
        this.itvvlrdcn = itvvlrdcn;
        changeSupport.firePropertyChange("itvvlrdcn", oldItvvlrdcn, itvvlrdcn);
    }

    public BigDecimal getItvvlrtot() {
        return itvvlrtot;
    }

    public void setItvvlrtot(BigDecimal itvvlrtot) {
        BigDecimal oldItvvlrtot = this.itvvlrtot;
        this.itvvlrtot = itvvlrtot;
        changeSupport.firePropertyChange("itvvlrtot", oldItvvlrtot, itvvlrtot);
    }

    public String getItvfuncap() {
        return itvfuncap;
    }

    public void setItvfuncap(String itvfuncap) {
        String oldItvfuncap = this.itvfuncap;
        this.itvfuncap = itvfuncap;
        changeSupport.firePropertyChange("itvfuncap", oldItvfuncap, itvfuncap);
    }

    public String getItvfunpro() {
        return itvfunpro;
    }

    public void setItvfunpro(String itvfunpro) {
        String oldItvfunpro = this.itvfunpro;
        this.itvfunpro = itvfunpro;
        changeSupport.firePropertyChange("itvfunpro", oldItvfunpro, itvfunpro);
    }

    public BigDecimal getItvcomcap() {
        return itvcomcap;
    }

    public void setItvcomcap(BigDecimal itvcomcap) {
        BigDecimal oldItvcomcap = this.itvcomcap;
        this.itvcomcap = itvcomcap;
        changeSupport.firePropertyChange("itvcomcap", oldItvcomcap, itvcomcap);
    }

    public BigDecimal getItvcompro() {
        return itvcompro;
    }

    public void setItvcompro(BigDecimal itvcompro) {
        BigDecimal oldItvcompro = this.itvcompro;
        this.itvcompro = itvcompro;
        changeSupport.firePropertyChange("itvcompro", oldItvcompro, itvcompro);
    }

    public BigDecimal getItvcomven() {
        return itvcomven;
    }

    public void setItvcomven(BigDecimal itvcomven) {
        BigDecimal oldItvcomven = this.itvcomven;
        this.itvcomven = itvcomven;
        changeSupport.firePropertyChange("itvcomven", oldItvcomven, itvcomven);
    }

    public String getPrvnum() {
        return prvnum;
    }

    public void setPrvnum(String prvnum) {
        String oldPrvnum = this.prvnum;
        this.prvnum = prvnum;
        changeSupport.firePropertyChange("prvnum", oldPrvnum, prvnum);
    }

    public BigDecimal getItvprcvda() {
        return itvprcvda;
    }

    public void setItvprcvda(BigDecimal itvprcvda) {
        BigDecimal oldItvprcvda = this.itvprcvda;
        this.itvprcvda = itvprcvda;
        changeSupport.firePropertyChange("itvprcvda", oldItvprcvda, itvprcvda);
    }

    public Character getItvbontip() {
        return itvbontip;
    }

    public void setItvbontip(Character itvbontip) {
        Character oldItvbontip = this.itvbontip;
        this.itvbontip = itvbontip;
        changeSupport.firePropertyChange("itvbontip", oldItvbontip, itvbontip);
    }

    public BigDecimal getItvbonfat() {
        return itvbonfat;
    }

    public void setItvbonfat(BigDecimal itvbonfat) {
        BigDecimal oldItvbonfat = this.itvbonfat;
        this.itvbonfat = itvbonfat;
        changeSupport.firePropertyChange("itvbonfat", oldItvbonfat, itvbonfat);
    }

    public BigDecimal getItvcomred() {
        return itvcomred;
    }

    public void setItvcomred(BigDecimal itvcomred) {
        BigDecimal oldItvcomred = this.itvcomred;
        this.itvcomred = itvcomred;
        changeSupport.firePropertyChange("itvcomred", oldItvcomred, itvcomred);
    }

    public Character getItvctrest() {
        return itvctrest;
    }

    public void setItvctrest(Character itvctrest) {
        Character oldItvctrest = this.itvctrest;
        this.itvctrest = itvctrest;
        changeSupport.firePropertyChange("itvctrest", oldItvctrest, itvctrest);
    }

    public Character getItvprocomp() {
        return itvprocomp;
    }

    public void setItvprocomp(Character itvprocomp) {
        Character oldItvprocomp = this.itvprocomp;
        this.itvprocomp = itvprocomp;
        changeSupport.firePropertyChange("itvprocomp", oldItvprocomp, itvprocomp);
    }

    public BigDecimal getItvprccst() {
        return itvprccst;
    }

    public void setItvprccst(BigDecimal itvprccst) {
        BigDecimal oldItvprccst = this.itvprccst;
        this.itvprccst = itvprccst;
        changeSupport.firePropertyChange("itvprccst", oldItvprccst, itvprccst);
    }

    public BigDecimal getItvprccstmed() {
        return itvprccstmed;
    }

    public void setItvprccstmed(BigDecimal itvprccstmed) {
        BigDecimal oldItvprccstmed = this.itvprccstmed;
        this.itvprccstmed = itvprccstmed;
        changeSupport.firePropertyChange("itvprccstmed", oldItvprccstmed, itvprccstmed);
    }

    public BigDecimal getItvprccstfis() {
        return itvprccstfis;
    }

    public void setItvprccstfis(BigDecimal itvprccstfis) {
        BigDecimal oldItvprccstfis = this.itvprccstfis;
        this.itvprccstfis = itvprccstfis;
        changeSupport.firePropertyChange("itvprccstfis", oldItvprccstfis, itvprccstfis);
    }

    public Character getItvtip() {
        return itvtip;
    }

    public void setItvtip(Character itvtip) {
        Character oldItvtip = this.itvtip;
        this.itvtip = itvtip;
        changeSupport.firePropertyChange("itvtip", oldItvtip, itvtip);
    }

    public String getItvfunaut() {
        return itvfunaut;
    }

    public void setItvfunaut(String itvfunaut) {
        String oldItvfunaut = this.itvfunaut;
        this.itvfunaut = itvfunaut;
        changeSupport.firePropertyChange("itvfunaut", oldItvfunaut, itvfunaut);
    }

    public String getItvserpro() {
        return itvserpro;
    }

    public void setItvserpro(String itvserpro) {
        String oldItvserpro = this.itvserpro;
        this.itvserpro = itvserpro;
        changeSupport.firePropertyChange("itvserpro", oldItvserpro, itvserpro);
    }

    public String getItvtrbid() {
        return itvtrbid;
    }

    public void setItvtrbid(String itvtrbid) {
        String oldItvtrbid = this.itvtrbid;
        this.itvtrbid = itvtrbid;
        changeSupport.firePropertyChange("itvtrbid", oldItvtrbid, itvtrbid);
    }

    public Character getItvtrbsim() {
        return itvtrbsim;
    }

    public void setItvtrbsim(Character itvtrbsim) {
        Character oldItvtrbsim = this.itvtrbsim;
        this.itvtrbsim = itvtrbsim;
        changeSupport.firePropertyChange("itvtrbsim", oldItvtrbsim, itvtrbsim);
    }

    public BigDecimal getItvtrbalq() {
        return itvtrbalq;
    }

    public void setItvtrbalq(BigDecimal itvtrbalq) {
        BigDecimal oldItvtrbalq = this.itvtrbalq;
        this.itvtrbalq = itvtrbalq;
        changeSupport.firePropertyChange("itvtrbalq", oldItvtrbalq, itvtrbalq);
    }

    public BigDecimal getItvtrbred() {
        return itvtrbred;
    }

    public void setItvtrbred(BigDecimal itvtrbred) {
        BigDecimal oldItvtrbred = this.itvtrbred;
        this.itvtrbred = itvtrbred;
        changeSupport.firePropertyChange("itvtrbred", oldItvtrbred, itvtrbred);
    }

    public BigDecimal getItvdcnmgc() {
        return itvdcnmgc;
    }

    public void setItvdcnmgc(BigDecimal itvdcnmgc) {
        BigDecimal oldItvdcnmgc = this.itvdcnmgc;
        this.itvdcnmgc = itvdcnmgc;
        changeSupport.firePropertyChange("itvdcnmgc", oldItvdcnmgc, itvdcnmgc);
    }

    public Character getItvtxaent() {
        return itvtxaent;
    }

    public void setItvtxaent(Character itvtxaent) {
        Character oldItvtxaent = this.itvtxaent;
        this.itvtxaent = itvtxaent;
        changeSupport.firePropertyChange("itvtxaent", oldItvtxaent, itvtxaent);
    }

    public Character getItvtipprc() {
        return itvtipprc;
    }

    public void setItvtipprc(Character itvtipprc) {
        Character oldItvtipprc = this.itvtipprc;
        this.itvtipprc = itvtipprc;
        changeSupport.firePropertyChange("itvtipprc", oldItvtipprc, itvtipprc);
    }

    public String getItvvccod() {
        return itvvccod;
    }

    public void setItvvccod(String itvvccod) {
        String oldItvvccod = this.itvvccod;
        this.itvvccod = itvvccod;
        changeSupport.firePropertyChange("itvvccod", oldItvvccod, itvvccod);
    }

    public String getItvecftrb() {
        return itvecftrb;
    }

    public void setItvecftrb(String itvecftrb) {
        String oldItvecftrb = this.itvecftrb;
        this.itvecftrb = itvecftrb;
        changeSupport.firePropertyChange("itvecftrb", oldItvecftrb, itvecftrb);
    }

    public String getItvseq() {
        return itvseq;
    }

    public void setItvseq(String itvseq) {
        String oldItvseq = this.itvseq;
        this.itvseq = itvseq;
        changeSupport.firePropertyChange("itvseq", oldItvseq, itvseq);
    }

    public Character getItvcomtip() {
        return itvcomtip;
    }

    public void setItvcomtip(Character itvcomtip) {
        Character oldItvcomtip = this.itvcomtip;
        this.itvcomtip = itvcomtip;
        changeSupport.firePropertyChange("itvcomtip", oldItvcomtip, itvcomtip);
    }

    public String getItvtdccod() {
        return itvtdccod;
    }

    public void setItvtdccod(String itvtdccod) {
        String oldItvtdccod = this.itvtdccod;
        this.itvtdccod = itvtdccod;
        changeSupport.firePropertyChange("itvtdccod", oldItvtdccod, itvtdccod);
    }

    public Character getItvoriprv() {
        return itvoriprv;
    }

    public void setItvoriprv(Character itvoriprv) {
        Character oldItvoriprv = this.itvoriprv;
        this.itvoriprv = itvoriprv;
        changeSupport.firePropertyChange("itvoriprv", oldItvoriprv, itvoriprv);
    }

    public Character getItvprmdcntip() {
        return itvprmdcntip;
    }

    public void setItvprmdcntip(Character itvprmdcntip) {
        Character oldItvprmdcntip = this.itvprmdcntip;
        this.itvprmdcntip = itvprmdcntip;
        changeSupport.firePropertyChange("itvprmdcntip", oldItvprmdcntip, itvprmdcntip);
    }

    public Character getItviat() {
        return itviat;
    }

    public void setItviat(Character itviat) {
        Character oldItviat = this.itviat;
        this.itviat = itviat;
        changeSupport.firePropertyChange("itviat", oldItviat, itviat);
    }

    public Character getItvstapaf() {
        return itvstapaf;
    }

    public void setItvstapaf(Character itvstapaf) {
        Character oldItvstapaf = this.itvstapaf;
        this.itvstapaf = itvstapaf;
        changeSupport.firePropertyChange("itvstapaf", oldItvstapaf, itvstapaf);
    }

    public Character getItvtaba() {
        return itvtaba;
    }

    public void setItvtaba(Character itvtaba) {
        Character oldItvtaba = this.itvtaba;
        this.itvtaba = itvtaba;
        changeSupport.firePropertyChange("itvtaba", oldItvtaba, itvtaba);
    }

    public String getItvtabb() {
        return itvtabb;
    }

    public void setItvtabb(String itvtabb) {
        String oldItvtabb = this.itvtabb;
        this.itvtabb = itvtabb;
        changeSupport.firePropertyChange("itvtabb", oldItvtabb, itvtabb);
    }

    public String getItvcstpis() {
        return itvcstpis;
    }

    public void setItvcstpis(String itvcstpis) {
        String oldItvcstpis = this.itvcstpis;
        this.itvcstpis = itvcstpis;
        changeSupport.firePropertyChange("itvcstpis", oldItvcstpis, itvcstpis);
    }

    public String getItvcstcofins() {
        return itvcstcofins;
    }

    public void setItvcstcofins(String itvcstcofins) {
        String oldItvcstcofins = this.itvcstcofins;
        this.itvcstcofins = itvcstcofins;
        changeSupport.firePropertyChange("itvcstcofins", oldItvcstcofins, itvcstcofins);
    }

    public BigDecimal getItvalqpis() {
        return itvalqpis;
    }

    public void setItvalqpis(BigDecimal itvalqpis) {
        BigDecimal oldItvalqpis = this.itvalqpis;
        this.itvalqpis = itvalqpis;
        changeSupport.firePropertyChange("itvalqpis", oldItvalqpis, itvalqpis);
    }

    public BigDecimal getItvalqcofins() {
        return itvalqcofins;
    }

    public void setItvalqcofins(BigDecimal itvalqcofins) {
        BigDecimal oldItvalqcofins = this.itvalqcofins;
        this.itvalqcofins = itvalqcofins;
        changeSupport.firePropertyChange("itvalqcofins", oldItvalqcofins, itvalqcofins);
    }

    public String getItvncm() {
        return itvncm;
    }

    public void setItvncm(String itvncm) {
        String oldItvncm = this.itvncm;
        this.itvncm = itvncm;
        changeSupport.firePropertyChange("itvncm", oldItvncm, itvncm);
    }

    public String getItvncmexc() {
        return itvncmexc;
    }

    public void setItvncmexc(String itvncmexc) {
        String oldItvncmexc = this.itvncmexc;
        this.itvncmexc = itvncmexc;
        changeSupport.firePropertyChange("itvncmexc", oldItvncmexc, itvncmexc);
    }

    public String getItvnatureza() {
        return itvnatureza;
    }

    public void setItvnatureza(String itvnatureza) {
        String oldItvnatureza = this.itvnatureza;
        this.itvnatureza = itvnatureza;
        changeSupport.firePropertyChange("itvnatureza", oldItvnatureza, itvnatureza);
    }

    public String getItvcsosn() {
        return itvcsosn;
    }

    public void setItvcsosn(String itvcsosn) {
        String oldItvcsosn = this.itvcsosn;
        this.itvcsosn = itvcsosn;
        changeSupport.firePropertyChange("itvcsosn", oldItvcsosn, itvcsosn);
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
        if (!(object instanceof Itevda)) {
            return false;
        }
        Itevda other = (Itevda) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testes.Itevda[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
