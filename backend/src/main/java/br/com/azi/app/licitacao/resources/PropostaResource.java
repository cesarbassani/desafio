package br.com.azi.app.licitacao.resources;

import br.com.azi.app.licitacao.aplicacao.proposta.PropostaService;
import br.com.azi.app.licitacao.dominio.Proposta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/propostas")
public class PropostaResource {

    @Autowired
    private PropostaService propostaService;

    @GetMapping
    public List<Proposta> listar() {
        return propostaService.listar();
    }
}
