package com.example.myfitnessjourney.Controller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.TextView;

public class HomeInfoFragment extends Fragment {
	TextView mWelcomeText;
	String loginid;
	
	
	public static HomeInfoFragment newInstance (String login_id) {
		Bundle args = new Bundle();
		args.putString("login_id", login_id);
		
		HomeInfoFragment fragment = new HomeInfoFragment();
		fragment.setArguments(args);
		
		return fragment;
	}
	
	
	@Override
	public void onResume() {
		super.onResume();
	}
	
	@Override 
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		 loginid = (String)getArguments().getString("login_id");
		 
		 
		
		//Do something
	}
	
	public View onCreateView (LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
		super.onCreateView(inflater, parent, savedInstanceState);
		
		View v = inflater.inflate(R.layout.fragment_home_info, parent, false);
		
		mWelcomeText = (TextView) v.findViewById(R.id.welcome_text);
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Welcome ");
		stringBuilder.append(loginid);
		
		String welcome_text = stringBuilder.toString();
		mWelcomeText.setText(welcome_text);
		
		return v;
		
	}


}
