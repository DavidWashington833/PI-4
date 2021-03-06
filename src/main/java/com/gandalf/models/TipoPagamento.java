package com.gandalf.models;

import java.util.HashSet;
import java.util.Set;

public class TipoPagamento implements java.io.Serializable {

    private int idTipoPagto;
    private String descTipoPagto;
    private Set pedidos = new HashSet(0);

    public TipoPagamento() {
    }

    public TipoPagamento(byte idTipoPagto, String descTipoPagto) {
        this.idTipoPagto = idTipoPagto;
        this.descTipoPagto = descTipoPagto;
    }

    public TipoPagamento(byte idTipoPagto, String descTipoPagto, Set pedidos) {
        this.idTipoPagto = idTipoPagto;
        this.descTipoPagto = descTipoPagto;
        this.pedidos = pedidos;
    }

    public int getIdTipoPagto() {
        return this.idTipoPagto;
    }

    public void setIdTipoPagto(int idTipoPagto) {
        this.idTipoPagto = idTipoPagto;
    }

    public String getDescTipoPagto() {
        return this.descTipoPagto;
    }

    public void setDescTipoPagto(String descTipoPagto) {
        this.descTipoPagto = descTipoPagto;
    }

    public Set getPedidos() {
        return this.pedidos;
    }

    public void setPedidos(Set pedidos) {
        this.pedidos = pedidos;
    }

}
