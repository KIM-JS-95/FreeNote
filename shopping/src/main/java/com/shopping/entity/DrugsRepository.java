package com.shopping.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DrugsRepository extends JpaRepository<Drugs, Long> {

    Optional<Drugs> findById(Long id);

    List<Drugs> findAll();

}
