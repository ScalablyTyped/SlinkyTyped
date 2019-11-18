package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaKeyMessageEventInit extends EventInit {
  var message: scala.scalajs.js.typedarray.ArrayBuffer
  var messageType: MediaKeyMessageType
}

object MediaKeyMessageEventInit {
  @scala.inline
  def apply(
    message: scala.scalajs.js.typedarray.ArrayBuffer,
    messageType: MediaKeyMessageType,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined
  ): MediaKeyMessageEventInit = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaKeyMessageEventInit]
  }
}

