class Dnumber{
  public static void main(String[] args){
	int num = 1;
	int sum = 0;
	do{
	if(num % 2 == 0){
		sum = sum + num;
		}
		num++;
	    }
	while(num <=100);
	System.out.println("1~100的偶数总和为："+sum);
	}
}