package questions;

import general.Question;

/**
 * One of the specified questions
 * @author sparkhound
 * 2023-05-18
 **/
public class Question2 implements Question {

	private String question = "What does polymorphism mean?";
	private String wrongAnswer1 = "1. It's when you combine many if statements and morph them into a fi-statement";
	private String correctAnswer = "2. It's about how one method call can refer to several different implementations of the method\n   and the version being called depends on the type of the object that's being referred to";
	private String wrongAnswer2 = "3. It's a concept used in biology only and has absolutely nothing to do with programming";
	private int correctAnswerInt = 2;

	/**
	 * The constructor
	 */
	public Question2() {

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
