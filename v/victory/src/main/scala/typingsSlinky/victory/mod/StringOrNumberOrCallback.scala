package typingsSlinky.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - typingsSlinky.victory.mod.VictoryStringOrNumberCallback
*/
trait StringOrNumberOrCallback extends js.Object

object StringOrNumberOrCallback {
  @scala.inline
  implicit def apply(value: Double): StringOrNumberOrCallback = value.asInstanceOf[StringOrNumberOrCallback]
  @scala.inline
  implicit def apply(value: String): StringOrNumberOrCallback = value.asInstanceOf[StringOrNumberOrCallback]
  @scala.inline
  implicit def apply(value: VictoryStringOrNumberCallback): StringOrNumberOrCallback = value.asInstanceOf[StringOrNumberOrCallback]
}

