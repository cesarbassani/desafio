package br.com.azi.app.licitacao.repositories;

import br.com.azi.app.licitacao.dominio.Licitacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LicitacaoRepository extends JpaRepository<Licitacao, Long> {
}
