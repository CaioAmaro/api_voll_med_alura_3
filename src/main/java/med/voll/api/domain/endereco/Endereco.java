package med.voll.api.domain.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String complemento;
    private String numero;

    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.cep = endereco.cep();
        this.cidade = endereco.cidade();
        this.uf = endereco.uf();
        this.complemento = endereco.complemento();
        this.numero = endereco.numero();
    }

    public void atualizarEndereco(DadosEndereco endereco) {

        if(endereco.logradouro() != null){
            this.logradouro = endereco.logradouro();
        }

        if(endereco.bairro() != null){
            this.logradouro = endereco.bairro();
        }

        if(endereco.cep() != null){
            this.logradouro = endereco.cep();
        }

        if(endereco.cidade() != null){
            this.logradouro = endereco.cidade();
        }

        if(endereco.uf() != null){
            this.logradouro = endereco.uf();
        }

        if(endereco.complemento() != null){
            this.logradouro = endereco.complemento();
        }

        if(endereco.numero() != null){
            this.logradouro = endereco.numero();
        }

    }
}
