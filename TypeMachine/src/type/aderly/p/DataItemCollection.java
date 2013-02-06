package type.aderly.p;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.util.ArrayList;

public class DataItemCollection {
	private ArrayList<DataItem> mItemList = null;
	int listLength = 0;
	ArticleIO articleFile;
//	String testString[] = {"test","test","sfsdf","sdffs"};
	
	public DataItemCollection() {
		init();
		getArticle();
	}
	
	private void init() {
		mItemList = new ArrayList<DataItem>();
	}
	
	private void getArticle(){
		articleFile = new ArticleIO();
		String sTemp = null;
		int i = 0;
		while((sTemp = getLines())!=null) {
			DataItem item = new DataItem(sTemp);
			mItemList.add(item);
			listLength++;
		}
	}
	
	public DataItem getItem(int i) {
		return mItemList.get(i);
	}
	
	public int getLength() {
		return mItemList.size();
	}
	
	public static void main(String args[]) {
		new DataItemCollection();
	}
	
	private String getLines() {
		String s = "";
		int tempChar;
		for(int i=0;i<44;i++){
			if((tempChar = articleFile.read()) == -1){
				if(s == "") return null;
				break;
			} else if(tempChar == '\r'){
				articleFile.read();
				break;
			} else {
//				s = s + String.valueOf((char)tempChar);
				s = Utility.ColorString(true, s, tempChar);
			}
		}
		return "<HTML>" + s + "</html>";
//		return s;
	}
}