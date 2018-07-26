class F{
  public static void main(String[] args){
  //5*5矩形
  /*for(int R = 0;R < 5;R++){
	for(int C = 0;C < 5;C++){
	System.out.print("*");
	}
	System.out.println();
	}*/
  //直角三角形
  /*for(int C = 0;C <= 5;C++){
	for(int R = 0;R <=C;R++){
		System.out.print("*");
		}
  System.out.println();
	}*/

  //倒立直角三角形
  /*for(int C = 0;C <5 ;C++){
	for(int R = 0;R < (5-C);R++){
		System.out.print("*");
		}
  System.out.println();
	}*/

  //九九乘法表
  for(int i = 1; i <= 9;i++){
	for(int j = 1; j <= i; j++){
	System.out.print(i + "*" + j + "=" + i * j + "\t");
	}
  System.out.println();
  }
  }
}