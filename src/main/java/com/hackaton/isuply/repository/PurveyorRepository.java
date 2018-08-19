package com.hackaton.isuply.repository;

import com.hackaton.isuply.model.Purveyor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PurveyorRepository extends JpaRepository<Purveyor, Long> {

}
