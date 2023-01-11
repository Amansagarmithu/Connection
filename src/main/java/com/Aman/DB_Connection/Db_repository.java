package com.Aman.DB_Connection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Db_repository extends JpaRepository<book,Integer> {
}
