package com.example.finalyearproject;

public class CNVideo {
    private String videoid;
    private String videoTitle;
    private String videoLink;
    private String module;
    private int important;
    private int duration;

    public CNVideo(){
    }

    public CNVideo(String videoid, String videoTitle, String videoLink, String module, int important, int duration) {
        this.videoid = videoid;
        this.videoTitle = videoTitle;
        this.videoLink = videoLink;
        this.module = module;
        this.important = important;
        this.duration = duration;
    }

    public String getVideoid() {
        return videoid;
    }

    public void setVideoid(String videoid) {
        this.videoid = videoid;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public int getImportant() {
        return important;
    }

    public void setImportant(int important) {
        this.important = important;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
