package br.com.azi.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Licitacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private Integer tipo;

    @JsonIgnoreProperties("licitacao")
    @Valid
    @NotEmpty
    @OneToMany(mappedBy = "licitacao", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Proposta> propostas;

    public Licitacao(String descricao, TipoClassificacao tipo, List<Proposta> propostas) {
        this.descricao = descricao;
        this.tipo = tipo.getCodigo();
        this.propostas = propostas;
    }

    public TipoClassificacao getTipo() {
        return TipoClassificacao.toEnum(tipo);
    }

    public void setTipo(TipoClassificacao tipo) {
        this.tipo = tipo.getCodigo();
    }
}
