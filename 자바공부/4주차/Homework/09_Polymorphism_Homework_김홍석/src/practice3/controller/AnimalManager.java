package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {

		Animal[] animal = new Animal[5];
		for (int i = 0; i < animal.length; i++) {
			if (Math.random()<0.5) {
				animal[i] = new Cat("냐옹이"+i, "고양이", "한국", "검정");
			}else {
				animal[i] = new Dog("멍멍이"+i, "강아지", (int)(4+5*Math.random()));
			}

		}
		
		for(Animal anim : animal) {
			anim.speak();
		}
	}
	

}
