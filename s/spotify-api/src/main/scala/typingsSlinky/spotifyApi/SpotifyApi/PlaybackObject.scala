package typingsSlinky.spotifyApi.SpotifyApi

import typingsSlinky.spotifyApi.spotifyApiStrings.context
import typingsSlinky.spotifyApi.spotifyApiStrings.off
import typingsSlinky.spotifyApi.spotifyApiStrings.track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaybackObject extends js.Object {
  var repeat_state: off | track | context = js.native
  var shuffle_state: Boolean = js.native
}

object PlaybackObject {
  @scala.inline
  def apply(repeat_state: off | track | context, shuffle_state: Boolean): PlaybackObject = {
    val __obj = js.Dynamic.literal(repeat_state = repeat_state.asInstanceOf[js.Any], shuffle_state = shuffle_state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackObject]
  }
  @scala.inline
  implicit class PlaybackObjectOps[Self <: PlaybackObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepeat_state(value: off | track | context): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShuffle_state(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shuffle_state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

