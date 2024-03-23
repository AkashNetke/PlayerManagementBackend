package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dau.PlayerRepository;
import com.model.Player;

@Service
public class PlayerServiceImplementation implements PlayerServiceIterface{

	@Autowired
	PlayerRepository playerRepo;
	
	
	@Override
	public Player savePlayer(Player player) {
		// TODO Auto-generated method stub
		return playerRepo.save(player);
	}

	@Override
	public Player findOnePlayer(int id) {
		// TODO Auto-generated method stub
		return playerRepo.findById(id).orElse(null);
	}

	@Override
	public List<Player> findAllPlayer() {
		// TODO Auto-generated method stub
		return playerRepo.findAll();
	}

	@Override
	public void deletePlayer(int id) {
		playerRepo.deleteById(id);		
	}

	@Override
	public Player updatePlayer(Player player) {

		Player existingPlayer=playerRepo.findById(player.getId()).orElse(null);
		existingPlayer.setName(player.getName());
		return existingPlayer;
	}

	@Override
	public Player getPlayerByEmail(String email) {
		// TODO Auto-generated method stub
		return playerRepo.findByEmail(email);
	}

	
	
}
