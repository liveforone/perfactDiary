package perfactDiary.perfactDiary.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import perfactDiary.perfactDiary.domain.Member;

@Data
@NoArgsConstructor
public class MemberDto {

    private Long id;
    private String name;
    private String email;
    private String password;

    public Member toEntity() {
        Member build = Member.builder()
                .id(id)
                .name(name)
                .email(email)
                .password(password)
                .build();
        return build;
    }
}
