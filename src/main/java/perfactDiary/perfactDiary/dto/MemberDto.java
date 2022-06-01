package perfactDiary.perfactDiary.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberDto {

    private Long id;
    private String name;
    private String email;
    private String password;
}
