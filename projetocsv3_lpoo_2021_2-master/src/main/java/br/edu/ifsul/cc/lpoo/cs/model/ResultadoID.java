/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.cs.model;

import javax.persistence.*;
import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author telmo
 */
@Embeddable
public class ResultadoID implements Serializable{

    @ManyToOne
    @JoinColumn(name = "objetivo_id")
    private Objetivo objetivo;

    @ManyToOne
    @JoinColumn(name = "round_id")
    private Round round;


    public ResultadoID(){
        
    }
    
    
}
