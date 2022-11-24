import java.awt.Font;

import javax.swing.JButton;

public class Cell extends JButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x;
	private int y;
	
	
	public Cell(int x, int y, int size) {
		// TODO Auto-generated constructor stub
		super();
		this.x = x;
		this.y = y;
		this.initCell(this.x, this.y, size);
		this.setLocation((this.x * size), (this.y * size));
	}
	
	public void initCell(int x, int y, int size) {
		this.setSize(size, size);
		this.setFont(new Font("굴림", Font.BOLD, (size / 5)));
		this.setVisible(true);
		this.addActionListener(new ButtonListener());
	}
	
	public void pushed() {
		
	}
}