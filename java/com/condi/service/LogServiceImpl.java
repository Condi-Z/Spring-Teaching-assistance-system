package com.condi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.condi.entity.Log;
import com.condi.entity.LogDAO;

@Service
public class LogServiceImpl implements LogService {

	@Autowired
	@Qualifier("logDAOImpl")
	private LogDAO logdao;
	
	@Override
	@Transactional
	public List<Log> getLogs() {
		
		return logdao.getLogs();
	}

	@Override
	@Transactional
	public void SaveLogs(Log thelog) {
		logdao.SaveLog(thelog);
		
	}

}
