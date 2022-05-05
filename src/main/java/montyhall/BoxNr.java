package montyhall;

public class BoxNr {
	public static final int maxBoxNr = 2;
	final int nr;

	public BoxNr(int nr) {
		assert (0 <= nr && nr <= 2);
		this.nr = nr;
	}

	@Override
	public String toString() {
		return "" + nr;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		BoxNr boxNr = (BoxNr) o;
		return nr == boxNr.nr;
	}

}
