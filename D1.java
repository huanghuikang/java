class D{
  public static void main(String[] args){
	/*int i = 7;
	int num = 0;
	int sum = 0;
	while(num < 100){
		num = num + i;
		sum = num + sum;
		System.out.println("sum = " + sum);
		}
		System.out.println("sum = " + sum);*/

	int num = 1;
	int sum = 0;
	while(num <= 100){
		if(num % 7 == 0){
		sum = sum + num;
		}
		num++;
		}
	System.out.println("sum = " + sum);
	}
}