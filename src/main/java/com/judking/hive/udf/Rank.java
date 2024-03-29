package com.judking.hive.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

public final class Rank extends UDF {
	private long counter;
	private String last_key;

	public long evaluate(final String key) {
		if (!key.equalsIgnoreCase(this.last_key)) {
			this.counter = 0;
			this.last_key = key;
		}
		return this.counter++;
	}
}