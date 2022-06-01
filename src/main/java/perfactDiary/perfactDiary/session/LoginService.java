package perfactDiary.perfactDiary.session;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import perfactDiary.perfactDiary.domain.Member;
import perfactDiary.perfactDiary.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository memberRepository;

    public Member login(String email, String password) {
        return memberRepository.findByEmail(email)
                .filter(m -> m.getPassword().equals(password))
                .orElse(null);
    }
}
