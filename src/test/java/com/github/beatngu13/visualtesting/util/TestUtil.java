package com.github.beatngu13.visualtesting.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestUtil {

	private TestUtil() {
	}

	public static String getName(final WebDriver driver) {
		final var capabilities = ((RemoteWebDriver) driver).getCapabilities();
		return capabilities.getBrowserName().toLowerCase();
	}

}