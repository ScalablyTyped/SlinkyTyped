package typingsSlinky.twilioChat.channelMod.Channel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastMessage extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var timestamp: js.UndefOr[js.Date] = js.undefined
}

object LastMessage {
  @scala.inline
  def apply(index: js.UndefOr[Double] = js.undefined, timestamp: js.Date = null): LastMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastMessage]
  }
}

