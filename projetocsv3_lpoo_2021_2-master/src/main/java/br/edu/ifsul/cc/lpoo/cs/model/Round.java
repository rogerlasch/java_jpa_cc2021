
package br.edu.ifsul.cc.lpoo.cs.model;
import javax.persistence.*;
import java.util.Calendar;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author telmo
 */
@Entity
@Table(name = "tb_round")

public class Round {
    @Id
    @SequenceGenerator(name = "seq_compra", sequenceName = "seq_compra_id", allocationSize = 1)

    private Integer id;
    @Column(nullable = false)
    private Integer numero;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar inicio;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fim;
    @ManyToMany
    @JoinTable(name = "tb_round_objetivo", joinColumns = {@JoinColumn(name = "objetivo_id")}, //agregacao, vai gerar uma tabela associativa.
                                       inverseJoinColumns = {@JoinColumn(name = "round_id")})
    private List<Objetivo> objetivos;

    @ManyToOne
    @JoinColumn(name = "partida_id", nullable = false)//associacao
    private Partida partida;

    private Modo modo;

    public Round(){

    }

}
