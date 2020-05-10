package typingsSlinky.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachSessionOptions extends Options {
  var isW3C: js.UndefOr[Boolean] = js.native
  var sessionId: String = js.native
}

object AttachSessionOptions {
  @scala.inline
  def apply(sessionId: String): AttachSessionOptions = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachSessionOptions]
  }
  @scala.inline
  implicit class AttachSessionOptionsOps[Self <: AttachSessionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsW3C(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isW3C")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsW3C: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isW3C")(js.undefined)
        ret
    }
  }
  
}

