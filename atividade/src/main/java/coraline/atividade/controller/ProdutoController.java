package coraline.atividade.controller;

import coraline.atividade.model.Produto;
import coraline.atividade.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    // Injeção de dependência do repositório via construtor
    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    // Endpoint para listar todos os produtos (GET /produtos)
    @GetMapping
    public List<Produto> listar() {
        return produtoRepository.findAll();
    }

    // Endpoint para adicionar um novo produto (POST /produtos)
    @PostMapping
    public Produto adicionar(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
}