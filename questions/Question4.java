package questions;

import general.Question;

/**
 * One of the specified questions
 * @author sparkhound
 * 2023-05-18
 **/
public class Question4 implements Question {

	private String question = "What is inheritance about?";
	private String wrongAnswer2 = "1. It's mainly  about using programming for studying how characteristics are inherited among animals and humans";
	private String wrongAnswer1 = "2. It's about how techniques used by the earliest programmers was inherited and still is used today";
	private String correctAnswer = "3. It's about how subclasses extend their superclasses, and can either inherit their methods unchanged,\n or override them to make their own implementations of them";
	private int correctAnswerInt = 3;

	/**
	 * The constructor
	 */
	public Question4() {

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
