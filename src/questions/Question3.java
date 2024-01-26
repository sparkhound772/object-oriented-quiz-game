package questions;

import general.Question;

/**
 * One of the specified questions
 * @author sparkhound
 * 2023-05-18
 **/
public class Question3 implements Question {

	private String question = "What is dynamic dispatch / dynamic binding / late binding?";
	private String wrongAnswer1 = "1. When instead of patching a program, you unpatch some part of it to make it more dynamic";
	private String correctAnswer = "2. When the type of an object (and thus which implementation of a method to call) is decided at runtime";
	private String wrongAnswer2 = "3. A concept that was used in early computer science but has proven to be invalid";
	private int correctAnswerInt = 2;

	/**
	 * The constructor
	 */
	public Question3() {

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
		return String.format("%s\n%s\n%s\n%s\n", getQuestion(), getWrongAnswer1(), getCorrectAnswer(), getWrongAnswer2());
	}

}
