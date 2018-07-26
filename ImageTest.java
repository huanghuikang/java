import java.io.*;
class ImageTest{
  public static void main(String[] args) throws Exception{
	File inFile = new File("E:\\hhk\\Images\\a.jpg");
	File outFile = new File("E:\\hhk\\Images\\b.jpg");

	FileInputStream input = new FileInputStream(inFile);
	FileOutputStream output = new FileOutputStream(outFile);
	int content = 0;
	while((content = input.read()) != -1){
	output.write(content^12);
	}
	output.close();
	input.close();
  }
}