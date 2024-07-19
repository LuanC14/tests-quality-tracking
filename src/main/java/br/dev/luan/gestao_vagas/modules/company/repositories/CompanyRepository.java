package br.dev.luan.gestao_vagas.modules.company.repositories;

import java.util.Optional;
import java.util.UUID;

import br.dev.luan.gestao_vagas.modules.company.entities.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CompanyRepository extends JpaRepository<CompanyEntity, UUID> {
  Optional<CompanyEntity> findByUsernameOrEmail(String username, String email);

  Optional<CompanyEntity> findByUsername(String username);
}
