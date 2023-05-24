package com.spring.mvc.controller01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 해당 어노테이션이 있어야, 프로젝트의 스프링 코어가 관리하는 컨트롤러가 됨.
public class MVCController01 {

    // 특정 주소로 접속했을 때 처리할 로직을 작성합니다.(get, post 등 어떤 방식으로 받을지 명시하지 않음)
    @RequestMapping("/hello") // localhost:8080이 기본 주소이고, 뒤에 hello가 붙여 접속 시 실행 //hello가 들어오면
    public String hello(){
        System.out.println("/hello 접속 감지!!!!!!!!");
        // 어떤 .jsp 파일과 연동할지 return 구문에 문자열로 파일이름을 적어줌
        // prefix였던 /WEB-INF/views와 suffix였던 .jsp를 앞뒤로 붙여서
        // 최종적으로 열리는 파일은 /WEB-INF/views/hello.jsp
        return "hello"; //hello.jsp가 실행됨
    }

    @RequestMapping("/abc") //localhost:8080/abc를 입력하면
    public String bcd(){
        //def.jsp 출력
        return "def"; // def.jsp 실행
    }

    @RequestMapping("/bye") // localhost:8080이 기본 주소이고, 뒤에 hello가 붙여 접속 시 실행
    public String bye(){
        System.out.println("/bye 접속 감지!!!!!!!!");
        return "bye";
    }

    @GetMapping("/hi")
    public String Hi (){
        return "/hi";
    }

    // html의 get방식 요청만 허용하는 어노테이션
    @GetMapping("/getreq") // localhost:8080/getreq 접속 허용
    public String getReq(){
        System.out.println("get방식 요청을 감지했습니다!");
        return "reqview"; // reqview.jsp 실행
    }

    @PostMapping("/postreq")
    public String getPost(){
        System.out.println("post방식 요청을 감지했습니다!");
        return "reqview";
    }

}
