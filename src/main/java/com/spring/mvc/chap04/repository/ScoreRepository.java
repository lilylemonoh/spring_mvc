package com.spring.mvc.chap04.repository;

import com.spring.mvc.chap04.entity.Score;

import java.util.List;

/*
    역할 명세(추상화)
    1. 전체 성적 조회
    2. 개별 성적 조회
    3. 성적 삭제
    4. 성적 등록
    5.
 */
public interface ScoreRepository {

    // 전체 성적은 어떻게 받아올 것인가?
    // entity 계층에 score라는 정보가 어떻게 구성되는지 먼저 정의하고
    // score 객체에 담아와서 처리
    // 전체 성적 조회
    public List<Score> findAll();

    // 성적 정보 등록
    // 리턴자료는 boolean인데 등록 성공 시 true, 실패 시 false를 리턴
    boolean save(Score score); // 입력할 테이블 정보를 넘겨줘야 함

    //성적 정보 한 개 삭제
    boolean deleteByStudentNumber(int studentNumber);

    //성적 개별 조회
    Score findByStudentNumber(int studentNumber);

}
