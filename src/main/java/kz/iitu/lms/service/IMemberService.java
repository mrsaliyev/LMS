package kz.iitu.lms.service;

import java.awt.*;
import java.lang.reflect.Member;

public interface IMemberService {
    boolean checkByLoginAndPassword(String login, String password);
    Member getByLogin(String login);
    List<Member> getAll();
    Member saveMember(Member member);
    Member createMember(Member member);
}
