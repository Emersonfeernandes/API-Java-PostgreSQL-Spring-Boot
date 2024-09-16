package desafio.api.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_produto")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Produto {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;

    @Column(unique=true)
    String nome;
    double preco;

    @OneToMany(mappedBy="venda", fetch=FetchType.LAZY)
    @JsonIgnore
    List<Venda> vendas = new ArrayList<>();

}
