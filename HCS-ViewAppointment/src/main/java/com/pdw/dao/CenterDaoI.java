package com.pdw.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pdw.entity.DiagnosticCenter;
@Repository
public interface CenterDaoI extends JpaRepository<DiagnosticCenter,String> {

}
