package type.aderly.p;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;



public class Typer extends TypeFrame {
	public static void main(String args[]) {
		new Typer();
	}
	
	private JList typeList;
	private DefaultListModel mList;
	
	public Typer() {
		super();
		
//		JPanel listPanel = new JPanel();
//		
//		BoxLayout shopPanelLayout = new BoxLayout(listPanel,
//				javax.swing.BoxLayout.Y_AXIS);
//		listPanel.setBorder(BorderFactory.createTitledBorder(null,
//				"Type", TitledBorder.LEADING, TitledBorder.TOP,
//				new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0,
//						0, 0)));
//		listPanel.setLayout(shopPanelLayout);

		ArrayList<TypeItemPanel> typeList = new ArrayList<TypeItemPanel>();
		DataItemCollection data = new DataItemCollection();
		typeList = Utility.getItem(typeList, data);
		for(int i=0;i<data.getLength();i++) {
		listPanel.add(typeList.get(i));
		
		}
//		this.getContentPane().add(listPanel,BorderLayout.CENTER);
		
		pack();
		setVisible(true);
		
	}
	
}