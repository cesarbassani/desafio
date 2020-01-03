package br.com.azi.app.licitacao.aplicacao.proposta;

import br.com.azi.app.licitacao.dominio.Proposta;
import br.com.azi.app.licitacao.repositories.PropostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropostaService {

    @Autowired
    private PropostaRepository propostaRepository;

    public List<Proposta> listar() {
        return propostaRepository.findAll();
    }
}
