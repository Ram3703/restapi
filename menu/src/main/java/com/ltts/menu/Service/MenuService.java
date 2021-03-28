package com.ltts.menu.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.menu.Model.Menu;
import com.ltts.menu.repository.MenuRepository;

@Service
public class MenuService {
	@Autowired
	MenuRepository menuRepository;  
	public List<Menu> getAllBooking()   
	{  
	List<Menu> menu = new ArrayList<Menu>();  
	menuRepository.findAll().forEach(menu1 -> menu.add(menu1));  
	return menu;  
	}
	public Menu getBookingById(int id)   
	{  
	return menuRepository.findById(id).get();  
	}  
	public void saveOrUpdate(Menu menu)   
	{  
	menuRepository.save(menu);  
	}  
	public void delete(int id)   
	{  
	menuRepository.deleteById(id);  
	} 
	public void update(Menu menu, int menuid)   
	{  
	menuRepository.save(menu);  
	} 
}
