package typingsSlinky.swPrecache.anon

import typingsSlinky.swPrecache.mod.Method
import typingsSlinky.swToolbox.mod.Options_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handler extends js.Object {
  var handler: typingsSlinky.swPrecache.mod.Handler
  var method: js.UndefOr[Method] = js.undefined
  var options: js.UndefOr[Options_] = js.undefined
  var urlPattern: js.RegExp | String
}

object Handler {
  @scala.inline
  def apply(
    handler: typingsSlinky.swPrecache.mod.Handler,
    urlPattern: js.RegExp | String,
    method: Method = null,
    options: Options_ = null
  ): Handler = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], urlPattern = urlPattern.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler]
  }
}

