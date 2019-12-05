package typingsSlinky.twilioDashChat.libChannelMod.Channel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastMessage extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var timestamp: js.UndefOr[js.Date] = js.undefined
}

object LastMessage {
  @scala.inline
  def apply(index: Int | Double = null, timestamp: js.Date = null): LastMessage = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastMessage]
  }
}

