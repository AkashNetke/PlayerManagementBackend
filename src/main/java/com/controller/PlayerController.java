package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Player;
import com.service.PlayerServiceIterface;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
//@RequestMapping("p")
public class PlayerController {

	@Autowired
	PlayerServiceIterface playerService;
	
//	@PostMapping("add")
//	public Player savePlayer(@RequestBody Player player)
//	{
//		return playerService.savePlayer(player);
//	}
	
	@PostMapping("save")
	public ResponseEntity<Player> savePlayer(@RequestBody Player player)
	{
		Player p=playerService.savePlayer(player);
		return ResponseEntity.status(HttpStatus.CREATED).header("add","saveplayer").body(p);
	}
	
	
	@GetMapping("getById/{id}")
	public Player findOnePlayer(@PathVariable int id) {
	
		return playerService.findOnePlayer(id);
				
	}
	
	
	@GetMapping("getAll")
	public List<Player> findAllPlayer() {
		
		return playerService.findAllPlayer();
		
	}
	
	@DeleteMapping("del/{id}")
	public void deletePlayer(@PathVariable int id) {
	
		playerService.deletePlayer(id);
	
	}
	
	@PutMapping("update")
	public Player updatePlayer(@RequestBody Player player) {
	
	return playerService.updatePlayer(player);
	}
	
	@GetMapping("getByEmail/{email}")
	public Player getPlayerByEmail(@PathVariable String email) {

		return playerService.getPlayerByEmail(email);
	
	}
	

}
