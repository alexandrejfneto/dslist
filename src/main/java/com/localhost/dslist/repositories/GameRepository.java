package com.localhost.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.localhost.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
