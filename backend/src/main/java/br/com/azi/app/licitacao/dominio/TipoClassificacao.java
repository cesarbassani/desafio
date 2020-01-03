package br.com.azi.app.licitacao.dominio;

public enum TipoClassificacao {

    MenorPreco(1, "Menor Preço"),
    NOTAPRECO(2, "Nota Preço");

    private int codigo;
    private  String descricao;

    TipoClassificacao(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoClassificacao toEnum(Integer codigo) {
        if (codigo == null) {
            return null;
        }

        for (TipoClassificacao tipo : TipoClassificacao.values()) {
            if (codigo.equals(tipo.getCodigo())) {
                return tipo;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + codigo);
    }
}
