/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafidev.uniweb.entidade;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;

/**
 *
 * @author Estrada
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Revista extends Publicacao {
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date publicacao;

    public Revista() {
    }

    public Date getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(Date publicacao) {
        this.publicacao = publicacao;
    }
    
 
}
