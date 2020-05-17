package typingsSlinky.yandexMaps.mod

import typingsSlinky.yandexMaps.mod.geometry.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[scala.Double]
  - typingsSlinky.yandexMaps.mod.geometry.Point
*/
trait IMultiRouteReferencePoint extends js.Object

object IMultiRouteReferencePoint {
  @scala.inline
  implicit def apply(value: js.Array[Double]): IMultiRouteReferencePoint = value.asInstanceOf[IMultiRouteReferencePoint]
  @scala.inline
  implicit def apply(value: Point): IMultiRouteReferencePoint = value.asInstanceOf[IMultiRouteReferencePoint]
  @scala.inline
  implicit def apply(value: String): IMultiRouteReferencePoint = value.asInstanceOf[IMultiRouteReferencePoint]
}

