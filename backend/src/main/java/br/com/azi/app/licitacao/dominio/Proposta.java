package br.com.azi.app.licitacao.dominio;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
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

    private String fornecedor;

    private BigDecimal nota;

    private BigDecimal preco;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime dataCadastro;

    private Integer classificacao;

    @ManyToOne
    @JoinColumn(name="licitacao_id")
    private Licitacao licitacao;
}
