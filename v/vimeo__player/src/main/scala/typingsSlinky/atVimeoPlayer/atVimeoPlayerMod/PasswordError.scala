package typingsSlinky.atVimeoPlayer.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordError extends Error {
  @JSName("name")
  var name_PasswordError: typingsSlinky.atVimeoPlayer.atVimeoPlayerStrings.PasswordError
}

object PasswordError {
  @scala.inline
  def apply(
    message: String,
    method: String,
    name: typingsSlinky.atVimeoPlayer.atVimeoPlayerStrings.PasswordError
  ): PasswordError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PasswordError]
  }
}

