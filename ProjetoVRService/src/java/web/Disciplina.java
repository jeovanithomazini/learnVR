/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jeovani Thomazini
 */
@Entity
@Table(name = "disciplina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Disciplina.findAll", query = "SELECT d FROM Disciplina d")
    , @NamedQuery(name = "Disciplina.findByCodigo", query = "SELECT d FROM Disciplina d WHERE d.codigo = :codigo")
    , @NamedQuery(name = "Disciplina.findByDescricao", query = "SELECT d FROM Disciplina d WHERE d.descricao = :descricao")
    , @NamedQuery(name = "Disciplina.findByEmenta", query = "SELECT d FROM Disciplina d WHERE d.ementa = :ementa")
    , @NamedQuery(name = "Disciplina.findByLimitevagas", query = "SELECT d FROM Disciplina d WHERE d.limitevagas = :limitevagas")
    , @NamedQuery(name = "Disciplina.findByCodigoProfessor", query = "SELECT d FROM Disciplina d WHERE d.codigoProfessor = :codigoProfessor")
    , @NamedQuery(name = "Disciplina.findByCodigoCurso", query = "SELECT d FROM Disciplina d WHERE d.codigoCurso = :codigoCurso")
    , @NamedQuery(name = "Disciplina.findByDiasemana", query = "SELECT d FROM Disciplina d WHERE d.diasemana = :diasemana")
    , @NamedQuery(name = "Disciplina.findByCargahoraria", query = "SELECT d FROM Disciplina d WHERE d.cargahoraria = :cargahoraria")})
public class Disciplina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    private Long codigo;
    @Size(max = 255)
    @Column(name = "descricao")
    private String descricao;
    @Size(max = 1000)
    @Column(name = "ementa")
    private String ementa;
    @Column(name = "limitevagas")
    private Integer limitevagas;
    @Column(name = "codigo_professor")
    private Integer codigoProfessor;
    @Column(name = "codigo_curso")
    private Integer codigoCurso;
    @Size(max = 50)
    @Column(name = "diasemana")
    private String diasemana;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cargahoraria")
    private BigDecimal cargahoraria;

    public Disciplina() {
    }

    public Disciplina(Long codigo) {
        this.codigo = codigo;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public Integer getLimitevagas() {
        return limitevagas;
    }

    public void setLimitevagas(Integer limitevagas) {
        this.limitevagas = limitevagas;
    }

    public Integer getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(Integer codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getDiasemana() {
        return diasemana;
    }

    public void setDiasemana(String diasemana) {
        this.diasemana = diasemana;
    }

    public BigDecimal getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(BigDecimal cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Disciplina)) {
            return false;
        }
        Disciplina other = (Disciplina) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "web.Disciplina[ codigo=" + codigo + " ]";
    }
    
}
