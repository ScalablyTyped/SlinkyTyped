package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.encodeMod._ColorValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends _ColorValueRef {
  var count: js.UndefOr[Double] = js.undefined
  var gradient: typingsSlinky.vegaTypings.encodeMod.Field
  var start: js.UndefOr[js.Array[Double]] = js.undefined
  var stop: js.UndefOr[js.Array[Double]] = js.undefined
}

object Count {
  @scala.inline
  def apply(
    gradient: typingsSlinky.vegaTypings.encodeMod.Field,
    count: js.UndefOr[Double] = js.undefined,
    start: js.Array[Double] = null,
    stop: js.Array[Double] = null
  ): Count = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

