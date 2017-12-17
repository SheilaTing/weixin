package com.ting.demo1.weixin.message.resp;

/**
 * @Author:SheilaTing
 * @Descripton:响应消息之音乐消息
 */
public class MusicMessage extends BaseMessage {
    // 音乐
    private Music Music;

    public Music getMusic() {
        return Music;
    }

    public void setMusic(Music music) {
        Music = music;
    }
}
