package typingsSlinky.swPrecache.anon

import typingsSlinky.swPrecache.mod.Method
import typingsSlinky.swToolbox.mod.Options_
import typingsSlinky.swToolbox.mod.Request
import typingsSlinky.swToolbox.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handler extends js.Object {
  var handler: typingsSlinky.swPrecache.mod.Handler = js.native
  var method: js.UndefOr[Method] = js.native
  var options: js.UndefOr[Options_] = js.native
  var urlPattern: js.RegExp | String = js.native
}

object Handler {
  @scala.inline
  def apply(handler: typingsSlinky.swPrecache.mod.Handler, urlPattern: js.RegExp | String): Handler = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], urlPattern = urlPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler]
  }
  @scala.inline
  implicit class HandlerOps[Self <: Handler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHandlerFunction1(value: /* request */ Request => js.Promise[Response]): Self = this.set("handler", js.Any.fromFunction1(value))
    @scala.inline
    def setHandler(value: typingsSlinky.swPrecache.mod.Handler): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrlPatternRegExp(value: js.RegExp): Self = this.set("urlPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrlPattern(value: js.RegExp | String): Self = this.set("urlPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: Method): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setOptions(value: Options_): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

