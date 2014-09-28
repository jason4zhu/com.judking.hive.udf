package com.judking.hive.udf;

import java.net.URL;

import org.apache.commons.lang3.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

public class GetDomainName extends UDF {
	
	public String evaluate(String url) {
		try	{
			//System.out.println("url=["+url+"]");
			String domain = (new URL(url)).getHost();
			//System.out.println("domain=["+domain+"]");
			return domain;
		}catch(Exception e)	{
			//System.out.println("exception=["+e.getMessage()+"]");
			return "";
		}
	}
}
