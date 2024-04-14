package study.kksc.domain.member;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
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

    public void updateInfo() {
        return;
    }

    public Member getMember(Long id) {
        return memberRepository.findById(id).get();
    }
}
