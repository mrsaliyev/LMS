package kz.iitu.lms.service.impl;

import kz.iitu.lms.model.Member;
import kz.iitu.lms.repository.MemberRepository;
import kz.iitu.lms.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class MemberService implements IMemberService, UserDetailsService {
    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public boolean checkByLoginAndPassword(String login, String password) {
        return memberRepository.existsMemberByLoginAndPassword(login, password);
    }

    @Override
    public Member getByLogin(String login) {
        return memberRepository.getMemberByLogin(login);
    }

    @Override
    public List<Member> getAll() {
        return memberRepository.getMembersBy();
    }

    @Override
    public java.lang.reflect.Member saveMember(java.lang.reflect.Member member) {
        return memberRepository.saveAndFlush(member);
    }

    @Override
    public java.lang.reflect.Member createMember(java.lang.reflect.Member member) {
        member.setPassword(passwordEncoder.encode(member.getPassword()));
        return memberRepository.saveAndFlush(member);
    }


    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Member member = memberRepository.findByLogin(login);

        if (member == null) {
            throw new UsernameNotFoundException("Member by login=" + login + " not found!");
        }
        return member;
    }
}
