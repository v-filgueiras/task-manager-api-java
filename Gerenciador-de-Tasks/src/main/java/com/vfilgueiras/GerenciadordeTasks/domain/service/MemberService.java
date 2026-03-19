package com.vfilgueiras.GerenciadordeTasks.domain.service;

import org.springframework.stereotype.Service;

import com.vfilgueiras.GerenciadordeTasks.domain.entity.MemberEntity;
import com.vfilgueiras.GerenciadordeTasks.domain.repository.MemberRepository;
import com.vfilgueiras.GerenciadordeTasks.infrastructure.dto.MemberDataDTO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    
    public MemberEntity createMember(MemberDataDTO memberDTO) {
        MemberEntity newMember = MemberEntity
        .builder()
        .secret(memberDTO.getSecret())
        .name(memberDTO.getName())
        .email(memberDTO.getEmail())
        .build();

        memberRepository.save(newMember);

        return newMember;
    }

    public MemberEntity getMemberByID(String memberID) {
        return memberRepository
            .findById(memberID)
            .orElseThrow(() -> new RuntimeException("Membro nao identificado."));
    }

}
