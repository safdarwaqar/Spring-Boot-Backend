package com.safdar.angular.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.safdar.angular.model.Items;
import com.safdar.angular.service.ItemService;



@RestController
@CrossOrigin
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	
	@PostMapping(path="/addItem",consumes = "application/json")
	public Items addItem(@RequestBody Items item) {
		
		System.out.println("Added Items...");
		return itemService.addItem(item);
	}
	@GetMapping(path="/getItem")
	public Iterable<Items> getItems() {
		System.out.println("saved using getMapping");
		return itemService.getAllItem();
		
		
	}
	

}
