package br.com.azi.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Proposta {

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
    private Licitacao licitacao;
}
