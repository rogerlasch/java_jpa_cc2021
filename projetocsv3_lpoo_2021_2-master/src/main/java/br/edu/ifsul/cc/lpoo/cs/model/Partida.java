
package br.edu.ifsul.cc.lpoo.cs.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;


/**
 *
 * @author telmo
 */
@Entity
@Table(name = "tb_partida")

public class Partida implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_compra", sequenceName = "seq_compra_id", allocationSize = 1)
    private Integer id;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar inicio;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fim;
    @ManyToOne
    @JoinColumn(name = "jogador_id", nullable = false)//associacao
    private Jogador jogador;
    @ManyToMany
    @JoinTable(name = "tb_round", joinColumns = {@JoinColumn(name = "round_id")}, //agregacao, vai gerar uma tabela associativa.
                                       inverseJoinColumns = {@JoinColumn(name =
"partida_id")})
    private List<Round> rounds;
    public Partida(){
        
    }
    
}
