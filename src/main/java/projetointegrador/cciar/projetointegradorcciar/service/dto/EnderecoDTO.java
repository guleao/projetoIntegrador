package projetointegrador.cciar.projetointegradorcciar.service.dto;

import lombok.Getter;
import lombok.Setter;
import projetointegrador.cciar.projetointegradorcciar.entity.Pessoa;

@Getter
@Setter
public class EnderecoDTO {

    private Pessoa pessoa;
    private String cep;

    private String logradouro;

    private String localidade;

    private String bairro;

    private int numCasa;

    private String uf;
}
