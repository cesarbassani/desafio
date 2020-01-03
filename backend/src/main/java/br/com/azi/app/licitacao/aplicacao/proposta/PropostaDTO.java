package br.com.azi.app.licitacao.aplicacao.proposta;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class PropostaDTO {

    private Long id;

    private String fornecedor;

    private BigDecimal nota;

    private BigDecimal preco;

    private LocalDateTime dataCadastro;

    private Integer classificacao;
}
