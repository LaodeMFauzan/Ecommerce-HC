package com.hc.demo.repository;

import com.hc.demo.model.ModuleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository<ModuleModel,Long> {
//    Optional<List<ModuleModel>> findByUsers(Long userId);
}
