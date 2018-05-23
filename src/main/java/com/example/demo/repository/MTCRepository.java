package com.example.demo.repository;

import com.example.demo.model.ATCType;
import com.example.demo.model.Mtc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public interface MTCRepository extends JpaRepository<Mtc,Long> {


    @Query("select m from Mtc m where m.atcType = :type")
    List<Mtc> getMtcsByAtcType(@Param("type") ATCType type);
}
