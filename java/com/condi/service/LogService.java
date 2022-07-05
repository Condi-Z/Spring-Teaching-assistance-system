package com.condi.service;

import java.util.List;

import com.condi.entity.Log;

public interface LogService {
	public List<Log> getLogs();

	public void SaveLogs(Log thelog);
}
