package com.safdar.angular.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safdar.angular.model.Items;
import com.safdar.angular.repository.ItemRepositiry;

@Service
public class ItemImpl implements ItemService{

	
	@Autowired
	private ItemRepositiry itemRepositiry;
	@Override
	public Items addItem(Items item) {
		
		Items items = new Items();
		items.setBrand(item.getBrand());
		items.setComment(item.getComment());
		items.setCountry(item.getCountry());
		
		
		items.setDate(item.getDate());
		items.setPrice(item.getPrice());
		items.setFreshness(item.getFreshness());
		items.setName(item.getName());
		itemRepositiry.save(items);
		return item;
	}

	

	@Override
	public Iterable<Items> getAllItem() {
		// TODO Auto-generated method stub
		return itemRepositiry.findAll();
	}



	
	
	
	
	


	


	

}
