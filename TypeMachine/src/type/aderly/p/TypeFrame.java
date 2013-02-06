package type.aderly.p;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public class TypeFrame extends javax.swing.JFrame {
	public JLabel typeLabel;
	public JPanel typePanel;
	public JButton jButton4;
	public JButton jButton3;
	public JButton jButton2;
	public JButton jButton1;
	
	public JPanel listPanel;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		TypeFrame inst = new TypeFrame();
		inst.setVisible(true);
	}
	
	public TypeFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GridBagLayout thisLayout = new GridBagLayout();
			
			thisLayout.columnWeights = new double[] {0.1,0.1,0.1,0.1};
			thisLayout.columnWidths = new int[] {7,7,7,7};
			
			thisLayout.rowWeights = new double[] {0.1,0.1,0.1,0.1};
			thisLayout.rowHeights = new int[] {7,7,7,7};
			this.getContentPane().setLayout(thisLayout);
			this.setSize(382, 283);
			
			JLabel shopLabel = new JLabel();
			this.getContentPane().add(shopLabel, new GridBagConstraints(0, 0, 4, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			shopLabel.setText("$SHOP$");
			shopLabel.setHorizontalTextPosition(SwingConstants.CENTER);
			shopLabel.setHorizontalAlignment(SwingConstants.CENTER);
			
			
//			shopPanel.setBorder(BorderFactory.createTitledBorder(null, "$Items$", TitledBorder.LEADING, TitledBorder.TOP, new java.awt.Font("Dialog",1,12), new java.awt.Color(0,0,0)));
//			shopPanel.setDoubleBuffered(false);
			
			
			
			
			listPanel = new JPanel();
			BoxLayout shopPanelLayout = new BoxLayout(listPanel,
					javax.swing.BoxLayout.Y_AXIS);
			listPanel.setBorder(BorderFactory.createTitledBorder(null,
					"Type", TitledBorder.LEADING, TitledBorder.TOP,
					new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0,
							0, 0)));
			listPanel.setLayout(shopPanelLayout);
			
			JScrollPane scrollpanel = new JScrollPane(listPanel);
			
			this.getContentPane().add(scrollpanel, new GridBagConstraints(0, 1, 4, 2, 0.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
//			this.getContentPane().add(listPanel,BorderLayout.CENTER);
		
			jButton1 = new JButton();
			this.getContentPane().add(jButton1, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			jButton1.setText("Cancel");
			jButton1.setPreferredSize(new java.awt.Dimension(90, 30));
			
			jButton3 = new JButton();
			this.getContentPane().add(jButton3, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			jButton3.setText("Add");
			jButton3.setPreferredSize(new java.awt.Dimension(90, 30));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
