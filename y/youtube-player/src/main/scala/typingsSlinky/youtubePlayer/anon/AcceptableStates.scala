package typingsSlinky.youtubePlayer.anon

import typingsSlinky.youtubePlayer.playerStatesMod.PlayerStates.ENDED
import typingsSlinky.youtubePlayer.playerStatesMod.PlayerStates.PAUSED
import typingsSlinky.youtubePlayer.youtubePlayerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptableStates extends js.Object {
  var acceptableStates: js.Tuple2[ENDED, PAUSED] = js.native
  var stateChangeRequired: `false` = js.native
}

object AcceptableStates {
  @scala.inline
  def apply(acceptableStates: js.Tuple2[ENDED, PAUSED], stateChangeRequired: `false`): AcceptableStates = {
    val __obj = js.Dynamic.literal(acceptableStates = acceptableStates.asInstanceOf[js.Any], stateChangeRequired = stateChangeRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptableStates]
  }
  @scala.inline
  implicit class AcceptableStatesOps[Self <: AcceptableStates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptableStates(value: js.Tuple2[ENDED, PAUSED]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptableStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateChangeRequired(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChangeRequired")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

