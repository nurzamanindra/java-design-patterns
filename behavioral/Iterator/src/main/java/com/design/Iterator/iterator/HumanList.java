package com.design.Iterator.iterator;

import com.design.Iterator.interfaces.Iterator;

import java.util.List;

import com.design.Iterator.interfaces.CustomList;
import com.design.Iterator.object.Human;

public class HumanList implements CustomList<Human> {
	private List<Human> h;
	
	public HumanList(List<Human> newHumanList) {
		this.h = newHumanList;
	}

	
	public Iterator<Human> iterator() {
		// TODO Auto-generated method stub
		return new HumanIterator(h);
	}

}
