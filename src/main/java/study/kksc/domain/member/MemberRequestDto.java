package study.kksc.domain.member;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MemberRequestDto {

    private Long id;
    private String email;
    private String password;
    private String cPassword;
    private String student_id;
    private String name;
    private Long grade; // 학년
    private Long age;
    private String gender;
    private String addr;
    private String phoneNum;
    private LocalDateTime createdAt;

    public Member toEntity() {
        return new Member(id, email, password);
    }
}
