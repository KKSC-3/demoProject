package study.kksc.domain.member;

import lombok.Data;

@Data
public class MemberUpdateDto {
    private String password;
    private String email;
    private String address;
    private Long id;
    private String phoneNum;

}
