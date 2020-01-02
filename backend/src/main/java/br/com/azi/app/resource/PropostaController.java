package br.com.azi.app.resource;

import br.com.azi.app.model.Proposta;
import br.com.azi.app.repository.PropostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/propostas")
public class PropostaController {

    @Autowired
    private PropostaRepository propostaRepository;

    @GetMapping
    public List<Proposta> listar() {
        return propostaRepository.findAll();
    }
}
