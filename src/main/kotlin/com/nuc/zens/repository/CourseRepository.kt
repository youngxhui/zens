package com.nuc.zens.repository

import com.nuc.zens.po.Course
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * @author 杨晓辉 2019-02-15 17:59
 */
@Repository
interface CourseRepository : JpaRepository<Course, Long> {
}