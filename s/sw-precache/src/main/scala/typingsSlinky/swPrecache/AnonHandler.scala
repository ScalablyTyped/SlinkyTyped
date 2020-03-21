package typingsSlinky.swPrecache

import typingsSlinky.swPrecache.mod.Handler
import typingsSlinky.swPrecache.mod.Method
import typingsSlinky.swToolbox.mod.Options_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandler extends js.Object {
  var handler: Handler
  var method: js.UndefOr[Method] = js.undefined
  var options: js.UndefOr[Options_] = js.undefined
  var urlPattern: js.RegExp | String
}

object AnonHandler {
  @scala.inline
  def apply(handler: Handler, urlPattern: js.RegExp | String, method: Method = null, options: Options_ = null): AnonHandler = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], urlPattern = urlPattern.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHandler]
  }
}

