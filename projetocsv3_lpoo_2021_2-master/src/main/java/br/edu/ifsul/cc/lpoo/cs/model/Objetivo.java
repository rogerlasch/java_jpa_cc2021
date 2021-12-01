/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.cs.model;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author telmo
 */
@Entity
@Table(name = "tb_objetivo")

public class Objetivo implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_compra", sequenceName = "seq_compra_id", allocationSize = 1)

    private Integer id;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private Integer pontos;
    @ManyToMany
    @JoinTable(name = "tb_objetivo_local", joinColumns = {@JoinColumn(name = "local_id")}, //agregacao, vai gerar uma tabela associativa.
                                       inverseJoinColumns = {@JoinColumn(name = "objetivo_id")})
    private List<Local> locais;
    
    public Objetivo(){
        
    }
    
}
