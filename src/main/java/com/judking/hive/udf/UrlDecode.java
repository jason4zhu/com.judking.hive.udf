package com.judking.hive.udf;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;

import org.apache.commons.lang3.CharEncoding;
import org.apache.commons.lang3.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

public class UrlDecode extends UDF {
	
	public String evaluate(String url) {
		try {
			return URLDecoder.decode(url, CharEncoding.UTF_8);
		} catch (Exception e) {
			return "";
		}
	}
}
