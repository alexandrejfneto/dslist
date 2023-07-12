package com.localhost.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.localhost.dslist.dto.GameDTO;
import com.localhost.dslist.dto.GameMinDTO;
import com.localhost.dslist.entities.Game;
import com.localhost.dslist.repositories.GameRepository;

@Component
public class GameService {
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll () {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dtoList = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dtoList;
	}
}
