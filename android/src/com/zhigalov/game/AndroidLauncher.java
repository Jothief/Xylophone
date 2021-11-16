package com.zhigalov.game;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		// Для сохранения заряда батареи отключаем асселерометр и компас
		config.useAccelerometer = false;
		config.useCompass = false;
		initialize(new XylophoneMain(), config);
	}
}
