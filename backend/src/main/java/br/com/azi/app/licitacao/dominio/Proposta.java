package br.com.azi.app.licitacao.dominio;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Proposta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String fornecedor;

    @NotNull
    private BigDecimal nota;

    @NotNull
    private BigDecimal preco;

    private LocalDateTime dataCadastro;

    @NotNull
    private Integer classificacao;

    @ManyToOne
    @JoinColumn(name="licitacao_id")
    private Licitacao licitacao;
}
