package comparator;

class Strength implements Comparable<Strength> {

	private int index;
	private int val;

	public Strength(int index, int val) {
		super();
		this.index = index;
		this.val = val;
	}

	@Override
	public int compareTo(Strength o) {
		return this.val - o.val;
	}

	@Override
	public String toString() {
		return "Strength [index=" + index + ", val=" + val + "]";
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	
	
}
