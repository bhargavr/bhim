/**
 * 
 */
package com.srushti.bhim.dto;

import java.util.Date;
import java.util.List;

/**
 * @author bhargav
 *
 */
public class Menu {
	
	
	private Integer menu_id;
	
	private Date create_date;
	
	private String menuName;
	
	private String resturant;
	
	private String menuType;

	private List<MenuItem> menuItems;
	
	public Menu(Integer menu_id, Date create_date, String menuName, String resturant, String menuType,
			List<MenuItem> menuItems){
		this.menu_id = menu_id;
		this.create_date = create_date;
		this.menuName = menuName;
		this.resturant = resturant;
		this.menuType = menuType;
		this.menuItems = menuItems;
	}
	
	/**
	 * @return the menu_id
	 */
	public Integer getMenu_id() {
		return menu_id;
	}

	/**
	 * @return the create_date
	 */
	public Date getCreate_date() {
		return create_date;
	}

	/**
	 * @return the menuName
	 */
	public String getMenuName() {
		return menuName;
	}

	/**
	 * @return the resturant
	 */
	public String getResturant() {
		return resturant;
	}

	/**
	 * @return the menuType
	 */
	public String getMenuType() {
		return menuType;
	}
	
	/**
	 * @return the menuItems
	 */
	public List<MenuItem> getMenuItems() {
		return menuItems;
	}
}
