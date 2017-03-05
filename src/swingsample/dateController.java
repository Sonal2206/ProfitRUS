package swingsample;

import java.awt.event.ContainerListener;

/**
 * A class for getting the date range chosen from user 
 * 
 * @author Freyja Jokulsdottir
 * @since 20.02.2017
 * @version 1.0
 */
public class dateController {	
	
	/**
	 * A method to get info from user input through stockAnalyzer view.
	 */
	public void getDates() {
		ContainerListener[] date;
		int numDays;
		stockAnalyzer sa = new stockAnalyzer();
		
		date = sa.getDate();
		numDays = sa.getNumDays();
	}

}
