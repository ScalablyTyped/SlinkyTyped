package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBRequestEventMap extends js.Object {
  var error: org.scalajs.dom.raw.Event
  var success: org.scalajs.dom.raw.Event
}

object IDBRequestEventMap {
  @scala.inline
  def apply(error: org.scalajs.dom.raw.Event, success: org.scalajs.dom.raw.Event): IDBRequestEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDBRequestEventMap]
  }
}

