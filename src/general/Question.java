package general;

/**
 * An interface to be implemented by the specific questions
 *
 * @author sparkhound
 * 2023-05-18
 **/
public interface Question {

	/**
	 * @return the question
	 */
	public abstract String getQuestion();

	/**
	 * @return one of the wrong answers
	 */
	public abstract String getWrongAnswer1();

	/**
	 * @return one of the wrong answers
	 */
	public abstract String getWrongAnswer2();
	
	/**
	 * @return the correct answer 
	 */
	public abstract String getCorrectAnswer();
	
	/**
	 * @return the integer representing the correct answer 
	 */
	public abstract int getCorrectAnswerInt();

}
