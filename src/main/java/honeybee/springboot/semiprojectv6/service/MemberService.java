package honeybee.springboot.semiprojectv6.service;

import honeybee.springboot.semiprojectv6.model.Member;

import javax.servlet.http.HttpSession;

public interface MemberService {

    boolean checklogin(Member m, HttpSession sess);
}
