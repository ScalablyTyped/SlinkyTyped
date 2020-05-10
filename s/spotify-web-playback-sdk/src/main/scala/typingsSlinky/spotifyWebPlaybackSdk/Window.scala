package typingsSlinky.spotifyWebPlaybackSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var Spotify: TypeofSpotify = js.native
  def onSpotifyWebPlaybackSDKReady(): Unit = js.native
}

object Window {
  @scala.inline
  def apply(Spotify: TypeofSpotify, onSpotifyWebPlaybackSDKReady: () => Unit): Window = {
    val __obj = js.Dynamic.literal(Spotify = Spotify.asInstanceOf[js.Any], onSpotifyWebPlaybackSDKReady = js.Any.fromFunction0(onSpotifyWebPlaybackSDKReady))
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpotify(value: TypeofSpotify): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Spotify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSpotifyWebPlaybackSDKReady(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSpotifyWebPlaybackSDKReady")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

