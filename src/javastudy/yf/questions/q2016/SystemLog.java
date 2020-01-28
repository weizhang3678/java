package javastudy.yf.questions.q2016;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 28, 2020 8:59:53 AM
 * 
 * 2016 AP® COMPUTER SCIENCE A FREE-RESPONSE QUESTIONS 2
 * 
 */

public class SystemLog {
	/**
	 * Contains all the entries in this system log. Guaranteed not to be null and to
	 * contain only non-null entries.
	 */
	private List<LogMessage> messageList;
	
	public SystemLog(List<LogMessage> messageList) {
		this.messageList = messageList;
	}

	/**
	 * * * Removes from the system log all entries whose descriptions properly
	 * contain keyword, and returns a list (possibly empty) containing the removed
	 * entries. Postcondition: - Entries in the returned list properly contain
	 * keyword and are in the order in which they appeared in the system log. - The
	 * remaining entries in the system log do not properly contain keyword and * are
	 * in their original order. - The returned list is empty if no messages properly
	 * contain keyword.
	 */
	public List<LogMessage> removeMessages(String keyword) {
		List<LogMessage> returnList = new ArrayList<LogMessage>();
		for (LogMessage lm : messageList) {
			if (lm.containsWord(keyword)) {
				returnList.add(lm);
			}
		}
		messageList.removeAll(returnList);
		return returnList;
	}

	/* error example 1: wrong iteration times*/
	public List<LogMessage> removeMessages1(String keyword) {
		List<LogMessage> removals = new ArrayList<LogMessage>();
		for (int i = 0; i < messageList.size(); i++) {
			if (messageList.get(i).containsWord(keyword)) {
				removals.add(messageList.remove(i));
			}
		}
		return removals;
	}
	
	/* error example 2: ConcurrentException */
	public List<LogMessage> removeMessages2(String keyword) {
		List<LogMessage> removals = new ArrayList<LogMessage>();
		for (LogMessage lm : messageList) {
			if (lm.containsWord(keyword)) {
				messageList.remove(lm);
				removals.add(lm);
			}
		}
		return removals;
	}
	
	public static void main(String[] args) {
		LogMessage lm1 = new LogMessage("CLIENT3:security alert – repeated login failures");
		LogMessage lm2 = new LogMessage("Webserver:disk offline");
		LogMessage lm3 = new LogMessage("SERVER1:file not found");
		LogMessage lm4 = new LogMessage("SERVER2:read error on disk DSK1");
		LogMessage lm5 = new LogMessage("SERVER1:write error on disk DSK2");
		LogMessage lm6 = new LogMessage("Webserver:error on /dev/disk");
		List<LogMessage> list = new ArrayList<LogMessage>();
		list.add(lm1);
		list.add(lm2);
		list.add(lm3);
		list.add(lm4);
		list.add(lm5);
		list.add(lm6);
		SystemLog sl = new SystemLog(list);
		sl.removeMessages2("disk");
	}
}
