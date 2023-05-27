package com.spring.mvc.controller02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/chap02")
@Controller
public class MVCController02 {

    //localhost:포트번호(현재 8181로 변경)/chap02/hobbies
    @RequestMapping("/hobbies")
    public String hobbies(Model model) { // .jsp로 자바 변수를 보내려면 Model을 선언부에 선언합니다.
        String name = "룰루";

        List<String> hobbies = List.of("밥먹기", "낮잠자기", "쥐잡기"); // List 자료형 생성 및 자료저장. List.of는 List에 빠르게 자료 저장

        // .jsp 파일로 보낼 자료들을 적재
        model.addAttribute("n", name); // "n"에 name 변수를 담아서 목적지(hobbies)에 보내라
        model.addAttribute("hList", hobbies);

        // WEB-INF/views/chap02/hobbies.jsp
        return "/chap02/hobbies";
    }

    // ModelAndView 객체를 사용해 뷰(view) 화면 구성하기
    // /chap02/hobbies2 : GET

    // ModelAndView 방식 컨트롤러 메서드 리턴자료형이 ModelAndView 객체
    @GetMapping("/hobbies2")
    public ModelAndView hobbies2(){ //리턴자료형이 ModelAndView임에 주의!!
        // .jsp파일(view단)으로 보내고 싶은 자료 설정
        String name = "참참이";
        List<String> hList = List.of("전깃줄에서 꾸벅꾸벅 졸기", "쌀주워먹기", "짹짹소리내기");

        // 목적지 뷰 이름 적기(포워딩 방식)
        //          /WEB-INF/views/chap02/hobbies.jsp
        String viewName = "chap02/hobbies"; // 앞에서 썼던 hobbies.jsp에 매칭함. 꼭 jsp랑 1대1 매칭해야 하는 것은 아님

        //ModelAndView 객체에 생성 및 세팅하기
        ModelAndView mv = new ModelAndView();
        // 목적지 뷰 이름 입력
        mv.setViewName(viewName);
        // 목적지로 보낼 데이터 입력
        mv.addObject("n", name);
        mv.addObject("hList", hList);
        // 설정 완료된 ModelAndView 리턴
        return mv;
    }

    @RequestMapping("/hobbies3")
    public String hobbies3(Model model) {
        String name = "lily";
        List<String> hobbies = List.of("드라마 보기", "수영하기", "전시회 가기");

        model.addAttribute("n", name);
        model.addAttribute("hList", hobbies);

        return "/chap02/hobbies";
    }



}
