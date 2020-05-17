package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function
*/
trait TimerHandler extends js.Object

object TimerHandler {
  @scala.inline
  implicit def apply(value: js.Function): TimerHandler = value.asInstanceOf[TimerHandler]
  @scala.inline
  implicit def apply(value: java.lang.String): TimerHandler = value.asInstanceOf[TimerHandler]
}

