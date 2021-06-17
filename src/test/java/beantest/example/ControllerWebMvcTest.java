package beantest.example;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.springmvc.v3.SpringMemberControllerV3;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestConstructor;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.asyncDispatch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@ContextConfiguration(classes = {SpringMemberControllerV3.class})
@WebMvcTest(SpringMemberControllerV3.class)
public class ControllerWebMvcTest {
    @Autowired
    private MockMvc mvc;
    @MockBean
    private MemberRepository memberRepository;

    @Test
    void webMvcTest() throws Exception {
        // given
        Member member = new Member("pomo", 200);

        // when
        given(memberRepository.save(member)).willReturn(member);

        // then
        mvc.perform(
                post("/springmvc/v3/members/test/save")
                        .param("username", member.getUsername())
                        .param("age", String.valueOf(member.getAge())))
                .andExpect(jsonPath("@.username").value(member.getUsername()));
    }
}
