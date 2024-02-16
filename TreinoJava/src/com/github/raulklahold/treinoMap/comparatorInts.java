package com.github.raulklahold.treinoMap;

import java.util.Comparator;
import java.util.Map;

public class comparatorInts {

	 public class ComparatorInts implements Comparator<integer>{
		 
		 private Map<integer string=""> base;

		  public ComparatorInts(Map<integer, string=""> base) {
		    this.base = base;
		  }

		  @Override
		  public int compare(Integer o1, Integer o2) {
		    return base.get(o1).compareTo(base.get(o2));
		  }
		 
	 }
}
