package desafio.api.service;

import java.util.List;

import desafio.api.model.Produto;
import desafio.api.model.form.ProdutoForm;

public interface ProdutoServive {

    Produto create(ProdutoForm produto);

    List<Produto> getNome(String nome);

    List<Produto> getAll();

}
