/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.cs.model;

import javax.persistence.*;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author telmo
 */
@Entity()
@Table(name = "tb_resultado")
public class Resultado {

    @EmbeddedId
    private ResultadoID id;

    private Status status;

    public Resultado(){
        
    }
    
}
