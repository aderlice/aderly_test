package type.aderly.p;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ArticleIO {
//	private BufferedReader files = null;
	private Reader files = null;
	
	public ArticleIO () {
		try {
			files = new InputStreamReader(new FileInputStream("D:/test.txt"),"GBK");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("file not exist");
		}
	}
	
	public int read(){
		int c = -1;
		try {
			c = files.read();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return c;
	}
	
	public String getLines() {
		String s = "";
		try {
			int tempChar;
			for(int i=0;i<51;i++){
				if((tempChar = files.read()) == -1){
					if(s == "") s = null;
					break;
				} else if(tempChar == '\r'){
					files.read();
					break;
				} else {
					s = s + String.valueOf((char)tempChar);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return s;
	}
}