package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerEventMap extends AbstractWorkerEventMap {
  var message: org.scalajs.dom.raw.MessageEvent
}

object WorkerEventMap {
  @scala.inline
  def apply(error: org.scalajs.dom.raw.ErrorEvent, message: org.scalajs.dom.raw.MessageEvent): WorkerEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkerEventMap]
  }
}

