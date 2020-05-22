package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeOptions extends js.Object {
  var preventAbort: js.UndefOr[scala.Boolean] = js.undefined
  var preventCancel: js.UndefOr[scala.Boolean] = js.undefined
  var preventClose: js.UndefOr[scala.Boolean] = js.undefined
  var signal: js.UndefOr[org.scalajs.dom.experimental.AbortSignal] = js.undefined
}

object PipeOptions {
  @scala.inline
  def apply(
    preventAbort: js.UndefOr[scala.Boolean] = js.undefined,
    preventCancel: js.UndefOr[scala.Boolean] = js.undefined,
    preventClose: js.UndefOr[scala.Boolean] = js.undefined,
    signal: org.scalajs.dom.experimental.AbortSignal = null
  ): PipeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preventAbort)) __obj.updateDynamic("preventAbort")(preventAbort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preventCancel)) __obj.updateDynamic("preventCancel")(preventCancel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preventClose)) __obj.updateDynamic("preventClose")(preventClose.get.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipeOptions]
  }
}

