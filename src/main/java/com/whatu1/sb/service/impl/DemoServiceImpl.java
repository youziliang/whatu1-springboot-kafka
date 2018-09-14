package com.whatu1.sb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whatu1.sb.dao.DemoDao;
import com.whatu1.sb.entity.Demo;
import com.whatu1.sb.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	protected DemoDao demoDao;

	@Override
	public List<Demo> getDemos() {
		return demoDao.findAllByOrderByIdDesc();
	}

}
