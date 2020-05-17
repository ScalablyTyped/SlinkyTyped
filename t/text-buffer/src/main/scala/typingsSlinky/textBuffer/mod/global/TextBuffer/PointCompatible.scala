package typingsSlinky.textBuffer.mod.global.TextBuffer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The types usable when constructing a point via the Point::fromObject method. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.textBuffer.mod.global.TextBuffer.PointLike
  - js.Tuple2[scala.Double, scala.Double]
*/
trait PointCompatible extends js.Object

object PointCompatible {
  @scala.inline
  implicit def apply(value: PointLike): PointCompatible = value.asInstanceOf[PointCompatible]
  @scala.inline
  implicit def apply(value: js.Tuple2[Double, Double]): PointCompatible = value.asInstanceOf[PointCompatible]
}

