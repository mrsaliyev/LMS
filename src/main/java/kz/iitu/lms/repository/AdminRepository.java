package kz.iitu.lms.repository;

import kz.iitu.lms.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    List<Admin> getAdminBy();
    boolean existsAdminByUsernameAndPassword(String username, String password);
}
