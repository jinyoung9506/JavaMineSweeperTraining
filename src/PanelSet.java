import java.awt.BorderLayout;

import javax.swing.JPanel;

public class PanelSet {
	public static Cell[][] cell = null;
	public static Cell[] temp = new Cell[8];
	
	public static void setPanel(int row, int col, int size, JPanel panel) {
		cell = new Cell[row][col];
		
		for (int i = 0; i < cell.length; i++) {
			for (int j = 0; j < cell[i].length; j++) {
				if (((Math.random() * 100) % 10 ) <= 3 ) {
					cell[i][j] = new Mine(i, j, size);
					panel.add(cell[i][j]);
					//cell[i][j].addActionListener(new MineListener());
				} else {
					cell[i][j] = new Land(i, j, size);
					panel.add(cell[i][j], BorderLayout.CENTER);
					//cell[i][j].addActionListener(new LandListener());
				}
			}
		}
		
		for (int i = 0; i < cell.length; i++) {
			for (int j = 0; j < cell[i].length; j++) {
				if (cell[i][j].toString().equals("Land")) {
					((Land) cell[i][j]).setSurround(temp);
				} 
			}
		}
	} 
}
