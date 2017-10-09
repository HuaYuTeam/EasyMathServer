package cn.pingweb.service.impl;

import cn.pingweb.entity.ExamResult;
import cn.pingweb.exception.WXException;
import cn.pingweb.mapper.ExamMapper;
import cn.pingweb.service.IExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/9/26.
 */
@Service
public class ExamServiceImpl implements IExamService {

    @Autowired
    private ExamMapper examMapper;

    public void doExam() {

    }

    public boolean submitExam(ExamResult examResult) throws WXException {
        try {
            examMapper.insert(examResult);
        } catch (Exception exception) {
            throw new WXException("erro");
        }
        return false;
    }

    public List<ExamResult> getEaxamResultsByWxId(String wxId){
       return examMapper.getExamResultByUid(wxId);
    }

}
