public class Mine extends Cell {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5957091798981306502L;

	public Mine(int x, int y, int size) {
		super(x, y, size, "Mine");
		// TODO Auto-generated constructor stub
		//this.addActionListener(new MineListener());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mine";
	}
}
