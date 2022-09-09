Feature: Spotify

  Scenario:play songs from playlists
    Given Application is opened
    When click on playlist
    Then click to enter the playlist
    Then scroll down the screen
    And song is played

    Scenario: play dong from the search box
      Given click the search button
      When I enter "Tarkan" to search song
      Then scroll screen and select song from list