package typingsSlinky.vimeoPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContrastError extends Error {
  @JSName("name")
  var name_ContrastError: typingsSlinky.vimeoPlayer.vimeoPlayerStrings.ContrastError = js.native
}

object ContrastError {
  @scala.inline
  def apply(message: String, method: String, name: typingsSlinky.vimeoPlayer.vimeoPlayerStrings.ContrastError): ContrastError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContrastError]
  }
  @scala.inline
  implicit class ContrastErrorOps[Self <: ContrastError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: typingsSlinky.vimeoPlayer.vimeoPlayerStrings.ContrastError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

