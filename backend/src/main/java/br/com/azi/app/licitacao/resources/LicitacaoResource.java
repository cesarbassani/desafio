package br.com.azi.app.licitacao.resources;

import br.com.azi.app.licitacao.aplicacao.licitacao.LicitacaoService;
import br.com.azi.app.licitacao.dominio.Licitacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public String inserirLicitacao(@RequestBody Licitacao licitacao) {
        Licitacao licitacaoSalva = licitacaoService.insert(licitacao);
        return "Licitação salva com sucesso: " + licitacaoSalva.getId();
    }
}
