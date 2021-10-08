package com.example.HMS.repository;

import com.example.HMS.entity.History;
import com.example.HMS.entity.Investigation;
import com.example.HMS.entity.Referred;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
//import java.util.Optional;


@Repository
public interface ReferredRepository extends CrudRepository<Referred, Long> {
    @Modifying
    @Transactional
    @Query(value="DELETE FROM referred p where p.id = :id",nativeQuery=true)
    void deleteByreferredid(@Param("id")long id);


    @Query(value="select * from referred p where p.id = :id",nativeQuery=true)
    Referred findByreferredid(@Param("id")long id);
}
