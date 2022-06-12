package perfactDiary.perfactDiary.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import perfactDiary.perfactDiary.domain.Member;
import perfactDiary.perfactDiary.dto.MemberDto;
import perfactDiary.perfactDiary.repository.MemberRepository;
import perfactDiary.perfactDiary.service.MemberService;
import perfactDiary.perfactDiary.session.LoginService;
import perfactDiary.perfactDiary.session.SessionConst;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private final MemberService memberService;
    private final LoginService loginService;
    private final MemberRepository memberRepository;

    @GetMapping("/signup")
    public String signupPage() {
        return "board/signup.html";
    }


    @PostMapping("/signup")
    public String signup(@RequestParam("name") String name,
                         @RequestParam("email") String email,
                         @RequestParam("password") String password,
                         MemberDto memberDto) {
        memberDto.setName(name);
        memberDto.setEmail(email);
        memberDto.setPassword(password);
        memberService.saveMember(memberDto);
        log.info("회원 가입 성공!!");
        return "board/login.html";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "board/login.html";
    }

    /*
    findByEmail 로 아이디 불러와서 pw 맞는지 벨리데이션해야함
     */
    @PostMapping("/login")
    public String login(
            @Validated MemberDto memberDto,
            BindingResult bindingResult,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            HttpServletRequest request
            ) {
        Member loginMember = loginService.login(email, password);

        if(loginMember == null) {
            bindingResult.reject("loginFail", "아이디 비밀번호가 잘못됬습니다.");
        }

        HttpSession session = request.getSession();
        session.setAttribute(SessionConst.LOGIN_MEMBER, loginMember);
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logoutPage() {
        return "board/logout.html";
    }

    @PostMapping("/logout")
    public String logout(HttpServletRequest request) {
        log.info("로그아웃");
        HttpSession session = request.getSession();
        session.invalidate();

        return "redirect:/";
    }

}
