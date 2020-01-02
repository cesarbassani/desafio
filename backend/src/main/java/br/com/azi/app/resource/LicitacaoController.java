package br.com.azi.app.resource;

import br.com.azi.app.model.Licitacao;
import br.com.azi.app.repository.LicitacaoRepository;
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
