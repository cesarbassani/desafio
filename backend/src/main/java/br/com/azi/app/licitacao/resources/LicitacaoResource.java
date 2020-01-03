package br.com.azi.app.licitacao.resources;

import br.com.azi.app.licitacao.aplicacao.licitacao.LicitacaoService;
import br.com.azi.app.licitacao.dominio.Licitacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/licitacoes")
public class LicitacaoResource {

    @Autowired
    private LicitacaoService licitacaoService;

    @GetMapping
    public List<Licitacao> listar() {
        return licitacaoService.listar();
    }
}
