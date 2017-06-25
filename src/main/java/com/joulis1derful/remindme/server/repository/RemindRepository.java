package com.joulis1derful.remindme.server.repository;

import com.joulis1derful.remindme.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemindRepository extends JpaRepository<Remind, Long> {
}
