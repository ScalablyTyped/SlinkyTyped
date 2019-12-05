package typingsSlinky.workboxDashCore.typesWorkboxPluginMod

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.Response
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheDidUpdateCallbackParam extends js.Object {
  var cacheName: String
  var event: js.UndefOr[Event] = js.undefined
  var newResponse: Response
  var oldResponse: js.UndefOr[Response | Null] = js.undefined
  var request: Request
}

object CacheDidUpdateCallbackParam {
  @scala.inline
  def apply(
    cacheName: String,
    newResponse: Response,
    request: Request,
    event: Event = null,
    oldResponse: Response = null
  ): CacheDidUpdateCallbackParam = {
    val __obj = js.Dynamic.literal(cacheName = cacheName.asInstanceOf[js.Any], newResponse = newResponse.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (oldResponse != null) __obj.updateDynamic("oldResponse")(oldResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheDidUpdateCallbackParam]
  }
}

