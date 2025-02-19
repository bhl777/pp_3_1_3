package spb.alex.security_3_1_3.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import spb.alex.security_3_1_3.model.Role;

import java.util.Set;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findRoleById(Long id);

    //Set<Role> findRoleById(Long id, Pageable pageable);
}
