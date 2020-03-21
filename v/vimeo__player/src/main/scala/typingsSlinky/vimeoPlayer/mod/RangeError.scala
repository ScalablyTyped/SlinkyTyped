package typingsSlinky.vimeoPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeError extends Error {
  @JSName("name")
  var name_RangeError: typingsSlinky.vimeoPlayer.vimeoPlayerStrings.RangeError
}

object RangeError {
  @scala.inline
  def apply(message: String, method: String, name: typingsSlinky.vimeoPlayer.vimeoPlayerStrings.RangeError): RangeError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RangeError]
  }
}

