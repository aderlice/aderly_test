package type.aderly.p;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

public class Utility {
	public static ArrayList<TypeItemPanel> getItem (ArrayList<TypeItemPanel> a, DataItemCollection data) {
		
		for(int i=0;i<data.getLength();i++) {
			a.add(new TypeItemPanel());
			a.get(i).setOriginText(data.getItem(i).getOrigin());
		}
		
		return a;
		
	}
	
	public static String ColorString(boolean b, String s, int c){
		s = s + "<font color=" + (b?"red":"black") + ">" + String.valueOf((char)c) + "</font>";
		return s;
	}
}