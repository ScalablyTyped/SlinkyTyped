package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.WindowProxy
  - typingsSlinky.std.MessagePort
  - typingsSlinky.std.ServiceWorker
*/
trait MessageEventSource extends js.Object

object MessageEventSource {
  @scala.inline
  implicit def apply(value: org.scalajs.dom.raw.MessagePort): MessageEventSource = value.asInstanceOf[MessageEventSource]
  @scala.inline
  implicit def apply(value: org.scalajs.dom.experimental.serviceworkers.ServiceWorker): MessageEventSource = value.asInstanceOf[MessageEventSource]
  @scala.inline
  implicit def apply(value: org.scalajs.dom.raw.Window): MessageEventSource = value.asInstanceOf[MessageEventSource]
}

