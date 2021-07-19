package com.example.cubGetUserDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.cubGetUserDetails.entity.Audit;


@Repository
public interface AuditRepository extends JpaRepository<Audit, Integer>{

}
