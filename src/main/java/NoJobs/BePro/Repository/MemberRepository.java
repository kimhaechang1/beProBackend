package NoJobs.BePro.Repository;
import NoJobs.BePro.Domain.Member;

import java.util.List;
import java.util.Optional;
public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(String id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
    boolean updateToken(Member member,String token);
}
