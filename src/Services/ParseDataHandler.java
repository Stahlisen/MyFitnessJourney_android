package Services;

import Model.HomeUserInfo;
import android.util.Log;

import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;


public class ParseDataHandler {
	HomeUserInfo userInfo;
	
	public HomeUserInfo fetchHomeUserInfo() {
		
		ParseQuery<ParseObject> query = ParseQuery.getQuery("Goal");
		query.whereEqualTo("user", ParseUser.getCurrentUser());
		query.getFirstInBackground(new GetCallback<ParseObject>() {

			@Override
			public void done(ParseObject object, ParseException e) {
				// TODO Auto-generated method stub
				if (object == null) {
					
				      Log.d("query", "The getFirst request failed.");
				    } else {
				    	Log.d("query", "success");
				    	String currentweight = object.get("weight").toString();
					      Log.d("queryresult", currentweight);

				    	String goalweight = object.get("weight").toString();
				    	Log.d("queryresult", goalweight);
				    	String goaldate = object.get("goaldate").toString();
				    	Log.d("queryresult", goaldate);
				    	String timeremaining = "1 day";
				      
				      userInfo = new HomeUserInfo(currentweight,
				    		  goalweight,goaldate,timeremaining);
				      
				      
				      
				    }
			}
			
			});
		
		
		return userInfo;
	}

}
