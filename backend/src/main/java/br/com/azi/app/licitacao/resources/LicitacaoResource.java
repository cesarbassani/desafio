package br.com.azi.app.licitacao.resources;

import br.com.azi.app.licitacao.aplicacao.licitacao.LicitacaoService;
import br.com.azi.app.licitacao.dominio.Licitacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/licitacoes")
public class LicitacaoResource {

    @Autowired
    private LicitacaoService licitacaoService;

    @GetMapping
    public List<Licitacao> listarLicitacoes() {
        return licitacaoService.getLicitacoes();
    }

    @GetMapping("/{id}")
    public Optional<Licitacao> getLicitacao(@PathVariable("id") Long id) {
        return licitacaoService.getLicitacaoById(id);
    }
}
