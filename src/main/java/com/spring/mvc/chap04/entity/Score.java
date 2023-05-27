package com.spring.mvc.chap04.entity;

import lombok.*;

@Setter @Getter @ToString @NoArgsConstructor //기본생성자
@AllArgsConstructor // 모든 요소 다 요구하는 생성자
public class Score { // Score 객체를 생성해서 그 안에 값을 저장하는 것. 3명이라면 Score 객체 3개 생성.
    private String name; // 학생 이름
    private int korScore; // 국어 성적
    private int engScore; // 영어 성적
    private int mathScore; // 수학 성적

    private int studentNumber; // 학번
    private int total; // 총점
    private double average; // 평균
}
    // 직렬화 :