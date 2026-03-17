package com.vfilgueiras.GerenciadordeTasks.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vfilgueiras.GerenciadordeTasks.domain.entity.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, String>{}
