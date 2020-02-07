package javastudy.yf.questions.q2015;

import java.util.List;

/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Feb 6, 2020 10:32:24 AM
* 
* 2015 AP® COMPUTER SCIENCE A FREE-RESPONSE QUESTIONS 4
* 
*/
public class MultipleGroups {
	private List<NumberGroup> groupList;
	
	public boolean contains(int number) {
		for(NumberGroup numberGroup : groupList) {
			if(numberGroup.contains(number)) {
				return true;
			}
		}
		return false;
	}

}
