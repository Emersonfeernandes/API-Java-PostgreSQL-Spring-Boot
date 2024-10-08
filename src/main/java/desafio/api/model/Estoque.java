package desafio.api.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_estoque")
public class Estoque {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="produto_id")
    String nome;
    int quantidade;

}
