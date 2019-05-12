package com.nuc.zens.service.point

import com.nuc.zens.exception.ResultException
import com.nuc.zens.po.entity.CollegeTarget

interface CollegeTargetService {

    @Throws(ResultException::class)
    fun save(collegeTarget: CollegeTarget)

    @Throws(ResultException::class)
    fun findOne(id:Long): CollegeTarget
}