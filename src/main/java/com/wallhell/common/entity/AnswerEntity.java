/***********************************************
 * File Name: AnswerEntity
 * @author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 22 11 2019 下午 3:17
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
@Table(name = "answer")
@EntityListeners(AuditingEntityListener.class)
public class AnswerEntity {

    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    @Column(name = "answer_id", unique = true, length = 50)
    private String answerId;

    @Column(name = "answer_content")
    private String answerContent;

    @Column(name = "question_id")
    private String questionId;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"answerId\":\"")
                .append(answerId).append('\"');
        sb.append(",\"answerContent\":\"")
                .append(answerContent).append('\"');
        sb.append(",\"questionId\":\"")
                .append(questionId).append('\"');
        sb.append(",\"createTime\":\"")
                .append(createTime).append('\"');
        sb.append(",\"updateTime\":\"")
                .append(updateTime).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
