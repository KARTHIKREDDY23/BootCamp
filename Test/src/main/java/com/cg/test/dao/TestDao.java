package com.cg.test.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.test.dto.Test;

@Repository //indicating that TestDao is a repository
public interface TestDao extends JpaRepository<Test, Integer> //performing CRUD operations on Test
{

}
