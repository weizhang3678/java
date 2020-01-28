package javastudy.yf.questions.q2016;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 28, 2020 8:25:39 AM
 * 
 * 2016 AP® COMPUTER SCIENCE A FREE-RESPONSE QUESTIONS 2
 * 
 */

public class LogMessage {
	private String machineId;;
	private String description;

	/** Precondition: message is a valid log message. */
	public LogMessage(String message) {
		// split
		String[] str = message.split(":");
		machineId = str[0];
		description = str[1];

		// index
		int colon = message.indexOf(":");
		machineId = message.substring(0, colon);
		description = message.substring(colon + 1);
	}

	/**
	 * Returns true if the description in this log message properly contains
	 * keyword; * false otherwise.
	 */
	public boolean containsWord(String keyword) {
		/* to be implemented in part (b) */
		if (!description.contains(keyword))
			return false;
		if (!(description.indexOf(keyword) == 0 || description.contains(" " + keyword))) {
			return false;
		}
		if (!(description.substring(description.length() - keyword.length()).equals(keyword)
				|| description.contains(keyword + " "))) {
			return false;
		}
		return true;
	}


	public String getMachineId() {
		return machineId;
	}

	public String getDescription() {
		return description;
	}
	// There may be instance variables, constructors, and methods that are not
	// shown.

	public static void main(String[] args) {
		LogMessage lm = new LogMessage("aaa:bbbb");
		
	}

}
