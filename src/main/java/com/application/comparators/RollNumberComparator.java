package com.application.comparators;

import java.util.Comparator;

public class RollNumberComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int r1 = o1.getRollNumber();
		int r2 = o2.getRollNumber();
		if (r1 > r2)
			return 1;
		else if (r1 < r2)
			return -1;
		else
			return 0;
	}

}
