package org.com.dateservice.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.com.dateservice.model.TimeAndHitCountModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Kunal Uttarkar
 *
 */
@Controller
public class TimeAndHitCountController {
	private static int hitcount=0;
	
	/** Return an ISO 8601 combined date and time string for current date/time along with 
	 *  number of times the service was called
	 * @return TimeAndHitCountModel
	 */
	@RequestMapping(value="/getTimeAndHitCount",method=RequestMethod.GET)
	public @ResponseBody TimeAndHitCountModel getTimeAndHitCount(){
		System.out.println("Fetch ISO 8601 Format Timestamp");
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		String currentTimestamp = dateFormat.format(date);
		TimeAndHitCountModel timeAndHitCountModel = new TimeAndHitCountModel(currentTimestamp, String.valueOf(++hitcount));
		return timeAndHitCountModel;
	}

}
