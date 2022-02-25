package codes;

import java.util.Random;

public class MainDrive {

	public static void main(String[] args) {
		
//		컴퓨터가 세자리 숫자 출제
//		int 세칸짜리 배열로.
		
		int[] cpuNumbers = new int[3];
		
		for(int i=0; i<cpuNumbers.length; i++) {
			
			while(true) {
				
				Random myRandom = new Random();
				int randomNum = myRandom.nextInt(9)+1; // 1~10직전 (9)
				
				boolean isDulpOk = true;
				
				for(int num : cpuNumbers) {
					if (num == randomNum) {
						isDulpOk = false;
						break;
					}
				}
				
				if (isDulpOk) {
					cpuNumbers[i] = randomNum;
					break;
				}
				
			}
			
		}
		
//		문제 확인용 for문
		for(int num : cpuNumbers) {
			System.out.print(num);
		}
		
	}
	
}
