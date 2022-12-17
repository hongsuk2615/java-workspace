package com.practiceprogrammers.model.vo;



public class DefenceGame {
	private int maxRound = 0;
	private int soldierNum = 0;
	public int solution(int n, int k, int[] enemy) {
		int answer = 0;
		while(k == 0) {
			enemy = enemyAfterUlt(whenToUseUlt(n, enemy), enemy);
			k--;
		}

		return answer;
	}

	public int whenToUseUlt(int n, int[] enemy) { // 무적권써야하는 조건 : 해당 인덱스까지의 합 > n , 인덱스값 반환
		int sum = 0;
		for (int index = 0; index < enemy.length; index++) {
			sum += enemy[index];
			if (sum > n) {
				return index;
			}
		}
		System.out.println("무적권안써도됨");
		return 0;
	}

	public int[] enemyAfterUlt(int index, int[] enemy) { // index : 무적권 써야하는 인덱스범위 , 인덱스까지의 enemy 값중 최대일때 사용
		int[] result = new int[enemy.length - 1]; // 무적권사용후 enemy 정수배열
		int[] partOfEnemy = new int[index + 1];
		int max;
		for (int i = 0; i < index + 1; i++) { // 무적권 써야하는 인덱스 범위까지의 int배열
			partOfEnemy[i] = enemy[i];
		}
		max = partOfEnemy[0];
		int ultIndex = 0;
		for (int i = 1; i < partOfEnemy.length; i++) { // 무적권써야하는 인덱스 ultIndex구하기
			if (max < partOfEnemy[i]) {
				max = partOfEnemy[i];
				ultIndex = i;
			}
		}
		for (int i = 0; i < enemy.length; i++) { // enemy[ultIndex]값을뺀 정수배열 만들기
			if (i != ultIndex)
				result[i] = enemy[i];
		}
		return result;
	}
}
