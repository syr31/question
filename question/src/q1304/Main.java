package q1304;
//���簢���� �� ���� ���� n�� �Է� ���� �� ������ ���� ���ڷ� �� ���簢�� ���·� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 

import java.util.Scanner;

//������ ���� ������ ó���� ���� ������ �Ʒ������� n��ŭ ���� �� �� 
//�ٷ� ������ ������ �ٽ� �Ʒ������� �����ϴ� ������� ���簢���� �� ������ �ݺ��Ѵ�.

// 1 5 9 13
// 2 6 10 14
// 3 7 11 15
// 4 8 12 16

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int[][] ar = new int[n][n];
		int sum = 1;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[j][i] = sum++;
			}
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}
}
