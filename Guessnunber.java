/*猜数字游戏*/

import java.util.*;
class Guessnunber{
  public static void main(String[] args){
	Random random = new Random();
	int randomNum = random.nextInt(10) + 1;
	Scanner scanner = new Scanner(System.in);

	while(true){
		System.out.println("请输入你要猜的数字：");
		int guessNum = scanner.nextInt();
		if(guessNum > randomNum){
			System.out.println("猜大了...");
			}else if(guessNum < randomNum){
			System.out.println("猜小了...");
			}else{
			System.out.println("恭喜你，猜对了...");
			break;
			}
		}
	}
}