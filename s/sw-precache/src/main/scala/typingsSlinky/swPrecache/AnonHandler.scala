package typingsSlinky.swPrecache

import typingsSlinky.swPrecache.mod.Handler
import typingsSlinky.swPrecache.mod.Method
import typingsSlinky.swToolbox.mod.Options_
import typingsSlinky.swToolbox.mod.Request
import typingsSlinky.swToolbox.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHandler extends js.Object {
  var handler: Handler = js.native
  var method: js.UndefOr[Method] = js.native
  var options: js.UndefOr[Options_] = js.native
  var urlPattern: js.RegExp | String = js.native
}

object AnonHandler {
  @scala.inline
  def apply(handler: Handler, urlPattern: js.RegExp | String): AnonHandler = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], urlPattern = urlPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHandler]
  }
  @scala.inline
  implicit class AnonHandlerOps[Self <: AnonHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandlerFunction1(value: /* request */ Request => js.Promise[Response]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHandler(value: Handler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlPatternRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlPattern(value: js.RegExp | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: Method): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: Options_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

