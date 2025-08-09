package com.BrainrotWebApp.BrainRotBackend.Repositories;

import com.BrainrotWebApp.BrainRotBackend.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
}
