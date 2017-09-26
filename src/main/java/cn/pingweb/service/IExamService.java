package cn.pingweb.service;

import cn.pingweb.entity.ExamResult;
import cn.pingweb.exception.WXExcetion;

/**
 * Created by Administrator on 2017/9/26.
 */
public interface IExamService {

    /**
     * 暂不开发，题目前段自动生成
     * 测试开始->发卷
     */
    void doExam();

    /**
     * 提交试卷
     * @return
     */
    boolean submitExam(ExamResult examResult) throws WXExcetion;

}
