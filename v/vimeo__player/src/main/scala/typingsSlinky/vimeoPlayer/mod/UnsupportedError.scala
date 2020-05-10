package typingsSlinky.vimeoPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsupportedError extends Error {
  @JSName("name")
  var name_UnsupportedError: typingsSlinky.vimeoPlayer.vimeoPlayerStrings.UnsupportedError = js.native
}

object UnsupportedError {
  @scala.inline
  def apply(
    message: String,
    method: String,
    name: typingsSlinky.vimeoPlayer.vimeoPlayerStrings.UnsupportedError
  ): UnsupportedError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedError]
  }
  @scala.inline
  implicit class UnsupportedErrorOps[Self <: UnsupportedError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: typingsSlinky.vimeoPlayer.vimeoPlayerStrings.UnsupportedError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

