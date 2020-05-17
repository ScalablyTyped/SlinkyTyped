package typingsSlinky.tabris.mod

import typingsSlinky.tabris.anon.Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - js.Tuple4[
scala.Double, 
js.UndefOr[scala.Double], 
js.UndefOr[scala.Double], 
js.UndefOr[scala.Double]]
  - typingsSlinky.tabris.anon.Bottom
*/
trait BoxDimensions extends js.Object

object BoxDimensions {
  @scala.inline
  implicit def apply(value: Bottom): BoxDimensions = value.asInstanceOf[BoxDimensions]
  @scala.inline
  implicit def apply(value: Double): BoxDimensions = value.asInstanceOf[BoxDimensions]
  @scala.inline
  implicit def apply(value: String): BoxDimensions = value.asInstanceOf[BoxDimensions]
  @scala.inline
  implicit def apply(value: js.Tuple4[Double, js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double]]): BoxDimensions = value.asInstanceOf[BoxDimensions]
}

