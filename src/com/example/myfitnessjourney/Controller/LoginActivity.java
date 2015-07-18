package com.example.myfitnessjourney.Controller;




import android.support.v7.app.ActionBarActivity;
import android.text.InputFilter.LengthFilter;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends ActionBarActivity {
	EditText mEditEmail, mEditPassword;
	Button mLogin, mFacebookLogin, mGoogleLogin;
	TextView mSignUp;
	public static String LOGIN_ID = "login_id";
	String loginid = "frest460";
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		//Initialize widgets
		mEditEmail = (EditText) findViewById(R.id.email_text);
		mEditPassword = (EditText) findViewById(R.id.password_text);
		mLogin = (Button) findViewById(R.id.login_button);
		mFacebookLogin = (Button) findViewById(R.id.facebook_login);
		mGoogleLogin = (Button) findViewById(R.id.google_login);
		mSignUp = (TextView) findViewById(R.id.signup_text_button);

		//Check for active session before setting content view
		createListeners();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	//Create listeners for widgets
	public void createListeners() {
		
		mFacebookLogin.setOnClickListener( new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent (getBaseContext(), HomeActivity.class);
				i.putExtra(LOGIN_ID, loginid);
				startActivity(i);				
			}
		});
		
		
		
	}
}
