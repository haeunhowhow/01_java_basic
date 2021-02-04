package step1_06.loop;

import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */

//20210129~
public class LoopEx14_내정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	    int max = 0;
	    int i = 1;
	    
	    while ( i <= 3 ) {
	    	System.out.println( "정수" + i + "입력 : ");
	    	int num = scan.nextInt();
	    	
	    	if ( max < num ) {
	    		 max = num;
	    		
	    	}
	    i++;
	    }
	    
	    System.out.println("최대 값 : " + max );
	    
	    
	    scan.close();
	}

}

