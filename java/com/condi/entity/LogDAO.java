package com.condi.entity;

import java.util.List;

public interface LogDAO {
	public List<Log> getLogs();

	public void SaveLog(Log thelog);
}
