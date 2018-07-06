package view;

import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyContentPane extends JPanel {

	private JPanel phrasePanel;
	private ArrayList<JLabel> words;
	
	public MyContentPane() {
		phrasePanel = new JPanel();
		phrasePanel.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
	}
	
}
