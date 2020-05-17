package typingsSlinky.sinonjsFakeTimers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sinonjsFakeTimers.mod.BrowserClock
  - typingsSlinky.sinonjsFakeTimers.mod.NodeClock
*/
trait Clock extends js.Object

object Clock {
  @scala.inline
  implicit def apply(value: BrowserClock): Clock = value.asInstanceOf[Clock]
  @scala.inline
  implicit def apply(value: NodeClock): Clock = value.asInstanceOf[Clock]
}

