package br.com.azi.app.licitacao.aplicacao.licitacao;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LicitacaoDTO {

    private Long id;

    private String descricao;

    private Integer tipo;
}
