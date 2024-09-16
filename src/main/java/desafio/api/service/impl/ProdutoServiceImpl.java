package desafio.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import desafio.api.model.Produto;
import desafio.api.model.form.ProdutoForm;
import desafio.api.repository.ProdutoRepository;
import desafio.api.service.ProdutoServive;

@Service
public class ProdutoServiceImpl implements ProdutoServive {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public Produto create(ProdutoForm produto) {
        Produto novoProduto = new Produto();
        novoProduto.setNome(produto.getNome());
        novoProduto.setPreco(produto.getPreco());

        return produtoRepository.save(novoProduto);
    }

    @Override
    public List<Produto> getNome(String nome) {
        return produtoRepository.findByNomeProdutos(nome);
    }

    @Override
    public List<Produto> getAll() {
        return produtoRepository.findAll();
    }

}
