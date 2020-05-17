package typingsSlinky.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  - js.Tuple3[scala.Double, scala.Double, scala.Double]
*/
trait ColorArray extends ColorValue

object ColorArray {
  @scala.inline
  implicit def apply(value: js.Tuple3[Double, Double, Double]): ColorArray = value.asInstanceOf[ColorArray]
  @scala.inline
  implicit def apply(value: js.Tuple4[Double, Double, Double, Double]): ColorArray = value.asInstanceOf[ColorArray]
}

