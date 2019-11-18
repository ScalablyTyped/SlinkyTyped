package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentAndElementEventHandlersEventMap extends js.Object {
  var copy: org.scalajs.dom.raw.ClipboardEvent
  var cut: org.scalajs.dom.raw.ClipboardEvent
  var paste: org.scalajs.dom.raw.ClipboardEvent
}

object DocumentAndElementEventHandlersEventMap {
  @scala.inline
  def apply(
    copy: org.scalajs.dom.raw.ClipboardEvent,
    cut: org.scalajs.dom.raw.ClipboardEvent,
    paste: org.scalajs.dom.raw.ClipboardEvent
  ): DocumentAndElementEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(copy = copy.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DocumentAndElementEventHandlersEventMap]
  }
}

