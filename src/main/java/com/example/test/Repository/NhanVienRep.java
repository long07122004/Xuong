package com.example.test.Repository;
import com.example.test.Model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;
public interface NhanVienRep extends JpaRepository<NhanVien, UUID>{
    boolean existsByAccountFE(String accountFE);

    boolean existsByAccountFPT(String accountFPT);

    boolean existsByStaffCode(String staffCode);
}
