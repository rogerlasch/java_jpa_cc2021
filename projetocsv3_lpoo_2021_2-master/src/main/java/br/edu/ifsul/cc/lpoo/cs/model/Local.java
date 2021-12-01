/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.cs.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author telmo
 */
@Entity
@Table(name = "tb_local")

public class Local implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_compra", sequenceName = "seq_compra_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_compra", strategy = GenerationType.SEQUENCE)

    private Integer id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String latitude;
    @Column(nullable = false)
    private String longitude;

    public Local(){

    }

}
