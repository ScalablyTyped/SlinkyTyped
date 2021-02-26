package typingsSlinky.spotifyWebPlaybackSdk

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.spotifyWebPlaybackSdk.Spotify.PlayerInit
import typingsSlinky.spotifyWebPlaybackSdk.Spotify.SpotifyPlayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofSpotify extends StObject {
    
    var SpotifyPlayer: Instantiable1[
        /* options */ PlayerInit, 
        typingsSlinky.spotifyWebPlaybackSdk.Spotify.SpotifyPlayer
      ] = js.native
  }
  object TypeofSpotify {
    
    @scala.inline
    def apply(SpotifyPlayer: Instantiable1[/* options */ PlayerInit, SpotifyPlayer]): TypeofSpotify = {
      val __obj = js.Dynamic.literal(SpotifyPlayer = SpotifyPlayer.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofSpotify]
    }
    
    @scala.inline
    implicit class TypeofSpotifyMutableBuilder[Self <: TypeofSpotify] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSpotifyPlayer(value: Instantiable1[/* options */ PlayerInit, SpotifyPlayer]): Self = StObject.set(x, "SpotifyPlayer", value.asInstanceOf[js.Any])
    }
  }
}
