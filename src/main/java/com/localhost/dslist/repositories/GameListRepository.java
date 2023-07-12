package com.localhost.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.localhost.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
