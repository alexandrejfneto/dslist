package com.localhost.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.localhost.dslist.dto.GameListDTO;
import com.localhost.dslist.entities.GameList;
import com.localhost.dslist.repositories.GameListRepository;

@Component
public class GameListService {
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll () {
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dtoList = result.stream().map(x -> new GameListDTO(x)).toList();
		return dtoList;
	}
}
