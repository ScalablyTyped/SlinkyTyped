package typingsSlinky.spotifyWebPlaybackSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Spotify {
  
  type AddListenerFn = (js.Function2[
    /* event */ typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.ready | typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.not_ready, 
    /* cb */ typingsSlinky.spotifyWebPlaybackSdk.Spotify.PlaybackInstanceListener, 
    scala.Unit
  ]) with (js.Function2[
    typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.player_state_changed, 
    /* cb */ typingsSlinky.spotifyWebPlaybackSdk.Spotify.PlaybackStateListener, 
    scala.Unit
  ]) with (js.Function2[
    /* event */ typingsSlinky.spotifyWebPlaybackSdk.Spotify.ErrorTypes, 
    /* cb */ typingsSlinky.spotifyWebPlaybackSdk.Spotify.ErrorListener, 
    scala.Unit
  ])
  
  type ErrorListener = js.Function1[/* err */ typingsSlinky.spotifyWebPlaybackSdk.Spotify.Error, scala.Unit]
  
  type PlaybackInstanceListener = js.Function1[
    /* inst */ typingsSlinky.spotifyWebPlaybackSdk.Spotify.WebPlaybackInstance, 
    scala.Unit
  ]
  
  type PlaybackStateListener = js.Function1[/* s */ typingsSlinky.spotifyWebPlaybackSdk.Spotify.PlaybackState, scala.Unit]
}
