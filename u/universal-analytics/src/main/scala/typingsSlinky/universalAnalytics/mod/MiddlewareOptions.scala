package typingsSlinky.universalAnalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MiddlewareOptions extends VisitorOptions {
  var cookieName: js.UndefOr[String] = js.native
}

object MiddlewareOptions {
  @scala.inline
  def apply(): MiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MiddlewareOptions]
  }
  @scala.inline
  implicit class MiddlewareOptionsOps[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookieName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieName")(js.undefined)
        ret
    }
  }
  
}

