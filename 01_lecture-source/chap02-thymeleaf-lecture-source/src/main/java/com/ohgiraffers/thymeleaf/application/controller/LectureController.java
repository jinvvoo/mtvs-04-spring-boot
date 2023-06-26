package com.ohgiraffers.thymeleaf.application.controller;

import com.ohgiraffers.thymeleaf.application.dto.MemberDTO;
import com.ohgiraffers.thymeleaf.application.dto.SelectCriteria;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("lecture")
public class LectureController {

    @GetMapping("expression")
    public ModelAndView expression(ModelAndView mv) {
        //모델엔뷰는 모델과 뷰를 합친거
        //모델은 request, 값을 받을게 있으면 model에 받아줌
        //뷰는 view,

        mv.addObject("hello", "<h3> hello world </h3>");
        mv.addObject("member", new MemberDTO("홍길동", 20, '남', "서울시"));

//        mv.setViewName("resource/templates/lecture/expression.html"); //접두사로 resource/temlplates를 붙여줌 접미사로 .html
        mv.setViewName("lecture/expression");

        return mv;
    }

    @GetMapping("conditional")
    public ModelAndView conditional(ModelAndView mv) {

//        mv.setViewName("/lecture/conditional");
        mv.addObject("num", 1);
        mv.addObject("str", "바나나");

        List<MemberDTO> members = new ArrayList<>();
        members.add(new MemberDTO("홍길동", 20, '남', "서울시 서초구"));
        members.add(new MemberDTO("유관순", 24, '남', "서울시 노원구"));
        members.add(new MemberDTO("장보고", 23, '남', "서울시 서초구"));
        members.add(new MemberDTO("이순신", 22, '남', "서울시 서초구"));

        mv.addObject("members", members);

        return mv;
    }

    @GetMapping("etc")
    public ModelAndView etc(ModelAndView mv) {

        SelectCriteria selectCriteria = new SelectCriteria(1, 10, 3);
        mv.addObject(selectCriteria);

        return mv;
    }
}
