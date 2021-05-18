/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xyz.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sebastian
 */
@Entity
@Table(name = "TARJETA_CREDITO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TarjetaCredito.findAll", query = "SELECT t FROM TarjetaCredito t")
    , @NamedQuery(name = "TarjetaCredito.findByIdTarjetaCredito", query = "SELECT t FROM TarjetaCredito t WHERE t.idTarjetaCredito = :idTarjetaCredito")
    , @NamedQuery(name = "TarjetaCredito.findByNombre", query = "SELECT t FROM TarjetaCredito t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TarjetaCredito.findByCodigo", query = "SELECT t FROM TarjetaCredito t WHERE t.codigo = :codigo")
    , @NamedQuery(name = "TarjetaCredito.findByFechaVencimiento", query = "SELECT t FROM TarjetaCredito t WHERE t.fechaVencimiento = :fechaVencimiento")})
    public class TarjetaCredito implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_TARJETA_CREDITO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tarjeta_credito")
    @SequenceGenerator(name = "seq_tarjeta_credito", sequenceName = "INCREMENT_ID_TARJETA_CREDITO", allocationSize = 1)
    private Integer idTarjetaCredito;
    @Size(max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "CODIGO")
    private Integer codigo;
    @Column(name = "FECHA_VENCIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID_CLIENTE")
    @ManyToOne(fetch = FetchType.LAZY)
    private Cliente idCliente;

    public TarjetaCredito() {
    }

    public TarjetaCredito(String nombre, Integer codigo, Date fechaVencimiento) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.fechaVencimiento = fechaVencimiento;
    }
        
    public TarjetaCredito(Integer idTarjetaCredito) {
        this.idTarjetaCredito = idTarjetaCredito;
    }

    public Integer getIdTarjetaCredito() {
        return idTarjetaCredito;
    }

    public void setIdTarjetaCredito(Integer idTarjetaCredito) {
        this.idTarjetaCredito = idTarjetaCredito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTarjetaCredito != null ? idTarjetaCredito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TarjetaCredito)) {
            return false;
        }
        TarjetaCredito other = (TarjetaCredito) object;
        if ((this.idTarjetaCredito == null && other.idTarjetaCredito != null) || (this.idTarjetaCredito != null && !this.idTarjetaCredito.equals(other.idTarjetaCredito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.xyz.entities.TarjetaCredito[ idTarjetaCredito=" + idTarjetaCredito + " ]";
    }
    
}
