/***********************************************
 * File Name: ExerciseServiceImpl
 * @author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 22 11 2019 下午 3:23
 ***********************************************/

package com.wallhell.serviceImpl;

import com.wallhell.common.entity.AnswerEntity;
import com.wallhell.mapper.ExerciseMapper;
import com.wallhell.service.ExerciseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ExerciseServiceImpl implements ExerciseService {

    @Autowired
    private ExerciseMapper exerciseMapper;

    @Override
    public AnswerEntity saveAnswer(AnswerEntity answer) {
        log.info(answer.toString());
        return exerciseMapper.save(answer);
    }
}
