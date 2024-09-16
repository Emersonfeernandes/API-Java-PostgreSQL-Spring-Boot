package desafio.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import desafio.api.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

  List<Produto> findByNomeProdutos(String nome);

}
