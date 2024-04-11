package study.kksc.domain.member;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String student_id; // 학번

    private String email;
    private String password;

    private String name;
    private Long grade; // 학년
    private Long age;
    private String gender;
    private String addr;
    private String phoneNum;

    private LocalDateTime createdAt;

    public Member(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }
}
