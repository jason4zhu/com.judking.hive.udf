package com.judking.hive.udf;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.apache.commons.lang3.CharEncoding;

public class Test {
	public static void main(String[] args)	{
		String url = "http%3A%2F%2Fc1.kgimg.com%2Fyzone_songs%2F90%2F20140828%2F20140828181604325327.jpg";
		try {
			url = URLDecoder.decode(url, CharEncoding.UTF_8);
			System.out.println(url);
		} catch (UnsupportedEncodingException e) {
			System.out.println("");
		}
	}
}
