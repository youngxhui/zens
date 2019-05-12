package com.nuc.zens.po.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@Entity
@Table(name = "uek_acdemic_direction")
@JsonIgnoreProperties(value = ["id"])
class Direction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
    var num: String? = null
    var name: String? = null
    var summary: String? = null
    var coverImage: String? = null
    var subjectId: Long = 0

}
