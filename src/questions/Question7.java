package questions;

import general.Question;

/**
 * One of the specified questions
 * @author sparkhound
 * 2023-05-18
 **/
public class Question7 implements Question {

	private String question = "Can abstract classes and interfaces be instantiated as objects?";
	private String wrongAnswer2 = "1. Yes they can, and they must be";
	private String correctAnswer = "2. They definitely can, but in some cases it's unnessecary"; 
	private String wrongAnswer1 = "3. Answer is no, but thanks for asking"; 
	private int correctAnswerInt = 3;

	/**
	 * The constructor
	 */
	public Question7() {

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
		return String.format("%s\n%s\n%s\n%s\n", getQuestion(), getWrongAnswer2(), getCorrectAnswer(), getWrongAnswer1());
	}

}
