/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.Serializable;
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
@Table(name = "curso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Curso.findAll", query = "SELECT c FROM Curso c")
    , @NamedQuery(name = "Curso.findByCodigo", query = "SELECT c FROM Curso c WHERE c.codigo = :codigo")
    , @NamedQuery(name = "Curso.findByDescricao", query = "SELECT c FROM Curso c WHERE c.descricao = :descricao")
    , @NamedQuery(name = "Curso.findByDuracao", query = "SELECT c FROM Curso c WHERE c.duracao = :duracao")
    , @NamedQuery(name = "Curso.findByPeriodo", query = "SELECT c FROM Curso c WHERE c.periodo = :periodo")
    , @NamedQuery(name = "Curso.findByQtdalunos", query = "SELECT c FROM Curso c WHERE c.qtdalunos = :qtdalunos")
    , @NamedQuery(name = "Curso.findByCargahoraria", query = "SELECT c FROM Curso c WHERE c.cargahoraria = :cargahoraria")})
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    private Long codigo;
    @Size(max = 255)
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "duracao")
    private Integer duracao;
    @Size(max = 50)
    @Column(name = "periodo")
    private String periodo;
    @Column(name = "qtdalunos")
    private Integer qtdalunos;
    @Column(name = "cargahoraria")
    private Integer cargahoraria;

    public Curso() {
    }

    public Curso(Long codigo) {
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

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Integer getQtdalunos() {
        return qtdalunos;
    }

    public void setQtdalunos(Integer qtdalunos) {
        this.qtdalunos = qtdalunos;
    }

    public Integer getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(Integer cargahoraria) {
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
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "web.Curso[ codigo=" + codigo + " ]";
    }
    
}
