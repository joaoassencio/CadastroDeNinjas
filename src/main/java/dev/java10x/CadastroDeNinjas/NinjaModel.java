package dev.java10x.CadastroDeNinjas;

import jakarta.persistence.*;

// @Entity transforma a classe em uma tabela no banco de dados.
@Entity
// @Table define o nome da tabela.
@Table(name = "tb_cadastro_ninjas")
public class NinjaModel {

    // @Id define que o atributo seguinte será o Id da tabela.
    // @GenerateValue define como/a estratégia de incremento do Id.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String email;
    int idade;

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
