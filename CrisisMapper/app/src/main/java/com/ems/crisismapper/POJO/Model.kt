package com.ems.crisismapper.POJO

/**
 * Created by aldma on 16/02/2018.
 */
object Model {
    data class Result(val query: Query)
    data class Query(val searchinfo: SearchInfo)
    data class SearchInfo(val totalhits: Int)
}