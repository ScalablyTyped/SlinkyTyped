package typingsSlinky.stripeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReturnurl extends js.Object {
  var return_url: String = js.native
}

object AnonReturnurl {
  @scala.inline
  def apply(return_url: String): AnonReturnurl = {
    val __obj = js.Dynamic.literal(return_url = return_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReturnurl]
  }
  @scala.inline
  implicit class AnonReturnurlOps[Self <: AnonReturnurl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReturn_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

