package desafio.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.api.model.Produto;
import desafio.api.model.form.ProdutoForm;
import desafio.api.service.impl.ProdutoServiceImpl;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoServiceImpl serviceImpl;

    @PostMapping
    public Produto create(@Valid @RequestBody ProdutoForm form) {
        return serviceImpl.create(form);
    }

    @GetMapping("/produtos/{nome}")
    public List<Produto> findByNomeProdutos(@PathVariable String nome) {
        return serviceImpl.getNome(nome);
    }

    @GetMapping
    public List<Produto> getAll(){
        return serviceImpl.getAll();
    }
}
