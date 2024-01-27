package questions;

import general.Question;

/**
 * One of the specified questions
 * @author sparkhound
 * 2023-05-18
 */
public class Question1 implements Question {

	private String question = "Warm-up: what is Java?";
	private String wrongAnswer1 = "1. It simply means that you are typing on the command line / terminal, i.e. you are 'javaing'";
	private String wrongAnswer2 = "2. A rare flower that only grows in northern Sweden";
	private String correctAnswer = "3. A programming language";
	private int correctAnswerInt = 3;

	/**
	 * The constructor
	 */
	public Question1() {

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
		return String.format("%s\n%s\n%s\n%s\n", getQuestion(), getWrongAnswer1(), getWrongAnswer2(), getCorrectAnswer());
	}	

}
