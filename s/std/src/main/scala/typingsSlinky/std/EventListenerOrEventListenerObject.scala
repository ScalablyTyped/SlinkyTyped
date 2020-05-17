package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.EventListener
  - typingsSlinky.std.EventListenerObject
*/
trait EventListenerOrEventListenerObject extends js.Object

object EventListenerOrEventListenerObject {
  @scala.inline
  implicit def apply(value: EventListener): EventListenerOrEventListenerObject = value.asInstanceOf[EventListenerOrEventListenerObject]
  @scala.inline
  implicit def apply(value: EventListenerObject): EventListenerOrEventListenerObject = value.asInstanceOf[EventListenerOrEventListenerObject]
}

