package com.sampleProject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginPageRepository extends JpaRepository<User,Long> {
}
