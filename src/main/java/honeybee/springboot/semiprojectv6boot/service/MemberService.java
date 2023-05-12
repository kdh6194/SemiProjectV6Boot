package honeybee.springboot.semiprojectv6boot.service;

import honeybee.project.semiprojectv5.model.Member;

import javax.servlet.http.HttpSession;

public interface MemberService {

    boolean checklogin(Member m, HttpSession sess);
}
