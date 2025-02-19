package spb.alex.security_3_1_3.service;

import spb.alex.security_3_1_3.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {

    Role findRoleById(Long id);

    List<Role> getAllRoles();

    Set<Role> findRolesByIds(Set<Long> roleIds);
}
