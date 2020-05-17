package typingsSlinky.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.tabris.mod.PercentLikeObject
*/
trait PercentValue extends ConstraintValue

object PercentValue {
  @scala.inline
  implicit def apply(value: PercentLikeObject): PercentValue = value.asInstanceOf[PercentValue]
  @scala.inline
  implicit def apply(value: String): PercentValue = value.asInstanceOf[PercentValue]
}

