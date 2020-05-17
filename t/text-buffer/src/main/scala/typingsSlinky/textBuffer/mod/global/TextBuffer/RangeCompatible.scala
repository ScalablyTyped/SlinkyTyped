package typingsSlinky.textBuffer.mod.global.TextBuffer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The types usable when constructing a range via the Range::fromObject method. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.textBuffer.mod.global.TextBuffer.RangeLike
  - js.Tuple2[
typingsSlinky.textBuffer.mod.global.TextBuffer.PointLike | (js.Tuple2[scala.Double, scala.Double]), 
typingsSlinky.textBuffer.mod.global.TextBuffer.PointLike | (js.Tuple2[scala.Double, scala.Double])]
*/
trait RangeCompatible extends js.Object

object RangeCompatible {
  @scala.inline
  implicit def apply(value: RangeLike): RangeCompatible = value.asInstanceOf[RangeCompatible]
  @scala.inline
  implicit def apply(value: js.Tuple2[PointLike | (js.Tuple2[Double, Double]), PointLike | (js.Tuple2[Double, Double])]): RangeCompatible = value.asInstanceOf[RangeCompatible]
}

