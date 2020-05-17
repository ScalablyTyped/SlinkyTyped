package typingsSlinky.wellknown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Tuple2[scala.Double, scala.Double]
  - js.Tuple3[scala.Double, scala.Double, scala.Double]
*/
trait GeoJSONPosition extends js.Object

object GeoJSONPosition {
  @scala.inline
  implicit def apply(value: js.Tuple2[Double, Double]): GeoJSONPosition = value.asInstanceOf[GeoJSONPosition]
  @scala.inline
  implicit def apply(value: js.Tuple3[Double, Double, Double]): GeoJSONPosition = value.asInstanceOf[GeoJSONPosition]
}

