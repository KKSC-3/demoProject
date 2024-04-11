package study.kksc.domain.member;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Test
    void save_member_success() throws Exception {
        //given
        Member member = new Member(1L, "ww@mail", "1234");

        //when
        memberService.join(member);
        String email = memberService.getMember(1L).getEmail();

        //then
        assertEquals(member.getEmail(), email);
    }
}