package com.aa.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		//return o1.getName().compareTo(o2.getName()); // if feilds are private
	
		return o1.name.compareTo(o2.name);
	
	}

}
