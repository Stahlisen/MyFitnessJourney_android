package com.example.myfitnessjourney.Controller;

import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class HomeActivity extends SingleFragmentActivity {


	@Override
	protected Fragment createFragment() {
		// TODO Auto-generated method stub
		String loginid = getIntent().getStringExtra(LoginActivity.LOGIN_ID);
		
		return HomeInfoFragment.newInstance(loginid);
	}
}
