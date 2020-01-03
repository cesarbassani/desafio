package br.com.azi.app.licitacao.resources;

import br.com.azi.app.licitacao.dominio.Licitacao;
import br.com.azi.app.licitacao.repositories.LicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/licitacoes")
public class LicitacaoController {

    @Autowired
    private LicitacaoRepository licitacaoRepository;

    @GetMapping
    public List<Licitacao> listar() {
        return licitacaoRepository.findAll();
    }
}
