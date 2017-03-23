package metier;

public class Generique <T,S,U> {

	private T x;
	private S y;
	private U z;
	
	@Override
	public String toString() {
		return "Generique [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

	public Generique(T x, S y, U z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public S getY() {
		return y;
	}

	public void setY(S y) {
		this.y = y;
	}

	public U getZ() {
		return z;
	}

	public void setZ(U z) {
		this.z = z;
	}
	
	
}
