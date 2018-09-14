package com.whatu1.sb.dao;

import java.util.List;

import org.springframework.data.repository.RepositoryDefinition;

import com.whatu1.sb.entity.Demo;

@RepositoryDefinition(domainClass = Demo.class, idClass = Integer.class)
public interface DemoDao {

	public List<Demo> findAllByOrderByIdDesc();
}
