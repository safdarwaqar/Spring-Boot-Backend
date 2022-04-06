package com.safdar.angular.service;

import com.safdar.angular.model.Items;

public interface ItemService {

	
	public Iterable<Items> getAllItem();
	public Items addItem(Items item);
}
