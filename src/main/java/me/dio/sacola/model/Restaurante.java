package me.dio.sacola.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor //Cria um construtor com todos os atributos
@Builder //Cria um objeto de forma simples
@Data //Cria Getters e Setters, equals e hashcode
@Entity //Informa que Restaurante será uma tabela no banco de dados
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) //Ignora algum erro que possa aparecer
@NoArgsConstructor //Cria um construtor vazio (o Hibernate exige)
public class Restaurante {
    @Id //Será Identificador único de cada objeto
    @GeneratedValue(strategy = GenerationType.AUTO) //Como será gerado o identificador unico - Auto incremento.
    private Long id;
    private String nome;
    @OneToMany(cascade = CascadeType.ALL) //Indica o relacionamento de UM restaurante para MUITOS produtos.
    private List<Produto> cardapio;
    @Embedded
    private Endereco endereco;
}
