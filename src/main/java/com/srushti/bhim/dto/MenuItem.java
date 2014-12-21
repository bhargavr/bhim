/**
 * 
 */
package com.srushti.bhim.dto;

import java.util.Date;

/**
 * @author bhargav
 *
 */
public class MenuItem {
	
	private Integer menu_item_id;
	
	private Date create_date;
	
	private Integer menu_id;
	
	private String menuItemName;
	
	private String menuItemImageURL;
	
	private String menuItemDesc;
	
	private String menuItemSpicyLevel;
	
	private Float menuItemPrice;
	
	private Integer menuItemCalories;
	
	
	public MenuItem(Integer menu_item_id, Date create_date, Integer menu_id,  String menuItemName, String menuItemImageURL, String menuItemDesc,
	String menuItemSpicyLevel, Float menuItemPrice,	Integer menuItemCalories){
		this.menu_id = menu_id;
		this.create_date = create_date;
		this.menu_item_id = menu_item_id;
		this.menuItemName = menuItemName;
		this.menuItemImageURL = menuItemImageURL;
		this.menuItemDesc = menuItemDesc;
		this.menuItemSpicyLevel = menuItemSpicyLevel;
		this.menuItemPrice = menuItemPrice;
		this.menuItemCalories = menuItemCalories;
	}
	
	/**
	 * @return the menu_item_id
	 */
	public Integer getMenu_item_id() {
		return menu_item_id;
	}

	/**
	 * @return the create_date
	 */
	public Date getCreate_date() {
		return create_date;
	}

	/**
	 * @return the menu_id
	 */
	public Integer getMenu_id() {
		return menu_id;
	}

	/**
	 * @return the menuItemName
	 */
	public String getMenuItemName() {
		return menuItemName;
	}

	/**
	 * @return the menuItemImageURL
	 */
	public String getMenuItemImageURL() {
		return menuItemImageURL;
	}

	/**
	 * @return the menuItemDesc
	 */
	public String getMenuItemDesc() {
		return menuItemDesc;
	}

	/**
	 * @return the menuItemSpicyLevel
	 */
	public String getMenuItemSpicyLevel() {
		return menuItemSpicyLevel;
	}

	/**
	 * @return the menuItemPrice
	 */
	public Float getMenuItemPrice() {
		return menuItemPrice;
	}

	/**
	 * @return the menuItemCalories
	 */
	public Integer getMenuItemCalories() {
		return menuItemCalories;
	}

}
