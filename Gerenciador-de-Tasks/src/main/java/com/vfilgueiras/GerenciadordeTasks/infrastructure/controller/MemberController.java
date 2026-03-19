package com.vfilgueiras.GerenciadordeTasks.infrastructure.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vfilgueiras.GerenciadordeTasks.domain.entity.MemberEntity;
import com.vfilgueiras.GerenciadordeTasks.domain.service.MemberService;
import com.vfilgueiras.GerenciadordeTasks.infrastructure.dto.MemberDataDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor

public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<MemberEntity> createMember(@RequestBody MemberDataDTO dataDTO) {
        MemberEntity newMember = memberService.createMember(dataDTO);
        return ResponseEntity.status(201).body(newMember);
    }

    @GetMapping("/{memberID}")
    public ResponseEntity<MemberEntity> getMemberByID(@PathVariable String memberID) {
        MemberEntity dataMember = memberService.getMemberByID(memberID);
        return ResponseEntity.ok(dataMember);
    }
}
