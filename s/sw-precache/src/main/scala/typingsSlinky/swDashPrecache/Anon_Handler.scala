package typingsSlinky.swDashPrecache

import typingsSlinky.swDashPrecache.swDashPrecacheMod.Handler
import typingsSlinky.swDashPrecache.swDashPrecacheMod.Method
import typingsSlinky.swDashToolbox.swDashToolboxMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Handler extends js.Object {
  var handler: Handler
  var method: js.UndefOr[Method] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var urlPattern: js.RegExp | String
}

object Anon_Handler {
  @scala.inline
  def apply(handler: Handler, urlPattern: js.RegExp | String, method: Method = null, options: Options = null): Anon_Handler = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], urlPattern = urlPattern.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Handler]
  }
}

