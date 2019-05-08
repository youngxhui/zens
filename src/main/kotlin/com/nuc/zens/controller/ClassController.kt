package com.nuc.zens.controller

import com.nuc.zens.result.Result
import com.nuc.zens.service.ClassService
import com.nuc.zens.util.ResultUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.sql.Date
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.ZoneOffset
import java.util.*

/**
 * @author 杨晓辉 2019/5/7 16:17
 */
@RestController
@RequestMapping("/class")
class ClassController {

    @Autowired
    private lateinit var classService: ClassService

    /**
     * 获取所有的班级
     * @return Result
     */
    @GetMapping("/all")
    fun getAllClass(): Result {
        val classes = classService.getAllClasses()
        return ResultUtils.success(data = classes)
    }
}
