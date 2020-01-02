package br.com.azi.app.repository;

import br.com.azi.app.model.Licitacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LicitacaoRepository extends JpaRepository<Licitacao, Long> {
}
