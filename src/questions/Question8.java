package questions;

import general.Question;

/**
 * One of the specified questions
 * @author sparkhound
 * 2023-05-18
 **/
public class Question8 implements Question {

	private String question = "Last one :p\nHow many biologists is currently visiting the island of Java?";
	private String wrongAnswer2 = "1. Some negative amount";
	private String wrongAnswer1 = "2. It's hard to say and I don't care enough to even try googling it"; 
	private String correctAnswer = "3. None because they have been replaced by programmers using inheritance instead"; 
	private int correctAnswerInt = 2;

	/**
	 * The constructor
	 */
	public Question8() {

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
