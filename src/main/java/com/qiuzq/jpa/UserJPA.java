package com.qiuzq.jpa;

import com.qiuzq.entity.TUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

/**
 * program: springBoot_day01
 * Date: 2018/12/23/023 12:02
 *
 * @author: Mr.Qiu
 * Description: JpaRepository需要泛型接口参数，par1 ：实体，par2：主键类型
 * JpaRepository提供了简单的数据操作接口，JpaSpecificationExecutor 提供了复杂的查询接口
 */
public interface UserJPA extends JpaRepository<TUserEntity, Long>, JpaSpecificationExecutor<TUserEntity>, Serializable {

    /**
     * 本地sql查询id大于4的
     *
     * @param id 主键id
     * @return 返回所有符合预期条件的
     */
    @Query(value = "select * from t_user  where  id>?1", nativeQuery = true)
    List<TUserEntity> nativeQueryAllUser(Long id);

    /**
     * 配合@Modifying使用
     * 则可以完成数据的delete，insert，update
     *
     * @param username 用户名
     * @param password 密码
     */
    @Transactional(rollbackOn = RuntimeException.class)
    @Modifying
    @Query(value = "delete from t_user where username = ?1 and password = ?2 ", nativeQuery = true)
    void deleteQuery(String username, String password);

    @Transactional(rollbackOn = Exception.class)
    @Modifying
    @Query(value = "insert into t_user(username,password) values(?1,?2)", nativeQuery = true)
    void inser(String username, String password);

}
