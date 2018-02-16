package com.ems.crisismapper.POJO

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by aldma on 16/02/2018.
 */
class Twitter {
    @SerializedName("tweetID")
    @Expose
    private var tweetID: String? = null
    @SerializedName("tweetText")
    @Expose
    private var tweetText: String? = null
    @SerializedName("tweetTime")
    @Expose
    private var tweetTime: String? = null
    @SerializedName("tweetLat")
    @Expose
    private var tweetLat: String? = null
    @SerializedName("tweetLon")
    @Expose
    private var tweetLon: String? = null

    fun getTweetID(): String? {
        return tweetID
    }

    fun setTweetID(tweetID: String) {
        this.tweetID = tweetID
    }

    fun getTweetText(): String? {
        return tweetText
    }

    fun setTweetText(tweetText: String) {
        this.tweetText = tweetText
    }

    fun getTweetTime(): String? {
        return tweetTime
    }

    fun setTweetTime(tweetTime: String) {
        this.tweetTime = tweetTime
    }

    fun getTweetLat(): String? {
        return tweetLat
    }

    fun setTweetLat(tweetLat: String) {
        this.tweetLat = tweetLat
    }

    fun getTweetLon(): String? {
        return tweetLon
    }

    fun setTweetLon(tweetLon: String) {
        this.tweetLon = tweetLon
    }
}