package com.naver;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class Test {

	//byte stream에서 입력과 관련된 최상위 부모클래스는 inputstream
	//byte stream에서 출려과 관련된 최상위 부모클래스는 outputstream
	//inputstream,outputstream 추상클래스입니다
	//객체 만들지마
	// I/O 객체는 반드시 개발자가 메모리를 해제 시켜야함
	//1. stream을 선언만 합니다
	//2. try~catch~finally 구조를 만듦
	//3. finally 안에 try~catch
	//4. finally 안에 있는 try에 close()호출, catch에 예외처리 해줌
	//5. 원래 catch에 예외처리 해줌.
	//6. 원래 try를 코딩함

	public void me1() {
		InputStream in = null;
		OutputStream out = null;

		try {
			in = new FileInputStream("C:"+File.separator+"/test.jpg");
			out = new FileOutputStream("C:"+File.separator+"/test_copy.jpg");

			int what = -1;
			// 파일 처음부터 끝까지 데이터를 1바이트 읽어 옴.
			// 몇 번의 반복문을 사용해야 하나?
			// 그래서 for가 아니라 while문을 사용함
			while (true) {
				
				what = in.read();
				
				if (what == -1) {
					break;
				}
				out.write(what);

			}
			System.out.println("file copy end");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();

			}
		}

	}
	public void me2() {
		InputStream in = null;
		BufferedInputStream bis = null;
		
		OutputStream out = null;
		BufferedOutputStream bos = null;
		
		try {
			
			in = new FileInputStream("C:"+File.separator+"/test.jpg");
			bis = new BufferedInputStream(in);
			
			out = new FileOutputStream("C:"+File.separator+"/test_copy2.jpg");
			bos = new BufferedOutputStream(out);
			
			
			while (true) {
				int what = bis.read();
				if (what == -1) {
					break;
				}
				bos.write(what);
			}
			System.out.println("file copy end");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (bos != null) {
					bos.close();
				}
				if (out != null) {
					out.close();
				}
				if (bis != null) {
					bis.close();
				}
				if (in != null) {
					in.close();
				}
			
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void me3() {
		InputStream in = null;
		OutputStream out = null;

		try {
			in = new FileInputStream("C:" + File.separator + "test.jpg");
			out = new FileOutputStream("C:" + File.separator + "test_copy.jpg");

			
			byte [] arr = new byte[1024]; 
			
			
			while (true) {
				int length = in.read(arr);
				
				if (length == -1) {
					break;
				}
				out.write(arr, 0, length);
			}
			System.out.println("file copy end");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public void me4() {
		InputStream in = null;
		BufferedInputStream bis = null;

		OutputStream out = null;
		BufferedOutputStream bos = null;

		try {
			
			in = new FileInputStream("C:"+File.separator+"/test.jpg");
			bis = new BufferedInputStream(in);
			
			out = new FileOutputStream("C:"+File.separator+"/test_copy2.jpg");
			bos = new BufferedOutputStream(out);
			
			byte[] arr = new byte[1024];
			
			while (true) {
				int length = bis.read();
				if (length == -1) {
					break;
				}
				bos.write(arr, 0, length);
			}
			System.out.println("end");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bos != null) {
					bos.close();
				}
				if (out != null) {
					out.close();
				}
				if (bis != null) {
					bis.close();
				}
				if (in != null) {
					in.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void me5() {
		InputStream in = null;
		OutputStream out = null;

		byte[] arr = new byte[1024];

		try {
			in = new FileInputStream("C:" + File.separator + "/test.jpg");
			out = new FileOutputStream(
					"." + File.separator + "src" + File.separator + "upload" + File.separator + "/test_copy2.jpg");

			while (true) {
				int length = in.read(arr);
				if (length == -1) {
					break;
				}
				out.write(arr, 0, length);
			}
			System.out.println("end");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
