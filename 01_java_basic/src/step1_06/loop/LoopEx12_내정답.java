package step1_06.loop;

/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */


//20210129 08:20 ~ 08:45.
public class LoopEx12_내정답 {

	public static void main(String[] args) {
		
		int i = 1; 
		
		while ( i <= 50 ) {
			
			int score1 = i % 10;
			int score10 = 10 / i;
			
			int test = 0;
					
			if ( score10 != 0 && score10 % 3 == 0 ) test++;
			if ( score1 != 0 && score1 % 3 == 0 ) test++;
		
			if (test == 1 ) {
				System.out.println( "짝" );
				
			}
		    
			else if ( test == 2 ) {
				System.out.println( "짝짝");
			}
		
			else {
				System.out.println( i );
			}
		
		  ++i;
		
		}
		
		
		
		
	}

}
