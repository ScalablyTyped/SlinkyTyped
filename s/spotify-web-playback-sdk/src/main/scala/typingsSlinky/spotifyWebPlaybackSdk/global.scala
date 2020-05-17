package typingsSlinky.spotifyWebPlaybackSdk

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.spotifyWebPlaybackSdk.Spotify.PlayerInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object Spotify extends js.Object {
    @js.native
    class SpotifyPlayer protected ()
      extends typingsSlinky.spotifyWebPlaybackSdk.Spotify.SpotifyPlayer {
      def this(options: PlayerInit) = this()
    }
    
    val Player: Instantiable1[
        /* options */ PlayerInit, 
        typingsSlinky.spotifyWebPlaybackSdk.Spotify.SpotifyPlayer
      ] = js.native
  }
  
}

