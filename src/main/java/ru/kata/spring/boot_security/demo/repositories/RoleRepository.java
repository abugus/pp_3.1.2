package ru.kata.spring.boot_security.demo.repositories;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;
import java.util.Optional;

public interface RoleRepository {
    Role findByName(String name);

    void saveRole(Role role);

    List<Role> findAll();

    Optional<Role> findRoleById(long id);

    void updateRole(Role updatedRole);

    void deleteRole(long id);
}
