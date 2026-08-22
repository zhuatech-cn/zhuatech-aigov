/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.aigov.repository; import cn.zhuatech.aigov.model.ResourceRegister; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface ResourceRegisterRepository extends JpaRepository<ResourceRegister,Long>{List<ResourceRegister> findAllByOrderByCodeAsc();long countByStatus(ResourceRegister.Status status);}
