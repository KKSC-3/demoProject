package study.kksc.domain.member;

import lombok.Data;

@Data
public class MemberRequestDto {

    private Long id;
    private String email;
    private String password;
    private String cPassword;

    public Member toEntity() {
        return new Member(id, email, password);
    }
}
