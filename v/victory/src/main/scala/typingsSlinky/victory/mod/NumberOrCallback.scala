package typingsSlinky.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.victory.mod.VictoryNumberCallback
*/
trait NumberOrCallback extends js.Object

object NumberOrCallback {
  @scala.inline
  implicit def apply(value: Double): NumberOrCallback = value.asInstanceOf[NumberOrCallback]
  @scala.inline
  implicit def apply(value: VictoryNumberCallback): NumberOrCallback = value.asInstanceOf[NumberOrCallback]
}

