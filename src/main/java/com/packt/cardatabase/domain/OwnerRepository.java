package com.packt.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*")
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}