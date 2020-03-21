package typingsSlinky.socketclusterClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: js.Error
}

object AnonError {
  @scala.inline
  def apply(error: js.Error): AnonError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonError]
  }
}

