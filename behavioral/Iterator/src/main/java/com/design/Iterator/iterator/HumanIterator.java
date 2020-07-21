package com.design.Iterator.iterator;

import java.util.List;

import com.design.Iterator.interfaces.Iterator;
import com.design.Iterator.object.Human;

public class HumanIterator implements Iterator<Human> {
	private List<Human> humanList;
	private int position;
	
	public HumanIterator(List<Human> h) {
		this.humanList= h;
		this.position=0;
	}

	public void reset() {
		this.position=0;
		
	}

	public Human next() {
		return humanList.get(position++);
	}

	public Human currentItem() {
		// TODO Auto-generated method stub
		return humanList.get(position);
	}

	public boolean hasNext() {
		// TODO Auto-generated method stub
		return position <  humanList.size();
	}

}
