package com.ems.crisismapper.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by aldma on 16/02/2018.
 */

public class TwitterPojo {
        @SerializedName("tweetID")
        @Expose
        private String tweetID;
        @SerializedName("tweetText")
        @Expose
        private String tweetText;
        @SerializedName("tweetTime")
        @Expose
        private String tweetTime;
        @SerializedName("tweetLat")
        @Expose
        private String tweetLat;
        @SerializedName("tweetLon")
        @Expose
        private String tweetLon;

        public String getTweetID() {
            return tweetID;
        }

        public void setTweetID(String tweetID) {
            this.tweetID = tweetID;
        }

        public String getTweetText() {
            return tweetText;
        }

        public void setTweetText(String tweetText) {
            this.tweetText = tweetText;
        }

        public String getTweetTime() {
            return tweetTime;
        }

        public void setTweetTime(String tweetTime) {
            this.tweetTime = tweetTime;
        }

        public String getTweetLat() {
            return tweetLat;
        }

        public void setTweetLat(String tweetLat) {
            this.tweetLat = tweetLat;
        }

        public String getTweetLon() {
            return tweetLon;
        }

        public void setTweetLon(String tweetLon) {
            this.tweetLon = tweetLon;
        }

}

