package coraline.atividade.repository;

import coraline.atividade.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Ao estender o JpaRepository, o Spring gera automaticamente
    // todos os métodos de banco de dados (salvar, listar, buscar por ID, deletar, etc).
}
