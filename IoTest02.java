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
			byte[] flush=new byte[1024];//缓冲容器,实际按1kb缓冲
			int len=-1;//接收长度
			while((len=is.read(flush))!=-1) {
				//字节数组--》字符串（解码）
				String str=new String(flush,0,len);//len为实际长度
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
