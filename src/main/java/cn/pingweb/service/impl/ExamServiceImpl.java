package cn.pingweb.service.impl;

import cn.pingweb.entity.ExamResult;
import cn.pingweb.exception.WXExcetion;
import cn.pingweb.mapper.ExamMapper;
import cn.pingweb.service.IExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/9/26.
 */
@Service
public class ExamServiceImpl implements IExamService {

    @Autowired
    private ExamMapper examMapper;

    public void doExam() {

    }

    public boolean submitExam(ExamResult examResult) throws WXExcetion {
        examMapper.insert(examResult);
        return false;
    }

}
