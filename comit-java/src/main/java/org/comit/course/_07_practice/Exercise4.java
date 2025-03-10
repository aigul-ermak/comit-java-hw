package org.comit.course._07_practice;

class Sport {

	void play() {
		System.out.println("Sport");
	}
}

class Football extends Sport {

	@Override
	void play() {
		System.out.println("Football");
	}
}

class Basketball extends Sport {

	@Override
	void play() {
		System.out.println("Basketball");
	}
}

class Rugby extends Sport {

	@Override
	void play() {
		System.out.println("Rugby");
	}
}

public class Exercise4 {
	public static void main(String[] args) {

		Sport football = new Football();
		football.play();

		Sport basketball = new Basketball();
		basketball.play();

		Sport rugby = new Rugby();
		rugby.play();

	}
}
