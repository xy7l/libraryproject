package com.yanzhen.dao;

import com.yanzhen.po.Notice;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component("noticeDao")
public interface NoticeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice
     *
     * @mbggenerated Sun Jun 21 16:29:22 CST 2020
     */
    int insert(Notice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice
     *
     * @mbggenerated Sun Jun 21 16:29:22 CST 2020
     */
    int insertSelective(Notice record);


    /**
     * 查询公告信息
     */
    List<Notice> queryNoticeAll(@Param("content") String content);

    /**
     * 公告删除
     */
    void deleteNoticeByIds(List<Integer> id);

    /**
     * 查询详细根据id查询
     */
    Notice queryNoticeById(Integer id);
}