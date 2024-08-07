package com.examples.demo.repository;

import com.examples.demo.model.Org;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrgRepo extends JpaRepository<Org, Long> {
}
