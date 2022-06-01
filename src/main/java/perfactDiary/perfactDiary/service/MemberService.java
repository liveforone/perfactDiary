package perfactDiary.perfactDiary.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import perfactDiary.perfactDiary.dto.MemberDto;
import perfactDiary.perfactDiary.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public Long saveMember(MemberDto memberDto) {
        return memberRepository.save(memberDto.toEntity()).getId();
    }
}
