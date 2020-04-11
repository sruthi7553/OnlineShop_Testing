package com.gmail.merikbest2015.ecommerce.repos;

import com.gmail.merikbest2015.ecommerce.domain.Perfume;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PerfumeRepository extends CrudRepository<Perfume, Integer> {
    List<Perfume> findByPerfumer(String perfumer);
    List<Perfume> findById(int id);
    Perfume findPerfumesById(Integer id);
    Perfume getPerfumeById(Integer id); //98
}