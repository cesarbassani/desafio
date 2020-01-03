package br.com.azi.app.licitacao.dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Licitacao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private Integer tipo;

    @Valid
    @JsonIgnore
    @OneToMany(mappedBy = "licitacao")
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
