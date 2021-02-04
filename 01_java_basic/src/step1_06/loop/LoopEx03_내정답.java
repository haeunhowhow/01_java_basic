package step1_06.loop;

//# 반복문 기본문제[2단계]

//20210126 08:32~
public class LoopEx03_내정답 {

	public static void main(String[] args) {
		
		// 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6

		
		//문제1
		
		int total = 0;
		int i = 1;
		while ( i <= 5 ) {
			i++;
		} 
		System.out.println("total");

		//문제2
		
		i=1;
		while ( i <=10 ) {
			if ( 7<=i || 3>i ) {
				System.out.println(i+" ");
			}
			i++;
			
		}
		System.out.println();
		
		//문제3
		
		total = 0;
		i = 1;
		while ( i <= 10) {
			if ( 7<=i || 3>i ) {
				total = total + i;
			}
		    i++;
		}
		System.out.println("tot = " + total);
		
		//문제4
		
		
		int cnt = 0;
		i = 1;
		
		while (i <= 10) {
			
			if (7 <= i || i < 3) {
				cnt++;
			}
			i++;
			
		}
		System.out.println("cnt = " + cnt);


		
		
		
	}

}
