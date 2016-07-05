package com.example.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoDAO extends JpaRepository<Contato, Long>{
}
