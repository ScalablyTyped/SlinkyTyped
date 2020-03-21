package typingsSlinky.youtubePlayer

import typingsSlinky.youtubePlayer.playerStatesMod.PlayerStates.ENDED
import typingsSlinky.youtubePlayer.playerStatesMod.PlayerStates.PAUSED
import typingsSlinky.youtubePlayer.playerStatesMod.PlayerStates.PLAYING
import typingsSlinky.youtubePlayer.youtubePlayerBooleans.`true`
import typingsSlinky.youtubePlayer.youtubePlayerNumbers.`3000`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTimeout extends js.Object {
  var acceptableStates: js.Tuple3[ENDED, PLAYING, PAUSED]
  var stateChangeRequired: `true`
  // TRICKY: `seekTo` may not cause a state change if no buffering is required.
  var timeout: `3000`
}

object AnonTimeout {
  @scala.inline
  def apply(acceptableStates: js.Tuple3[ENDED, PLAYING, PAUSED], stateChangeRequired: `true`, timeout: `3000`): AnonTimeout = {
    val __obj = js.Dynamic.literal(acceptableStates = acceptableStates.asInstanceOf[js.Any], stateChangeRequired = stateChangeRequired.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTimeout]
  }
}

