package type.aderly.p;

import java.awt.Component;
import java.lang.reflect.Type;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;


public class TypeItemPanel extends JPanel {
	private JLabel itemLabelOriginArticle;
	private JTextField itemLabelInputArticle;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new TypeItemPanel());
		frame.pack();
		frame.show();
	}
	
//	public Component getListCellRendererComponent(
//			JList list,
//			Object value,
//			int index,
//			boolean isSelected,
//			boolean cellHasFocus) {
//		DataItem item = (DataItem)value;
//		this.itemLabelInputArticle.setText(item.getInput());
//		this.itemLabelOriginArticle.setText(item.getOrigin());
//		return this;
//	}
	
	public TypeItemPanel() {
		super();
		initGui();
	}
	
	public JTextField getInput() {
		return itemLabelInputArticle;
	}
	
	public void setOriginText(String s) {
		itemLabelOriginArticle.setText(s);
	}
	
	private void initGui() {
		try {
			//make the origin text and input text arrange vertically
			this.setLayout(new BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

			//add the origin text and input text
			itemLabelOriginArticle = new JLabel();
			this.add(itemLabelOriginArticle);
			itemLabelOriginArticle.setText("<HTML><font color=red>∫Ï</font><font color=blue>¿∂</font></html>");
//			itemLabelOriginArticle.setText("∫Ï¿∂");
			
			itemLabelOriginArticle.setPreferredSize(new java.awt.Dimension(400, 40));
			itemLabelOriginArticle.setFont(new java.awt.Font("Dialog", 1, 25)); 
//			itemLabelOriginArticle.setAlignmentX(JPanel.LEFT_ALIGNMENT);
			itemLabelOriginArticle.setHorizontalAlignment(JLabel.LEFT);
			
			itemLabelInputArticle = new JTextField(10);
			this.add(itemLabelInputArticle);
			itemLabelInputArticle.setPreferredSize(new java.awt.Dimension(400, 40));
			itemLabelInputArticle.setFont(new java.awt.Font("Dialog", 1, 25));
			
			itemLabelInputArticle.getDocument().addDocumentListener(new DocumentListener() {
				
				@Override
				public void removeUpdate(DocumentEvent e) {
					// TODO Auto-generated method stub
					System.out.println("remove");
				}
				
				@Override
				public void insertUpdate(DocumentEvent e) {
					// TODO Auto-generated method stub
					System.out.println("insert");
				}
				
				@Override
				public void changedUpdate(DocumentEvent e) {
					// TODO Auto-generated method stub
					System.out.println("update");
				}
			});
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}