package typingsSlinky.spotifyWebPlaybackSdk.Spotify

import typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkNumbers.`0`
import typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkNumbers.`1`
import typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaybackState extends js.Object {
  var context: PlaybackContext = js.native
  var disallows: PlaybackDisallows = js.native
  var duration: Double = js.native
  var paused: Boolean = js.native
  var position: Double = js.native
  /**
    * 0: NO_REPEAT
    * 1: ONCE_REPEAT
    * 2: FULL_REPEAT
    */
  var repeat_mode: `0` | `1` | `2` = js.native
  var restrictions: PlaybackRestrictions = js.native
  var shuffle: Boolean = js.native
  var track_window: PlaybackTrackWindow = js.native
}

object PlaybackState {
  @scala.inline
  def apply(
    context: PlaybackContext,
    disallows: PlaybackDisallows,
    duration: Double,
    paused: Boolean,
    position: Double,
    repeat_mode: `0` | `1` | `2`,
    restrictions: PlaybackRestrictions,
    shuffle: Boolean,
    track_window: PlaybackTrackWindow
  ): PlaybackState = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], disallows = disallows.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], repeat_mode = repeat_mode.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], shuffle = shuffle.asInstanceOf[js.Any], track_window = track_window.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackState]
  }
  @scala.inline
  implicit class PlaybackStateOps[Self <: PlaybackState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: PlaybackContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisallows(value: PlaybackDisallows): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepeat_mode(value: `0` | `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestrictions(value: PlaybackRestrictions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShuffle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shuffle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrack_window(value: PlaybackTrackWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track_window")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

