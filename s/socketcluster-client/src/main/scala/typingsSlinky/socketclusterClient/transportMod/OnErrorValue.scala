package typingsSlinky.socketclusterClient.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnErrorValue extends js.Object {
  var error: js.Error
}

object OnErrorValue {
  @scala.inline
  def apply(error: js.Error): OnErrorValue = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnErrorValue]
  }
}

