import javax.swing.*;
import java.awt.*;

public class MineMain {

	public static void main(String[] args) throws Exception {
		int row = 0;
		int col = 0;
		
		// TODO Auto-generated method stub
		try {
			row = Integer.parseInt(JOptionPane.showInputDialog("가로(자연수) 입력."));
		} catch (NumberFormatException e) {
			row = 1;
			// TODO: handle exception
		}
		
		// TODO Auto-generated method stub
		try {
			col = Integer.parseInt(JOptionPane.showInputDialog("세로(자연수) 입력."));
		} catch (NumberFormatException e) {
			col = 1;
			// TODO: handle exception
		}
		
		int size = 100;
		
		JFrame frame = new JFrame("MineSweeperTest");
		JPanel header = new JPanel();
		JPanel panel = new JPanel(new GridLayout(row, col));
		JButton reset = new JButton("RESET");
		reset.addActionListener(new ResetListener(frame, panel, row, col, size));
		
		frame.setTitle("MineSweeper");
		frame.setSize((row * size), ((col * size)) + size);
		panel.setSize((row * size), (col * size));
		
		header.setSize(100, size);
		header.add(reset);
		frame.add(header, BorderLayout.NORTH);
		
		PanelSet.setPanel(row, col, size, panel);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setVisible(true);
		panel.setVisible(true);
		panel.updateUI();
	}
}

