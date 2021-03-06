package finaltest;

public class Gugudan {

	private int left;
	private int right;

	

	public Gugudan(int i, int j) {
		this.left = i;
		this.right= j;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (left*right);
		// result = prime * result + right;
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
		Gugudan other = (Gugudan) obj;
		/*
		 * if (left != other.left) return false; if (right != other.right) return false;
		 */
		if(left*right != other.left*other.right)
			return false;
		return true;
	}

	@Override
	public String toString() {
		// return "Gugudan [left=" + left + ", right=" + right + "]";
		return ""+ left * right;
	}

}
