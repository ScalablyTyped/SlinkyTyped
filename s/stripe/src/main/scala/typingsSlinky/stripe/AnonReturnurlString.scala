package typingsSlinky.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReturnurlString extends js.Object {
  var return_url: String = js.native
}

object AnonReturnurlString {
  @scala.inline
  def apply(return_url: String): AnonReturnurlString = {
    val __obj = js.Dynamic.literal(return_url = return_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReturnurlString]
  }
  @scala.inline
  implicit class AnonReturnurlStringOps[Self <: AnonReturnurlString] (val x: Self) extends AnyVal {
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

