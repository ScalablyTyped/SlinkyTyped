package typingsSlinky.sourcemapCodec.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[scala.Double]
  - js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  - js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double]
*/
trait SourceMapSegment extends js.Object

object SourceMapSegment {
  @scala.inline
  implicit def apply(value: js.Array[Double]): SourceMapSegment = value.asInstanceOf[SourceMapSegment]
  @scala.inline
  implicit def apply(value: js.Tuple4[Double, Double, Double, Double]): SourceMapSegment = value.asInstanceOf[SourceMapSegment]
  @scala.inline
  implicit def apply(value: js.Tuple5[Double, Double, Double, Double, Double]): SourceMapSegment = value.asInstanceOf[SourceMapSegment]
}

