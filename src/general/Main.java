package general;

import questions.*;
import java.util.ArrayList;

/**
 * A game which asks a number of questions, controls the answers from the user, 
 * and continually keeps score and reports whether the answers are correct or not.
 *
 * @author sparkhound
 * 2023-05-19
 *
 **/
public class Main {

	/**
	 * The main method.
	 * @param args - not used
	 */	
	public static void main(String[] args) {

		ArrayList<Question> questions = new ArrayList<Question>();

		questions.add(new Question1());
		questions.add(new Question2());
		questions.add(new Question3());
		questions.add(new Question4());
		questions.add(new Question5());
		questions.add(new Question6());
		questions.add(new Question7());
		questions.add(new Question8());

		GameLogic game = new GameLogic(questions);

		game.letsPlay();

		

	}
}
