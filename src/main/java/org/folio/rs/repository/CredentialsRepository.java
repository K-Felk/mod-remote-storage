package org.folio.rs.repository;

import java.util.List;
import java.util.UUID;

import org.folio.rs.domain.entity.Credential;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredentialsRepository extends JpaRepository<Credential, UUID> {
  List<Credential> findByUsername(String username);
}
