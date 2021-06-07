package de.telekom.sea.together;

public class Together<T, U> {

	private T t;
	private U u;
	
	public Together() {
	}
	
	public Together(T t, U u) {
		this.t = t;
		this.u = u;
	}
	
	public boolean join(T t, U u) {	
		this.t = t;
		this.u = u;
		return true;
	}
	
	public void split() {
		this.t = null;
		this.u = null;
	}
	
	@Override
	public boolean equals(Object obj) {
		return false;
	}
	
	@Override
	public int hashCode() {
		return (t.hashCode() + u.hashCode());
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", t.toString(), u.toString());
	}
	
}
