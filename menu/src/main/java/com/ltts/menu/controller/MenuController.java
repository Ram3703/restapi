package com.ltts.menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.menu.Model.Menu;
import com.ltts.menu.Service.MenuService;

@RestController
public class MenuController {
	@Autowired
	MenuService menuService;  
	@GetMapping("/menu")  
	private List<Menu> getAllBooking()   
	{  
	return menuService.getAllBooking();  
	}
	@GetMapping("/menu/{menuid}")  
	private Menu getMenu(@PathVariable("menuid") int bookingid)   
	{  
	return menuService.getBookingById(bookingid);  
	}  
	@DeleteMapping("/menu/{menuid}")  
	private void deleteMenu(@PathVariable("menuid") int menuid)   
	{  
	menuService.delete(menuid);  
	}  
	@PostMapping("/booking")  
	private int saveBooking(@RequestBody Menu menu)   
	{  
	menuService.saveOrUpdate(menu);  
	return menu.getMenuId();  
	} 
	@PutMapping("/booking")  
	private Menu update(@RequestBody Menu menu)   
	{  
	menuService.saveOrUpdate(menu);  
	return menu;  
	}
}
