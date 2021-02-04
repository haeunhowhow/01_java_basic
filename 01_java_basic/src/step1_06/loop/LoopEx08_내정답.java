package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 
 */

//20210128~
public class LoopEx08_내정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int identifier = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		boolean isRun = true;
		
		
		while (isRun) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
	
		    if (selectMenu == 1) {
		    	
		    	if (identifier ==-1) {
		    		System.out.println("계좌번호 입력 : ");
		   	        int myAcc = scan.nextInt();
		   	        System.out.println("비밀번호 입력 : ");
		    	    int myPw = scan.nextInt();
		    	    
		    	if ( myAcc == dbAcc1 && myPw==dbPw1 ) {
		    		identifier = 1;
		    		System.out.println( dbAcc1 + "환영합니다. ");		    			
		  
		    	}
		    	
		    	else if ( myAcc == dbAcc2 && myPw == dbPw2 ) {
		    		identifier = 2;
		    		System.out.println( dbAcc2 + "환영합니다. ");
		    	
		    	}
		    	
		    	else {
		    		System.out.println("계좌번호와 비밀번호를 확인하세요. ");
		    	}
		    	
		    	}
		    	else {
		    		if ( identifier == 1 ) {
		    			System.out.println("현재"+ dbAcc1 +"로그인 중..");
		    			
		    		}
		    		else if ( identifier == 2) {
		    			System.out.println( "현재"+ dbAcc2 + "로그인 중..");
		    		}			
		    	}	   
		    }
		    
		    
		    
			else if (selectMenu == 2) {
				if (identifier != -1) {
					identifier = -1;
					System.out.println( " 로그아웃 됨");
				}
				
				else {
					System.out.println(" 로그인 후 이용해 주세요.");
				}	
			}
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}

		
		
		
		
		
		scan.close();
	}

}
