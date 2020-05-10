package typingsSlinky.youtubePlayer

import typingsSlinky.youtubePlayer.playerStatesMod.PlayerStates.ENDED
import typingsSlinky.youtubePlayer.playerStatesMod.PlayerStates.PAUSED
import typingsSlinky.youtubePlayer.playerStatesMod.PlayerStates.PLAYING
import typingsSlinky.youtubePlayer.youtubePlayerBooleans.`true`
import typingsSlinky.youtubePlayer.youtubePlayerNumbers.`3000`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTimeout extends js.Object {
  var acceptableStates: js.Tuple3[ENDED, PLAYING, PAUSED] = js.native
  var stateChangeRequired: `true` = js.native
  // TRICKY: `seekTo` may not cause a state change if no buffering is required.
  var timeout: `3000` = js.native
}

object AnonTimeout {
  @scala.inline
  def apply(acceptableStates: js.Tuple3[ENDED, PLAYING, PAUSED], stateChangeRequired: `true`, timeout: `3000`): AnonTimeout = {
    val __obj = js.Dynamic.literal(acceptableStates = acceptableStates.asInstanceOf[js.Any], stateChangeRequired = stateChangeRequired.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTimeout]
  }
  @scala.inline
  implicit class AnonTimeoutOps[Self <: AnonTimeout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptableStates(value: js.Tuple3[ENDED, PLAYING, PAUSED]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptableStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateChangeRequired(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChangeRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: `3000`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

