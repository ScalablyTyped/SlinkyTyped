package typingsSlinky.youtubePlayer

import typingsSlinky.youtubePlayer.playerStatesMod.PlayerStates.ENDED
import typingsSlinky.youtubePlayer.playerStatesMod.PlayerStates.PLAYING
import typingsSlinky.youtubePlayer.youtubePlayerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStateChangeRequired extends js.Object {
  var acceptableStates: js.Tuple2[ENDED, PLAYING]
  var stateChangeRequired: `false`
}

object AnonStateChangeRequired {
  @scala.inline
  def apply(acceptableStates: js.Tuple2[ENDED, PLAYING], stateChangeRequired: `false`): AnonStateChangeRequired = {
    val __obj = js.Dynamic.literal(acceptableStates = acceptableStates.asInstanceOf[js.Any], stateChangeRequired = stateChangeRequired.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStateChangeRequired]
  }
}

