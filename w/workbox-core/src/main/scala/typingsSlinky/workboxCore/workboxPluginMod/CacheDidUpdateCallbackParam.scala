package typingsSlinky.workboxCore.workboxPluginMod

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.Response
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheDidUpdateCallbackParam extends js.Object {
  var cacheName: String = js.native
  var event: js.UndefOr[Event_] = js.native
  var newResponse: Response = js.native
  var oldResponse: js.UndefOr[Response | Null] = js.native
  var request: Request = js.native
}

object CacheDidUpdateCallbackParam {
  @scala.inline
  def apply(cacheName: String, newResponse: Response, request: Request): CacheDidUpdateCallbackParam = {
    val __obj = js.Dynamic.literal(cacheName = cacheName.asInstanceOf[js.Any], newResponse = newResponse.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheDidUpdateCallbackParam]
  }
  @scala.inline
  implicit class CacheDidUpdateCallbackParamOps[Self <: CacheDidUpdateCallbackParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewResponse(value: Response): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withOldResponse(value: Response): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withOldResponseNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldResponse")(null)
        ret
    }
  }
  
}

