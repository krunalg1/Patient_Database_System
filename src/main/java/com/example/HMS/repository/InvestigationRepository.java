package com.example.HMS.repository;

import com.example.HMS.entity.Investigation;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
//import java.util.Optional;

@Repository
public interface InvestigationRepository extends CrudRepository<Investigation, Long> {

    @Modifying
    @Transactional
    @Query(value="DELETE FROM investigation p where p.investigationid = :investigationid",nativeQuery=true)
    void deleteByinvestigationid(@Param("investigationid")long investigationid);


    @Query(value="select * from investigation p where p.investigationid = :investigationid",nativeQuery=true)
    Investigation findByinvestigationid(@Param("investigationid")long investigationid);
}
