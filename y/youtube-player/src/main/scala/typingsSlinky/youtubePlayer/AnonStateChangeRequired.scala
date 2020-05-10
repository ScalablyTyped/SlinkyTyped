package typingsSlinky.youtubePlayer

import typingsSlinky.youtubePlayer.playerStatesMod.PlayerStates.ENDED
import typingsSlinky.youtubePlayer.playerStatesMod.PlayerStates.PLAYING
import typingsSlinky.youtubePlayer.youtubePlayerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStateChangeRequired extends js.Object {
  var acceptableStates: js.Tuple2[ENDED, PLAYING] = js.native
  var stateChangeRequired: `false` = js.native
}

object AnonStateChangeRequired {
  @scala.inline
  def apply(acceptableStates: js.Tuple2[ENDED, PLAYING], stateChangeRequired: `false`): AnonStateChangeRequired = {
    val __obj = js.Dynamic.literal(acceptableStates = acceptableStates.asInstanceOf[js.Any], stateChangeRequired = stateChangeRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStateChangeRequired]
  }
  @scala.inline
  implicit class AnonStateChangeRequiredOps[Self <: AnonStateChangeRequired] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptableStates(value: js.Tuple2[ENDED, PLAYING]): Self = {
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

