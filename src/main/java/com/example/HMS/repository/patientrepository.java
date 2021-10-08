package com.example.HMS.repository;
import com.example.HMS.entity.History;
import com.example.HMS.entity.Referred;
import com.example.HMS.entity.patient;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface patientrepository extends CrudRepository<patient, Integer> {
    @Modifying
    @Transactional
    @Query(value="DELETE FROM patient p where p.opd_num = :opd_num",nativeQuery=true)
    void deleteByOpd_num(@Param("opd_num")int opd_num);



   @Query(value="select * from patient p where p.opd_num = :opd_num",nativeQuery=true)
   patient findByOpd_num(@Param("opd_num")int opd_num);



   /* Optional<Referred> findById(long id);

    List<patient>  getAllPatient();*/
}
