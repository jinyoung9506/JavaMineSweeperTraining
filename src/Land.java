public class Land extends Cell {
	private int mineCount = 0;
	Cell[] surround;
	
	public Land(int x, int y, int size) {
		super(x, y, size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Land";
	}
	
	public void setSurround (Cell[] srnd) {
		for (Cell cell : srnd) {
			try {
				if (cell.toString().equals("Mine")) {
					this.mineCount++;
				}
			} catch (Exception e) {
				System.out.println("Land Cell");
			}
		}
		this.setText(String.valueOf(this.mineCount));
	}
}