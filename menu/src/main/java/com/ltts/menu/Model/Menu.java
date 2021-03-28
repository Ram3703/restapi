package com.ltts.menu.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Menu{
	@Id
	@Column
	private int menuId;
	@Column
	private String MenuName;
	@Column
	private int MenuCost;
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return MenuName;
	}
	public void setMenuName(String menuName) {
		MenuName = menuName;
	}
	public int getMenuCost() {
		return MenuCost;
	}
	public void setMenuCost(int menuCost) {
		MenuCost = menuCost;
	}
	
}