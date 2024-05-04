package study.kksc.domain.member;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public boolean login(MemberRequestDto memberDto) throws Exception {
        long id = memberDto.getId();
        String pw = memberDto.getPassword();
        if (!memberRepository.existsById(id)){
            throw new Exception("아이디가 또는 비밀번호가 일치하지 않습니다");

        }
        Member member = memberRepository.findById(id).get();

        if (!pw.equals(member.getPassword())){
            throw new Exception("아이디가 또는 비밀번호가 일치하지 않습니다");
        }

        return true;



    }
    public void join(MemberRequestDto memberDto) throws Exception {
        if (memberRepository.existsById(memberDto.getId())) {
            throw new Exception("사용자가 존재하지 않습니다");
        }

        if (memberDto.getPassword().length() < 4) {
            throw new Exception("비밀번호가 너무 짧습니다");
        }

        memberRepository.save(memberDto.toEntity());
    }

    public void signOut(MemberRequestDto memberDto) throws Exception {
        Member member = memberRepository.findById(memberDto.getId()).orElseThrow(
                () -> new Exception("사용자가 존재하지 않습니다")
        );

        memberRepository.delete(member);
    }

    public void login() {
        return;
    }

    public void updateInfo(MemberUpdateDto memberDto) throws Exception {
        Member member = memberRepository.findById(memberDto.getId()).orElseThrow(
                () -> new Exception("사용자가 존재하지 않습니다")
        );

        member.updatePw(memberDto.getPassword());
        member.updateEmail(memberDto.getEmail());
        member.updatePhonenum(memberDto.getPhoneNum());


    }

    public Member getMember(Long id) {
        return memberRepository.findById(id).get();
    }
}
