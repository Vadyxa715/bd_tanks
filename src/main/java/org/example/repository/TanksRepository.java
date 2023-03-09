package org.example.repository;

import org.example.domain.Tank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TanksRepository extends JpaRepository<Tank, Long> {
}
