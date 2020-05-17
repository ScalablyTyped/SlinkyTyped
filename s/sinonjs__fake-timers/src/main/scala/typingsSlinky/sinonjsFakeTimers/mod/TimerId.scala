package typingsSlinky.sinonjsFakeTimers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.sinonjsFakeTimers.mod.NodeTimer
*/
trait TimerId extends js.Object

object TimerId {
  @scala.inline
  implicit def apply(value: Double): TimerId = value.asInstanceOf[TimerId]
  @scala.inline
  implicit def apply(value: NodeTimer): TimerId = value.asInstanceOf[TimerId]
}

