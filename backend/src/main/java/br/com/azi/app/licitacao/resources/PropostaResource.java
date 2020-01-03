package br.com.azi.app.licitacao.resources;

import br.com.azi.app.licitacao.aplicacao.proposta.PropostaService;
import br.com.azi.app.licitacao.dominio.Proposta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/propostas")
public class PropostaResource {

    @Autowired
    private PropostaService propostaService;

    @GetMapping
    public List<Proposta> listarPropostas() {
        return propostaService.getPropostas();
    }

    @GetMapping("/{id}")
    public Optional<Proposta> getPropostas(@PathVariable("id") Long id) {
        return propostaService.getPropostaById(id);
    }
}
