/*��������Ϸ*/

import java.util.*;
class Guessnunber{
  public static void main(String[] args){
	Random random = new Random();
	int randomNum = random.nextInt(10) + 1;
	Scanner scanner = new Scanner(System.in);

	while(true){
		System.out.println("��������Ҫ�µ����֣�");
		int guessNum = scanner.nextInt();
		if(guessNum > randomNum){
			System.out.println("�´���...");
			}else if(guessNum < randomNum){
			System.out.println("��С��...");
			}else{
			System.out.println("��ϲ�㣬�¶���...");
			break;
			}
		}
	}
}