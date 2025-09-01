package hello.servlet.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void 회원저장() {
        //given
        Member member = new Member("SEO",30);

        //when
        Member saveMember = memberRepository.save(member);

        //then
        Member findMember = memberRepository.findById(saveMember.getId());
        assertThat(findMember).isEqualTo(saveMember);
    }

    @Test
    void 모든_회원_조회() {
        //given
        Member member1 = new Member("SEO",30);
        Member member2 = new Member("KIM",32);

        memberRepository.save(member1);
        memberRepository.save(member2);

        //when
        List<Member> findMembers = memberRepository.findAll();

        //then
        assertThat(2).isEqualTo(findMembers.size());
        assertThat(findMembers).contains(member1, member2);
    }


}