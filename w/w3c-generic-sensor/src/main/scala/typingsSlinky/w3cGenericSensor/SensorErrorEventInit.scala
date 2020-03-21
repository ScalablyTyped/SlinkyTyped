package typingsSlinky.w3cGenericSensor

import typingsSlinky.std.EventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SensorErrorEventInit extends EventInit {
  var error: js.Error
}

object SensorErrorEventInit {
  @scala.inline
  def apply(
    error: js.Error,
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    composed: js.UndefOr[Boolean] = js.undefined
  ): SensorErrorEventInit = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorErrorEventInit]
  }
}

