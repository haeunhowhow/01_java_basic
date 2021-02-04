package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # Up & Down 게임[1단계]
 * 
 * 1. com은 8이다.
 * 2. me는 com의 숫자를 맞추는 게임이다.
 * 3. 다음과 같은 메세지를 출력한다.
 * 1) me < com	: Up!
 * 2) me == com : Bingo!
 * 3) me > com  : Down!
 */

//20210115 08:00 ~08:12
public class IfEx02_내정답 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		
		int com = 8;	
		
		System.out.println("정답 : ");
		int me = scan.nextInt();
		
		if ( com == me ) {
			System.out.println("Bingo !");
			
		}	
		if ( com > me ) {
			System.out.println("Up !");
			
		}
		if ( com < me ) {
		    System.out.println("Down !");
		    
		}
				
		
		
		scan.close();
		
	}

}
