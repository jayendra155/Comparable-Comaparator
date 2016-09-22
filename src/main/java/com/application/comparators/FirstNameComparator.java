package com.application.comparators;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		int l1 = student1.getFirstName().length();
		int l2 = student2.getFirstName().length();
		int min = Math.min(l1, l2);
		for (int i = 0; i < min; i++) {
			int s1 = (int) student1.getFirstName().charAt(i);
			int s2 = (int) student2.getFirstName().charAt(i);
			if (s1 > s2)
				return 1;
			else if (s1 < s2)
				return -1;
		}
		if (l1 > l2)
			return 1;
		else if (l1 < l2)
			return -1;
		else
			return 0;
	}

}
