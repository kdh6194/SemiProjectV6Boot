package honeybee.springboot.semiprojectv6boot.dao;

import honeybee.project.semiprojectv5.model.Member;

public interface MemberDAO {

    int selectLogin(Member m);
}
