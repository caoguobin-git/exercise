/***********************************************
 * File Name: ExerciseEntity
 * @author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 22 11 2019 下午 2:48
 ***********************************************/

package com.wallhell.common.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "chat_user")
@EntityListeners(AuditingEntityListener.class)
public class ExerciseEntity {

    /**
     * @Id 设置主键
     * @GenericGenerator 设置主键生成策略和方法
     * @GeneratedValue 设置自增值
     */
    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    private String id;

    @Column(name = "username", unique = true, length = 50)
    private String username;

    @Column(name = "password", unique = true, length = 50)
    private String password;

    @Column(name = "salt", unique = true, length = 50)
    private String salt;

    @Column(name = "nick", length = 20)
    private String nick;

    @Column(name="user_icon",length = 200)
    private String userIcon;

    @Column(name = "mobile", length = 20)
    private String mobile;

    /**
     * @CreationTimestamp 设置创建时间
     * @JsonFormat 格式化时间格式，并转换为东八区时间
     */

    @CreationTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @Column(name = "create_time")
    private Timestamp createTime;

    /**
     * @UpdateTimestamp 设置更新时间
     */
    @UpdateTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @Column(name = "update_time")
    private Timestamp updateTime;
}