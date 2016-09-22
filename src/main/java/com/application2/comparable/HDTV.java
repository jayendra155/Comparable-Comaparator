package com.application2.comparable;

public class HDTV implements Comparable<HDTV> {

	private Integer size;
	private Double dpi;

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Double getDpi() {
		return dpi;
	}

	public void setDpi(Double dpi) {
		this.dpi = dpi;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dpi == null) ? 0 : dpi.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HDTV other = (HDTV) obj;
		if (dpi == null) {
			if (other.dpi != null)
				return false;
		} else if (!dpi.equals(other.dpi))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		return true;
	}

	public HDTV(Integer size, Double dpi) {
		super();
		this.size = size;
		this.dpi = dpi;
	}

	@Override
	public int compareTo(HDTV o) {
		if (this.getSize() > o.getSize())
			return 1;
		else if (this.getSize() < o.getSize())
			return -1;
		else
			return 0;
	}

}
