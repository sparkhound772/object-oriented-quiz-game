package questions;

import general.Question;

/**
 * One of the specified questions
 * @author sparkhound
 * 2023-05-18
 **/
public class Question5 implements Question {

	private String question = "What is practical about inheritance?";
	private String wrongAnswer2 = "1. Mainly that biologists are able to faster uncover new insights about the animal kingdom";
	private String wrongAnswer1 = "2. We don't have to reinvent programming concepts due to the developments in the fifties";
	private String correctAnswer = "3. Repetition of code is avoided (several subclasses can inherit their superclass methods),\n and different implementations of methods in the subclasses can be called polymorphically";
	private int correctAnswerInt = 3;

	/**
	 * The constructor
	 */
	public Question5() {

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
		return String.format("%s\n%s\n%s\n%s\n", getQuestion(), getWrongAnswer2(), getWrongAnswer1(), getCorrectAnswer());
	}

}
