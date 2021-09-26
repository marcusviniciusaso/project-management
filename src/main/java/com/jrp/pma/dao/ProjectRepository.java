package com.jrp.pma.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jrp.pma.dto.ChartData;
import com.jrp.pma.entities.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {
	
	@Override
	public List<Project> findAll();
	
	@Query(nativeQuery=true, value="SELECT P.STAGE AS label, COUNT(P.STAGE) AS value "
			+ "FROM PROJECT P "
			+ "GROUP BY P.STAGE")
	public List<ChartData> getProjectStatus();
}
