package com.shinowit.model;

import java.io.Serializable;
import java.util.List;

public class SexInfo implements Serializable {

    private List<StuInfo> stuList;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sex_info.sex_id
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    private String sexId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sex_info.sex_type
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    private String sexType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sex_info
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sex_info.sex_id
     *
     * @return the value of sex_info.sex_id
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    public String getSexId() {
        return sexId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sex_info.sex_id
     *
     * @param sexId the value for sex_info.sex_id
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    public void setSexId(String sexId) {
        this.sexId = sexId == null ? null : sexId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sex_info.sex_type
     *
     * @return the value of sex_info.sex_type
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    public String getSexType() {
        return sexType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sex_info.sex_type
     *
     * @param sexType the value for sex_info.sex_type
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */
    public void setSexType(String sexType) {
        this.sexType = sexType == null ? null : sexType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sex_info
     *
     * @mbggenerated Tue Dec 23 18:21:10 CST 2014
     */

    public List<StuInfo> getStuList() {
        return stuList;
    }

    public void setStuList(List<StuInfo> stuList) {
        this.stuList = stuList;
    }
}