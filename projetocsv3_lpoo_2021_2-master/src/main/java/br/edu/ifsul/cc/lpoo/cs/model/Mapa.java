
package br.edu.ifsul.cc.lpoo.cs.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author telmo
 */
@Entity
@Table(name = "tb_mapa")

public class Mapa implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_compra", sequenceName = "seq_compra_id", allocationSize = 1)
    private Integer id;
    @Column(nullable = false)
    private String nome;
    @ManyToMany
    @JoinTable(name = "tb_mapa_local", joinColumns = {@JoinColumn(name = "local_id")}, //agregacao, vai gerar uma tabela associativa.
                                       inverseJoinColumns = {@JoinColumn(name = "mapa_id")})
    private List<Local> locais;

Mapa(){

    }

}
