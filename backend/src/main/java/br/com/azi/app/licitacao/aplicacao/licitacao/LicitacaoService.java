package br.com.azi.app.licitacao.aplicacao.licitacao;

import br.com.azi.app.licitacao.dominio.Licitacao;
import br.com.azi.app.licitacao.repositories.LicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicitacaoService {

    @Autowired
    private LicitacaoRepository licitacaoRepository;

    public List<Licitacao> listar() {
        return licitacaoRepository.findAll();
    }
}
