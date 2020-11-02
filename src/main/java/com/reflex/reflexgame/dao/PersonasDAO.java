package com.reflex.reflexgame.dao;

import com.reflex.reflexgame.model.Personas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonasDAO extends JpaRepository<Personas, Integer > {
}
