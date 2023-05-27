package com.spring.mvc.controller03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("chap03")
@Controller
public class MCVController03 {

    // 음식 주문용 키오스크를 만들겠습니다.
    // foodform으로 들어가면 주문자명, 주문테이블번호, 주문할 수 있는 음식
    // foodorder로 전송된 데이터는 ModelAndView 방식으로
    // chap03/foodresult.jsp 화면으로 form에서 전달받은 데이터를 전송해
    // 결과화면으로 넘어가고 결과화면에는
    // XX 님의 주문 결과입니다. YY번 테이블에 ZZ 음식을 가져다 드립니다 // 출력

    @RequestMapping("/foodform")
    public String foodform(){
        return "/chap03/foodform";
    }

    @RequestMapping("/foodorder")
    public ModelAndView foodorder(String customerName, int tableNumber, String orderedFood){
        ModelAndView mv = new ModelAndView();

        mv.setViewName("/chap03/foodresult");
        mv.addObject("cN", customerName);
        mv.addObject("tN", tableNumber);
        mv.addObject("oF",orderedFood);
        return mv;
    }

    @RequestMapping("/naver")
    public String naver(){
        // 리다이렉트는 redirect:보낼주소 형식으로 문자를 작성하면 실행됩니다.
        // 마치 a 태그를 클릭하는 것처럼 자동으로 페이지를 보낼 주소로 이동시킵니다.
        // 이 과정에서 포워딩과는 달리 model.addAttribute()처럼 자료를 첨부해 이동시킬 수는 없습니다.
        // 하지만 get 방식으로 이동하는 만큼 쿼리스트링을 붙여서 보내는 것은 가능합니다.
        return "redirect:https://www.naver.com";
      }

    @RequestMapping("/goFoodform")
    public String goFoodForm(Model model){
        // 리다이렉션은 model.addAttribute()를 통한 데이터 전송이 불가능합니다.
        model.addAttribute("title", "음식 주문 키오스크"); // test라는 이름으로 "test" 문자열 적재
        // http://localhost:8181/chap03/foodform 이라는 주소로 이동(리다이렉트이므로 파일 지정이 아님)
        //return "redirect:/chap03/foodform"; // 목적 파일로 포워딩하지 않고 목적 메서드 주소로 리다이렉트 (안 보내짐)
        // /WEB-INF/views/chap03/foodform.jsp라는 목적 파일로 포워딩
        return "/chap03/foodform"; // 목적 파일인 foodform.jsp로 적재 데이터도 보내는 포워딩 방식

    }
    //리다이렉트는 데이터 전달이 불가능한가요?
    // GET 방식은 url에 쿼리스트링을 붙여서 전송하기 때문에
    // 리다이렉트 타겟 URL에 쿼리스트링을 붙여 리다이렉트를 수행하면 전달 가능합니다.
    @RequestMapping("searchform")
    public String searchForm(){
        // WEB-INF/views/chap03/searchform.jsp
        return "/chap03/searchform";
    }

    // 네이버 쿼리를 받아서 리다이렉션 해주는 메서드 세팅
    @RequestMapping("research")
    public String reSearch(String query){ //query라는 변수에 실려서 전송된 데이터 받기
        String resultPage = "redirect:https://search.naver.com/search.naver?query=" + query;
        return resultPage;
    }


}
