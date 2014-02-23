package com.sromku.simple.fb.entities;

import android.os.Bundle;

import com.sromku.simple.fb.Permission;
import com.sromku.simple.fb.utils.GraphPath;

public class Score implements Publishable {

	private final int mScore;

	public Score(int score) {
		mScore = score;
	}

	public int getScore() {
		return mScore;
	}

	@Override
	public Bundle getBundle() {
		Bundle bundle = new Bundle();
		bundle.putInt("score", mScore);
		return bundle;
	}

	@Override
	public String getPath() {
		return GraphPath.SCORES;
	}

	@Override
	public Permission getPermission() {
		return Permission.PUBLISH_ACTION;
	}

}
