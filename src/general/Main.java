package general;

import questions.*;
import java.util.ArrayList;

/**
 * Ett spel som ställer ett antal frågor, kontrollerar svaren från användaren, och 
 * kontinuerligt rapporterar huruvida denna svarar rätt eller fler samt poängställningen.
 *
 * Använt mina gamla inlämnade programmeringsuppgifter som stöd samt
 * Deitel, P., Deitel, H. (2020). Java, How to program, Late objects. 11th edition. Pearson. 
 * som jag använt i en annan Javakurs.
 * I synnerhet "Payroll system"-exemplet som utvecklas i kapitel 10, 
 * för att få till det med relationen och polymorfismen mellan Question 
 * och dess implementerande klasser. 
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
