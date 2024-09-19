package fortune;

import java.util.Random;

public class fortune {

	public static void main(String[] args) {
		Random random = new Random();
		
		String[] fortunes = {
				"Hidden in a valley beside an open stream- This will be the type of place where you will find your dream.",
				"You cannot love life until you live the life you love.",
				"The greatest love is self-love.",
				"Your ability for accomplishment will follow with success.",
				"A smile is your passport into the hearts of others.",
				"It is now, and in this world, that we must live.",
				"Nothing astonishes men so much as common sense and plain dealing.",
				"You are very talented in many ways.",
				"If you feel you are right, stand firmly by your convictions.",
				"Fortune favors the brave.",
				"You will live long enough to open many fortune cookies.",
				"Land is always on the mind of a flying bird."
		};
		
		System.out.println("\t\tFortune Cookie Generator\t\t\n");
		System.out.println(fortunes[random.nextInt(fortunes.length)]);

	}

}
