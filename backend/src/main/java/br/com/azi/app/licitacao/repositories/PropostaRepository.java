package br.com.azi.app.licitacao.repositories;

import br.com.azi.app.licitacao.dominio.Proposta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropostaRepository extends JpaRepository<Proposta, Long> {
}
