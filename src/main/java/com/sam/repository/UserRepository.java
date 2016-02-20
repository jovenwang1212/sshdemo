package com.sam.repository;

import com.sam.model.TUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by leo on 20/02/2016.
 */
@Repository
public interface UserRepository extends JpaRepository<TUserEntity,Integer> {

    @Modifying      // 说明该方法是修改操作
    @Transactional  // 说明该方法是事务性操作
    // 定义查询
    // @Param注解用于提取参数
    @Query("update TUserEntity us set us.firstName=:qFirstName, us.lastName=:qLastName, us.password=:qPassword where us.id=:qId")
    public void updateUser(@Param("qFirstName") String firstName, @Param("qLastName") String qLastName,
                           @Param("qPassword") String password, @Param("qId") Integer id);


}
