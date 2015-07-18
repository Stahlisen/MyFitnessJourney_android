package com.example.myfitnessjourney.Controller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {
	
	
	public static HomeFragment newInstance (String login_id) {
		Bundle args = new Bundle();
		args.putString("login_id", login_id);
		
		HomeFragment fragment = new HomeFragment();
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
		
		String loginid = (String)getArguments().getString("login_id");
		
		//Do something
	}
	
	public View onCreateView (LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_home, parent, false);
		
		
		return v;
		
	}


}
