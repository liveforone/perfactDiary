package perfactDiary.perfactDiary.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import perfactDiary.perfactDiary.dto.MemberDto;
import perfactDiary.perfactDiary.repository.MemberRepository;
import perfactDiary.perfactDiary.service.MemberService;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

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
    public String login(@RequestParam("email") String email,
                        @RequestParam("password") String password) {

        return "redirect:/";
    }

}
