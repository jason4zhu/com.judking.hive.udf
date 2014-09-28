package com.judking.hive.udf;

import java.net.URL;

import org.apache.hadoop.hive.ql.exec.UDF;

import com.google.common.net.InternetDomainName;

public class GetTopLevelDomainName extends UDF {
	
	public String evaluate(String url) {
		try	{
			String domain = (new URL(url)).getHost();
			String topLevelDomain = InternetDomainName.from(domain).topPrivateDomain().name();
			return topLevelDomain;
		}catch(Exception e)	{
			return "";
		}
	}
}
