package com.example.myfitnessjourney.Controller;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class HomeActivity extends ActionBarActivity{


	@Override
	public void onCreate (Bundle savedInstanceState) {

	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_fragment);
	FragmentManager fm = getSupportFragmentManager();
	
	//Add HomeInfoFragment fragment
	Fragment fragment1 = fm.findFragmentById(R.id.fragmentContainer1);
	
	if (fragment1 == null) {
		fragment1 = createFragment(1);
		fm.beginTransaction()
		.add(R.id.fragmentContainer1, fragment1)
		.commit();
	}
	
	Fragment fragment2 = fm.findFragmentById(R.id.fragmentContainer2);
	
	if (fragment2 == null) {
		fragment2 = createFragment(2);
		fm.beginTransaction()
		.add(R.id.fragmentContainer2, fragment2)
		.commit();
	}
	}

	protected Fragment createFragment(int fragmentno) {
		if (fragmentno == 1) {
		// TODO Auto-generated method stub
		String loginid = getIntent().getStringExtra(LoginActivity.LOGIN_ID);
		
		return HomeInfoFragment.newInstance(loginid);
		} else {
			return new HomeListFragment();
		}
	}
}
