package typingsSlinky.textBuffer.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TextBuffer {
  /** The types usable when constructing a point via the Point::fromObject method. */
  type PointCompatible = typingsSlinky.textBuffer.mod.global.TextBuffer.PointLike | (js.Tuple2[scala.Double, scala.Double])
  /** The types usable when constructing a range via the Range::fromObject method. */
  type RangeCompatible = typingsSlinky.textBuffer.mod.global.TextBuffer.RangeLike | (js.Tuple2[
    typingsSlinky.textBuffer.mod.global.TextBuffer.PointLike | (js.Tuple2[scala.Double, scala.Double]), 
    typingsSlinky.textBuffer.mod.global.TextBuffer.PointLike | (js.Tuple2[scala.Double, scala.Double])
  ])
}
