package cn.io.study02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 
 * 
 * @author dell
 *
 */

public class IoTest02 {
	public static void main(String[] args) {
		File src=new File("abc.txt");
		InputStream is=null;
		try {
			is=new FileInputStream(src);
			byte[] flush=new byte[1024];//��������,ʵ�ʰ�1kb����
			int len=-1;//���ճ���
			while((len=is.read(flush))!=-1) {
				//�ֽ�����--���ַ��������룩
				String str=new String(flush,0,len);//lenΪʵ�ʳ���
				System.out.print(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(null!=is) {
				is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
