package com.xmz.pojo;

public class MusicWithBLOBs extends Music {
    private String musicInfo;

    private String musicFile;

    private String score;

    private String picture;

    public String getMusicInfo() {
        return musicInfo;
    }

    public void setMusicInfo(String musicInfo) {
        this.musicInfo = musicInfo == null ? null : musicInfo.trim();
    }

    public String getMusicFile() {
        return musicFile;
    }

    public void setMusicFile(String musicFile) {
        this.musicFile = musicFile == null ? null : musicFile.trim();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }
}