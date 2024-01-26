package questions;

import general.Question;

/**
 * One of the specified questions
 * @author sparkhound
 * 2023-05-18
 **/
public class Question6 implements Question {

	private String question = "How can one think about using abstract classes versus interfaces?";
	private String correctAnswer = "1. It's always better to use abstract classes"; 
	private String wrongAnswer2 = "2. If classes are very similar then maybe making an abstract class from which similar classes can inherit is better,\nbut if they are not so similar but do share some functionality then extending an interface is possibly better";
	private String wrongAnswer1 = "3. One should always strive to use abstract classes except when using it for biology where interfaces are better,\n because it let's the programs interface with the animals and plants better"; 
	private int correctAnswerInt = 2;

	/**
	 * The constructor
	 */
	public Question6() {

	}

	/**
	 * @return question - the question
	 */
	@Override
	public String getQuestion() {
		return question;
	}

	/**
	 * @return wrongAnswer1 - one of the wrong answers
	 */
	@Override
	public String getWrongAnswer1() {
		return wrongAnswer1;
	}

	/**
	 * @return wrongAnswer2 - one of the wrong answers
	 */
	@Override
	public String getWrongAnswer2() {
		return wrongAnswer2;
	}

	/**
	 * @return correctAnswer - the correct answer 
	 */
	@Override
	public String getCorrectAnswer() {
		return correctAnswer;
	}

	/**
	 * @return correctAnswerInt - the integer representing the correct answer 
	 */
	@Override
	public int getCorrectAnswerInt() {
		return correctAnswerInt; 
	}

	/**
	 * @return a string presenting the question and it's possible answers 
	 */
	@Override
	public String toString() {
		return String.format("%s\n%s\n%s\n%s\n", getQuestion(), getCorrectAnswer(),  getWrongAnswer2(), getWrongAnswer1());
	}

}
