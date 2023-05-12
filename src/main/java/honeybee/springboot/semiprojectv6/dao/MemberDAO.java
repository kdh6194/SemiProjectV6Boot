package honeybee.springboot.semiprojectv6.dao;

import honeybee.springboot.semiprojectv6.model.Member;

public interface MemberDAO {

    int selectLogin(Member m);
}
