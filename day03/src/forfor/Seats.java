package forfor;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입장객 수 입력 : ");
		int customNum = sc.nextInt();
		
		System.out.print("좌석 열의 수 입력 : ");
		int colNum = sc.nextInt();
		
		int rowNum; //좌석 줄(행) 
		rowNum = customNum / colNum;
		if(customNum % colNum == 0) {
		}
		else {
			if(colNum < customNum) {
				rowNum += 1;	
			}
			else {
				rowNum = 1;
			}
		}
		
		for(int i = 0; i<rowNum; i++) {
			for(int j = 1; j<=colNum; j++) {
				int seats = i * colNum + j;
				System.out.print("좌석"+seats+" ");
				if(seats == customNum)
					break;
			}
			System.out.println();
		}
		
		System.out.println("==================");
		System.out.println(rowNum + "개의 줄이 필요합니다.");
		sc.close();
	}

}
