package study.kksc.domain.member;

import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void join(Member member) {
        memberRepository.save(member);
    }

    public void signOut() {
        return;
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
