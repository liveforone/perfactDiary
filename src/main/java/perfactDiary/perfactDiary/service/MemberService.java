package perfactDiary.perfactDiary.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import perfactDiary.perfactDiary.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;


}
