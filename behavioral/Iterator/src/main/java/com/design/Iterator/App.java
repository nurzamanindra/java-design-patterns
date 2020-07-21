package com.design.Iterator;

import java.util.ArrayList;
import java.util.List;

import com.design.Iterator.interfaces.CustomList;
import com.design.Iterator.interfaces.Iterator;
import com.design.Iterator.iterator.HumanList;
import com.design.Iterator.object.Human;

public class App 
{
    public static void main( String[] args )
    {
    	List<Human> listOfHuman = new ArrayList<Human>();
    	listOfHuman.add(new Human("anthon", 23));
    	listOfHuman.add(new Human("marry", 33));
    	listOfHuman.add(new Human("john", 34));
    	listOfHuman.add(new Human("hansel", 12));
    	listOfHuman.add(new Human("mathew", 55));
    	
    	CustomList<Human> cs = new HumanList(listOfHuman);
    	Iterator<Human> iterator = cs.iterator();
    	
    	System.out.println("get human iterator");
    	while(iterator.hasNext()) {
    		Human currentItem = iterator.currentItem();
    		System.out.println(currentItem.toString());
    		iterator.next();
    	}

    	
    	
    }
}
