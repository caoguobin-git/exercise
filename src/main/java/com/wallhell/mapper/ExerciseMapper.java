/***********************************************
 * File Name: ExerciseMapper
 * @author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 22 11 2019 下午 3:25
 ***********************************************/
package com.wallhell.mapper;

import com.wallhell.common.entity.AnswerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseMapper  extends JpaRepository<AnswerEntity,String> {
}
