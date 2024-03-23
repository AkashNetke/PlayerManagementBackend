package com.service;

import java.util.List;

import com.model.Player;

public interface PlayerServiceIterface {

	public Player savePlayer(Player player);
	
	public Player findOnePlayer(int id);
	
	public List<Player> findAllPlayer();
	
	public void deletePlayer(int id);
	
	public Player updatePlayer(Player player);
	
	public Player getPlayerByEmail(String email);
	
	
}
