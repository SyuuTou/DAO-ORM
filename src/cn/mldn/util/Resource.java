package cn.mldn.util;

import java.util.ResourceBundle;

public class Resource {
	private Resource() {
	}
	public static String getId(String className) {
		return ResourceBundle.getBundle("Primary").getString(className);
	}
}
