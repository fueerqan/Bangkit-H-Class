package com.muhammadfurqan.bangkithclass.model

import javax.inject.Inject

/**
 * @author by furqan on 20/05/2021
 */
// 2. Constructor Injection
class Car @Inject constructor(private val engine: Engine) {
//class Car  {

    // 1. Field Injection
//    @Inject
//    lateinit var engine: Engine

    fun getType(): String = engine.type()

}