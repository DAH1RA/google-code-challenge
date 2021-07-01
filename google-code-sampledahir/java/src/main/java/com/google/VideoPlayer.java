package com.google;

import java.util.ArrayList;

public class VideoPlayer {

  private final VideoLibrary videoLibrary;
  private Video currentVideo;
  private boolean currentVideoPlaying = false;
  private boolean pauseVideo = false;

  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
  }

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
  }

  public void showAllVideos() {
//    System.out.println("showAllVideos needs implementation");
    for(Video video: videoLibrary.getVideos()){
      System.out.println(video.getTitle() + "(" + video.getVideoId() + ")" + video.getTags());
    }
  }

  public void playVideo(String videoId) {

      Video video = videoLibrary.getVideo(videoId);
//      stopVideo();
      if(video != null){
        if(currentVideoPlaying=true && currentVideo != null){
          System.out.println("Stopping video:" + " " + currentVideo.getTitle());
        }
        currentVideoPlaying = true;
        currentVideo = video;
        System.out.println("Playing video:" + " " + currentVideo.getTitle());
      }else{
        System.out.println("Cannot play video: Video does not exist");
      }



  }

  public void stopVideo() {
    if (currentVideoPlaying==false){
      System.out.println("Cannot stop video: No video is currently playing");
    }
    if (currentVideoPlaying==true){
      currentVideoPlaying=false;
      System.out.println("Stopping video: " + currentVideo.getTitle());
    }
  }

  public void playRandomVideo() {
    ArrayList<String> arrlist = new ArrayList<String>();
    for(Video video: videoLibrary.getVideos()){
      arrlist.add(video.getVideoId());
    }
    double randomNumber = Math.random();
    playVideo(arrlist.get((int)randomNumber));
  }

  public void pauseVideo() {
    if((pauseVideo == true)&&(currentVideoPlaying==true)){
      System.out.println("Video already paused: " + currentVideo.getTitle());
    }
    if (pauseVideo == false){
      pauseVideo = true;
      System.out.println("Pausing video: " + currentVideo.getTitle());
    }
    if((pauseVideo == true)&&(currentVideoPlaying==false)){
        System.out.println("Cannot pause video: No video is currently playing");

    }
  }

  public void continueVideo() {
    System.out.println("continueVideo needs implementation");
  }

  public void showPlaying() {
    System.out.println("showPlaying needs implementation");
  }

  public void createPlaylist(String playlistName) {
    System.out.println("createPlaylist needs implementation");
  }

  public void addVideoToPlaylist(String playlistName, String videoId) {
    System.out.println("addVideoToPlaylist needs implementation");
  }

  public void showAllPlaylists() {
    System.out.println("showAllPlaylists needs implementation");
  }

  public void showPlaylist(String playlistName) {
    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    System.out.println("searchVideos needs implementation");
  }

  public void searchVideosWithTag(String videoTag) {
    System.out.println("searchVideosWithTag needs implementation");
  }

  public void flagVideo(String videoId) {
    System.out.println("flagVideo needs implementation");
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}