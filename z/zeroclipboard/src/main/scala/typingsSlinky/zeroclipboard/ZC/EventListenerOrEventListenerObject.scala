package typingsSlinky.zeroclipboard.ZC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.zeroclipboard.ZC.EventListener[T]
  - typingsSlinky.zeroclipboard.ZC.EventListenerObject[T]
*/
trait EventListenerOrEventListenerObject[T /* <: ZeroClipboardEvent */] extends js.Object

object EventListenerOrEventListenerObject {
  @scala.inline
  implicit def apply[T](value: EventListener[T]): EventListenerOrEventListenerObject[T] = value.asInstanceOf[EventListenerOrEventListenerObject[T]]
  @scala.inline
  implicit def apply[T](value: EventListenerObject[T]): EventListenerOrEventListenerObject[T] = value.asInstanceOf[EventListenerOrEventListenerObject[T]]
}

