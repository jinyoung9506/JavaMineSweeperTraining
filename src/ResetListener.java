import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ResetListener implements ActionListener {
	private JFrame frame;
	private JPanel panel;
	private int row;
	private int col;
	private int size;
	
	public ResetListener(JFrame frame, JPanel panel, int row, int col, int size) {
		super();
		this.frame = frame;
		this.panel = panel;
		this.row = row;
		this.col = col;
		this.size = size;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton)e.getSource();
		this.panel.removeAll();
		this.frame.remove(panel);
		PanelSet.setPanel(row, col, size, panel);
		this.frame.add(panel, BorderLayout.CENTER);
		this.panel.updateUI();
	}
}
