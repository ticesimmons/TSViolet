package Externals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

/**
 * 
 * temporary class for testing the robot class, which mimics peripherals 
 * 
 * 
 * @author SimmonsTice
 *
 */
public class workingWithRobot {
	
	public static final int SLEEP_TIME = 10;
	
	public static void sleep() throws InterruptedException {
		Thread.sleep(SLEEP_TIME);
	}
	
	//private static void revise(String )
	
	private static void del(int numDel, Robot rob) {
		for (int i = 0; i < numDel; i++) {
			rob.keyPress(KeyEvent.VK_BACK_SPACE);

		}
		rob.keyRelease(KeyEvent.VK_DELETE);
	}
	
	private static void spell(String word, Robot rob) throws InterruptedException {
		
		for (int i = 0; i < word.length(); i++) {
			
			String letter = String.valueOf(word.charAt(i));
			
			switch (letter.toLowerCase()) {
			
			case "a":
				if (letter.equals("a")) {
					rob.keyPress(KeyEvent.VK_A);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_A);
				}
				break;
			case "b":
				if (letter.equals("b")) {
					rob.keyPress(KeyEvent.VK_B);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_B);
				}
				break;
			case "c":
				if (letter.equals("c")) {
					rob.keyPress(KeyEvent.VK_C);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_C);
				}
				break;
			case "d":
				if (letter.equals("d")) {
					rob.keyPress(KeyEvent.VK_D);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_D);
				}
				break;
			case "e":
				if (letter.equals("e")) {
					rob.keyPress(KeyEvent.VK_E);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_E);
				}
				break;
			case "f":
				if (letter.equals("f")) {
					rob.keyPress(KeyEvent.VK_F);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_F);
				}
				break;
			case "g":
				if (letter.equals("g")) {
					rob.keyPress(KeyEvent.VK_G);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_G);
				}
				break;
			case "h":
				if (letter.equals("h")) {
					rob.keyPress(KeyEvent.VK_H);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_H);
				}
				break;
			case "i":
				if (letter.equals("i")) {
					rob.keyPress(KeyEvent.VK_I);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_I);
				}
				break;
			case "j":
				if (letter.equals("j")) {
					rob.keyPress(KeyEvent.VK_J);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_J);
				}
				break;
			case "k":
				if (letter.equals("k")) {
					rob.keyPress(KeyEvent.VK_K);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_K);
				}
				break;
			case "l":
				if (letter.equals("l")) {
					rob.keyPress(KeyEvent.VK_L);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_L);
				}
				break;
			case "m":
				if (letter.equals("m")) {
					rob.keyPress(KeyEvent.VK_M);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_M);
				}
				break;
			case "n":
				if (letter.equals("n")) {
					rob.keyPress(KeyEvent.VK_N);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_N);
				}
				break;
			case "o":
				if (letter.equals("o")) {
					rob.keyPress(KeyEvent.VK_O);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_O);
				}
				break;
			case "p":
				if (letter.equals("p")) {
					rob.keyPress(KeyEvent.VK_P);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_P);
				}
				break;
			case "q":
				if (letter.equals("q")) {
					rob.keyPress(KeyEvent.VK_Q);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_Q);
				}
				break;
			case "r":
				if (letter.equals("r")) {
					rob.keyPress(KeyEvent.VK_R);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_R);
				}
				break;
			case "s":
				if (letter.equals("s")) {
					rob.keyPress(KeyEvent.VK_S);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_S);
				}
				break;
			case "t":
				if (letter.equals("t")) {
					rob.keyPress(KeyEvent.VK_T);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_T);
				}
				break;
			case "u":
				if (letter.equals("u")) {
					rob.keyPress(KeyEvent.VK_U);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_U);
				}
				break;
			case "v":
				if (letter.equals("v")) {
					rob.keyPress(KeyEvent.VK_V);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_V);
				}
				break;
			case "w":
				if (letter.equals("w")) {
					rob.keyPress(KeyEvent.VK_W);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_W);
				}
				break;
			case "x":
				if (letter.equals("x")) {
					rob.keyPress(KeyEvent.VK_X);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_X);
				}
				break;
			case "y":
				if (letter.equals("y")) {
					rob.keyPress(KeyEvent.VK_Y);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_Y);
				}
				break;
			case "z":
				if (letter.equals("z")) {
					rob.keyPress(KeyEvent.VK_Z);
				} else {
					rob.keyPress(KeyEvent.VK_SHIFT);
					rob.keyPress(KeyEvent.VK_Z);
				}
				break;
			case " ":
					rob.keyPress(KeyEvent.VK_SPACE);
					break;
				 
			default:
				break;
			}
			
			rob.keyRelease(KeyEvent.VK_SHIFT);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}
	
	    public static void main(String[] args) throws IOException, AWTException, InterruptedException {
	    	Robot robot = new Robot();
	        robot.setAutoDelay(SLEEP_TIME);
	    	
	    	String command = "notepad.exe";
	        Runtime run = Runtime.getRuntime();
	        // idk what the non-depreciated version of this is so i'm going with it i guess...
	        run.exec(command);
	        try {
	            Thread.sleep(2000);
	        }
	        catch (InterruptedException e)
	        {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	 	       	
	        spell("AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz", robot);
	        spell("Spa ae", robot);
	        robot.setAutoDelay(150);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        del(8, robot);
	        spell("Space", robot);
	    }
	}
