package com.qa.marvel.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.marvel.domain.Marvel;

@RestController
public class MarvelController {

	private List<Marvel> marvelList = new ArrayList<>();

	// CRUD

	// CREATE
	@PostMapping("/create")
	public void createCharacter(@RequestBody Marvel marvel) {
		this.marvelList.add(marvel);
		System.out.println("create");
	}

	// READ
	@GetMapping("/getAll")
	public List<Marvel> getMarvel() {
		System.out.println("getAll");
		return this.marvelList;
	}

	// READ ONE
	@GetMapping("/getOne/{index}")
	public Marvel getCharacterById(@PathVariable int index) {
		System.out.println("getOne");
		return this.marvelList.get(index);
	}

	// DELETE
	@DeleteMapping("/remove/{index}")
	public Marvel removeCharacter(@PathVariable int index) {
		System.out.println("delete");
		return this.marvelList.remove(index);
	}

	// UPDATE
	@PatchMapping("/update/{id}")
	public Marvel replace(@PathVariable Long id, @PathParam("name") String name, @PathParam("species") String species,
			@PathParam("dead") boolean dead, @PathParam("superSoldier") boolean superSoldier) {
		System.out.println("update");
		return null;
	}

}
