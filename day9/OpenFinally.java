import java.io.*;
class OpenFinally 
{
	public static void main(String[] args) 
	{
		FileReader fileReader = null;
		try{
			File file = new File("D:\\A.txt");
			fileReader = new FileReader(file);
			char[] buf = new char[1024];
			int length = 0;
			length = fileReader.read(buf);
			System.out.println("��ȡ��������:" + new String(buf,0,length));
		}catch(IOException e){
			System.out.println("��ȡ��Դ�ļ�ʧ��....");
		}finally{
			try{
				fileReader.close();
				System.out.println("�ͷ���Դ�ļ��ɹ�...");
			}catch(IOException e){
				System.out.println("�ͷ���Դ�ļ�ʧ��....");
			}
		}
	}
}
