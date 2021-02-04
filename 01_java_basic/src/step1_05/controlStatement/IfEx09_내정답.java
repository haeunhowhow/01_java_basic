package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 놀이기구 이용제한
 * 
 * 1. 키를 입력받는다.
 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
 *    예) 부모님과 함께 오셨나요?(yes:1, no:0)
 */

//20210119
public class IfEx09_내정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    
		System.out.println("키 : ");
		int cm = scan.nextInt();
		
		if ( cm >= 120 ) {
			System.out.println( "이용가능 " );
			
		}
		
		if ( cm <120 ) {
			System.out.print("부모님과 함께 오셨나요 ? (yes:1, no:0) ");
			int together = scan.nextInt(); 
			
			if ( together == 0 );{
			System.out.println("이용가능 ");
			}
			
			if ( together == 1 ); {
		    	System.out.println( "이용불가 ");
			}
			
		    	
		    
		}
		
		
		
		
		
		
		scan.close();
	}

}
