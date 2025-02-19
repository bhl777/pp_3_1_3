package spb.alex.security_3_1_3.service;

import org.springframework.stereotype.Service;
import spb.alex.security_3_1_3.model.Role;
import spb.alex.security_3_1_3.repository.RoleRepository;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role findRoleById(Long id) {
        return roleRepository.findRoleById(id);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Set<Role> findRolesByIds(Set<Long> roleIds) {

        List<Role> roles = roleRepository.findAllById(roleIds);

        return new HashSet<>(roles);
    }
}
