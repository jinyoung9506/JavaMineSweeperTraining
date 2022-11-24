public class Land extends Cell {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6943989172698493448L;
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
	}
	
	public void pushed() {
		this.setText(String.valueOf(this.mineCount));
	}
}