Feature: Spotify

  Scenario:play songs from playlists
    Given Application is opened
    When click on playlist
    Then click to enter the playlist
    Then scroll down the screen
    And song is played