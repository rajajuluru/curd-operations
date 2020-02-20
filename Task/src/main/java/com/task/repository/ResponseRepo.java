package com.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.model.Response;

@Repository
public interface ResponseRepo extends JpaRepository<Response, String> {

}
