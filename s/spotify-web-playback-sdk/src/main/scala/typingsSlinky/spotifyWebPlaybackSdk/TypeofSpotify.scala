package typingsSlinky.spotifyWebPlaybackSdk

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.spotifyWebPlaybackSdk.Spotify.PlayerInit
import typingsSlinky.spotifyWebPlaybackSdk.Spotify.SpotifyPlayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSpotify extends js.Object {
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
  implicit class TypeofSpotifyOps[Self <: TypeofSpotify] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpotifyPlayer(value: Instantiable1[/* options */ PlayerInit, SpotifyPlayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotifyPlayer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

