package coraline.atividade;

import coraline.atividade.model.Produto;
import coraline.atividade.repository.ProdutoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AtividadeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtividadeApplication.class, args);
    }

    // Este método roda automaticamente assim que o Spring Boot inicializa
    @Bean
    public CommandLineRunner carregarDados(ProdutoRepository repository) {
        return args -> {
            // Adiciona elementos automaticamente no banco de dados
            repository.save(new Produto("Notebook", 3500.00));
            repository.save(new Produto("Mouse Gamer", 150.00));
            repository.save(new Produto("Teclado Mecânico", 280.00));
            
            System.out.println(">>> Produtos iniciais cadastrados com sucesso! <<<");
        };
    }
}