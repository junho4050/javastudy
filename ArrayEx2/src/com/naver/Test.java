package com.naver;

import java.security.PublicKey;

public class Test {
	public void me1() {
		// 2���� �迭
		// 2���� �迭 �ȿ��� 1���� �迭�� ��� �ִ�
		// ���� ��ڰ��� �ڷ����� int�� 2 ���� �迭�� �����Ͻÿ�.
		int[][] arr;

	}

	public void me2() {
		// ���� ��ڰ��� �ڷ����� StringBuffer�� 2���� �迭���� 5���� 1���� �迭�� �ִ�.
		// �׸��� �� �ȿ��� �ִ� 1���� �迭�� ũ��� 3�̴�.
		StringBuffer[][] arr = new StringBuffer[5][3];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
	}

	public void me21() {
		// ���� ��ڰ��� �ڷ����� Dog�� 2���� �迭 arr�� ũ��� 10�̰�,
		// �� �ȿ� �ִ� �迭�� ũ��� 2�̴�.
		Dog[][] arr = new Dog[10][2];
		// arr�� ��� ��ڰ��� ����Ͻÿ�.
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] != null) {
					System.out.println(arr[i][j].getName());

				}
			}
		}
	}

	public void me22() {
		int[][] arr = new int[5][4];
		// 1. arr�� ��� ��ڰ� ��� ���
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			// arr�� ���� ��ڰ� ��� ���
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		// 3.arr�� �ε����� 0�� ��ڰ��� �ε����� 2�� ��ڰ��� ����Ͽ����
		// arr[0][2]
		System.out.println(arr[0][2]);
		// 4.arr�� ���� ū �ε����� ��ڰ��� ���� ���� �ε����� ��ڰ��� 100���� �����Ͻÿ�
		arr[arr.length - 1][0] = 100;
		// 5.arr�� ���� ū �ε����� ��ڰ��� ���� ���� �ε����� ��ڰ��� ����Ͻÿ�
		System.out.println(arr[arr.length - 1][0]);
	}

	public void me23() {
		int[][] arr = new int[3][4];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j]);

			}
		}

	}

	public void me3() {
		int[][] arr1 = { { 4, 1, 0 }, { 4, 1, 8 }, { 5, 7, 1 } };
		String[][] arr2 = { { "good ", "oh", "my" }, { "god", "thank", "you" } };
		// 5~0�� ��ȯ�Ǹ鼭 �迭�� ��
		// int�� 3 ���� arr3�� 3x1x4ũ��
		int[][][] arr3 = { { { 5, 6, 7, 8 } }, { { 9, 0, 1, 2 } }, { { 3, 4, 5, 6 } } };
		// arr�� ������ index�� ��ڰ��� 1��° ��ڰ��� ����Ͻÿ�
		int[] sub2 = arr3[arr3.length - 1][0];
		System.out.println(sub2);

		// int�� 2���� �迭 arr4�� 5x3 ũ�⸦ ���´�
		int[][] arr4 = { { 5, 6, 7 }, { 8, 9, 0 }, { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// arr4�� [2][1]�� ��ڰ��� 100���� �����Ͽ���.
		arr4[2][1] = 100;
		// arr4�� 3��° ��Ұ��� ��� ���� ��ڰ��� ���϶�

		for (int i = 0; i < arr4[2].length; i++) {
			System.out.println(arr4[2][i]);
		}
		int[][] arr5 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < arr5[1].length; i++) {
			System.out.println(arr5[1][i]);
		}
		System.out.println(arr5[arr5.length - 1][0]);

	}

	public void me4() {
		int[][] arr = new int[3][10];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0) {
					arr[i][j] = i + 1;

				} else if (i == 1) {
					arr[i][j] = i * 2;
					{
					}
				} else {
				}
				arr[i][j] = i * 2 + 1;

			}

		}

	}
	
	public void me5() {
		int[][] arr = new int[3][];
		//0 : 1,2,3,4
		//1 : 0,2,4
		//2 : 1,3,5,7,9
		arr[0] = new int[] {1,2,3,4};
		arr[1] = new int[] {0,2,4};
		arr[2] = new int[] {1,3,5,7,9};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}


