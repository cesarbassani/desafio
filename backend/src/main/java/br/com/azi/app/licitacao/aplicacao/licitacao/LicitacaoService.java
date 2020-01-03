package br.com.azi.app.licitacao.aplicacao.licitacao;

import br.com.azi.app.licitacao.dominio.Licitacao;
import br.com.azi.app.licitacao.repositories.LicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LicitacaoService {

    @Autowired
    private LicitacaoRepository licitacaoRepository;

    public List<Licitacao> getLicitacoes() {
        return licitacaoRepository.findAll();
    }

    public Optional<Licitacao> getLicitacaoById(Long id) {
        return licitacaoRepository.findById(id);
    }

    public Licitacao insert(Licitacao licitacao) {
        return licitacaoRepository.save(licitacao);
    }
}
