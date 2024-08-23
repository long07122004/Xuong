package com.example.test.Repository;
import com.example.test.Model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;
public interface  StaffRepo extends JpaRepository<Staff, UUID>{
    boolean existsByAccountFE(String accountFE);

    boolean existsByAccountFPT(String accountFPT);

    boolean existsByStaffCode(String staffCode);
}
