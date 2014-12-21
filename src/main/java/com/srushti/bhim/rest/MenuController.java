/**
 * 
 */
package com.srushti.bhim.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.srushti.bhim.dto.Menu;
import com.srushti.bhim.dto.MenuItem;

/**
 * @author bhargav
 *
 */
@RestController
public class MenuController {

    @RequestMapping(value = "/menu/{id}", method = RequestMethod.GET)
    public Menu getMenu(@PathVariable("id") String resturantId) {
    	List<MenuItem> menuItemList = new ArrayList<MenuItem>();
    	MenuItem mi1 = new MenuItem(1,new Date(), 1, "Iddly", "/dd/dd/dd/", "Iddly", "Medium", new Float(7.2),100);
    	MenuItem mi2 = new MenuItem(2,new Date(), 1, "Dosa", "/dd/dd/dd/", "Dosa", "Medium", new Float(7.2),100);
    	MenuItem mi3 = new MenuItem(3,new Date(), 1, "Sambar", "/dd/dd/dd/", "Sambar", "Medium", new Float(7.2),100);    	
    	
    	menuItemList.add(mi1);
    	menuItemList.add(mi2);
    	menuItemList.add(mi3);
    	
        return new Menu(1,new Date(),"Veg Menu", "Madras Cafe", "Veg Menu", menuItemList);
    }


}
