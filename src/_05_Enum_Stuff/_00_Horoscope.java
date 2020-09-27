package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	 // 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	
	static void metho (Zodiac a ){
		
		switch (a) { 
		case ARIES: {
			System.out.println("sheep");
			break;
		}
		case AQUARIUS: {
			System.out.println("water");
			break;
			}
		case GEMINI: {
			System.out.println("twin(?)");
			break;
			}
		case CANCER: {
			System.out.println("crab");
			break;
			
			}
		case LEO: {
			System.out.println("lion");
			break;
			
			}
		case VIRGO: {
			System.out.println("grass(?)");
			break;
			
			}
		case LIBRA: {
			System.out.println("scale");
			break;
			
			}
		case SCORPIO: {
			System.out.println("scorpion");
			break;
			
			}
		case SAGITTARIUS: {
			System.out.println("horse");
			break;
			
			}
		case CAPRICORN: {
			System.out.println("goat(?)");
			break;
			
			}
		case PISCES: {
			System.out.println("fish");
			break;
			
			}
		case TAURUS: {
			System.out.println("bull");
			break;
			}
		}
		}
		
	// 3. Make a main method to test your method
		public static void main(String[] args) {
			Zodiac n= Zodiac.SAGITTARIUS;
			metho (n);
		}
	
}
