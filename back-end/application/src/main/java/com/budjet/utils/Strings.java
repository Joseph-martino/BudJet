package com.budjet.utils;

import org.apache.commons.lang3.StringUtils;

public class Strings {
	public static boolean isEmptyOrBlank(String string) {
		return StringUtils.isEmpty(string) && StringUtils.isBlank(string);
	}

}
