package typingsSlinky.spotifyWebPlaybackSdk

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.spotifyWebPlaybackSdk.Spotify.PlayerInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object Spotify extends js.Object {
    
    val Player: Instantiable1[
        /* options */ PlayerInit, 
        typingsSlinky.spotifyWebPlaybackSdk.Spotify.SpotifyPlayer
      ] = js.native
    
    @js.native
    class SpotifyPlayer protected ()
      extends typingsSlinky.spotifyWebPlaybackSdk.Spotify.SpotifyPlayer {
      def this(options: PlayerInit) = this()
    }
  }
}
