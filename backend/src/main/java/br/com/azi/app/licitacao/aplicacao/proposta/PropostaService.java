package br.com.azi.app.licitacao.aplicacao.proposta;

import br.com.azi.app.licitacao.dominio.Proposta;
import br.com.azi.app.licitacao.repositories.PropostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropostaService {

    @Autowired
    private PropostaRepository propostaRepository;

    public List<Proposta> getPropostas() {
        return propostaRepository.findAll();
    }

    public Optional<Proposta> getPropostaById(Long id) {
        return propostaRepository.findById(id);
    }
}
