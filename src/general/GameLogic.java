package general;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * The bulk of the logic for the program.
 * 
 * @author sparkhound 
 * 2023-05-19
 **/
 public class GameLogic {

	private int points, attempts;
	private Scanner input = new Scanner(System.in);
	private String validIntegers = "\nEnter an integer between 1 and 3 (or q to quit) and press return:\n";
	private ArrayList<Question> questions;

	/**
	 * The constructor.
	 * @param questions - the array with the questions to ask
	 */
	public GameLogic(ArrayList<Question> questions) { 
		this.questions = questions; 
		this.points = 0;
		this.attempts = 0;
	 }

	/**
	 * The method that drive the game from start to finish
	 * and call all the other classes and methods. 
	 */
	public void letsPlay() {
		int answer = 0;
		System.out.println(printWelcome());
		for (Question question : questions) {
			System.out.println(question.toString());
			answer = getAnswer(question);
			if (answer == -1) {
				break;
			}
			if (points < questions.size()) {
				System.out.println("Current score: " + points + "\n");	
			}
		}
		if (answer == -1) {
			System.out.println("\nBye bye, welcome back later!");
		} else if (points == questions.size()) {
			ascii();
		} else {
			System.out.println("Those were all of the questions,\nyou didn't get all of them right\nbut why not try again!");
		}
	}

	/**
	 * Responsible for the input from the user and managing faulty input
	 * @param question - the array with the questions
	 * @return answer - the answer from the user
	 */
	private int getAnswer(Question question) {
		int answer = 0;	
		while (attempts < 2) {
			System.out.println("Your answer: ");
			if (input.hasNextInt()) {
				answer = input.nextInt();	
				input.nextLine();
				if (doneWithInput(question, answer)) {
					break;
				}
			} else if (input.next().charAt(0) == '\u0071') {
				answer = -1;
				break;
			} else {
				System.out.println(validIntegers);
				input.nextLine();
			}
		}
		attempts = 0;
		return answer;
	}

	/**
	 * Responsible for further evaluation of the answer from the user
	 * @param question - the question which answer to evaluate the input against 
	 * @param answer - the answer from the user to evaluate
	 * @return done - true if the input is 1, 2, or 3 and is correct  
	 */
	private boolean doneWithInput(Question question, int answer) {
		boolean done = false;
		if (answer == 1 || answer == 2 || answer == 3) {
			if (checkIfcorrect(question, answer)) {
				done = true;
			} else {
				attempts++;
			}
		} else {
			System.out.println(validIntegers);
		}
		return done;
	}

	/**
	 * Checks if the answer from the user is correctAnswer
	 * @param question - the array with the questions
	 * @param answer - the answer from the user
	 */
	private boolean checkIfcorrect(Question question, int answer) {
		boolean correct = false;
		if (answer == question.getCorrectAnswerInt()) {
			System.out.println("\nCorrect!\n");
			correct = true;
			points++;
		} else {
			if (attempts < 1) {
				System.out.println("\nGood attempt but incorrect, try again!\n");
			} else {
				System.out.println("\nSorry but nope, better luck with the next one!\n");
			}
		}
	return correct;
	}

	/**
	 * Creates a string with the welcome text
	 * @return a string with the welcome text
	 */
	private String printWelcome() {
		String border = "#################################";
		String welcome = "*** Welcome to the Java-quiz! ***";
		String info = "This quiz contains " + questions.size() + " questions,\n" + "get all of them right and get\nsome ascii art as reward.";
		String twoAttempts = "You get two attempts for each question.";
		return String.format("\n%s\n%s\n%s\n\n%s\n\n%s\n%s", border, welcome, border, info, twoAttempts, validIntegers);
	}	

/**
 * Prints something nice when all answers are correct
 */
	private void ascii() {
		System.out.println("     Congrats, you got all questions right!");
		System.out.println("             /");
		System.out.println("    _____   /");
		System.out.println("   /     \\");   
		System.out.println("  @| * * |@");
		System.out.println("   \\  u /");
		System.out.println(">--|___|--<");
		System.out.println("   |   |");
		System.out.println("   >   >");
	}
}
