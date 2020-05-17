package typingsSlinky.topojsonSpecification.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.topojsonSpecification.mod.Point[P]
  - typingsSlinky.topojsonSpecification.mod.MultiPoint[P]
  - typingsSlinky.topojsonSpecification.mod.LineString[P]
  - typingsSlinky.topojsonSpecification.mod.MultiLineString[P]
  - typingsSlinky.topojsonSpecification.mod.Polygon[P]
  - typingsSlinky.topojsonSpecification.mod.MultiPolygon[P]
  - typingsSlinky.topojsonSpecification.mod.GeometryCollection[P]
  - typingsSlinky.topojsonSpecification.mod.NullObject
*/
trait GeometryObject[P /* <: Properties */] extends js.Object

object GeometryObject {
  @scala.inline
  implicit def apply[P](value: GeometryCollection[P]): GeometryObject[P] = value.asInstanceOf[GeometryObject[P]]
  @scala.inline
  implicit def apply[P](value: LineString[P]): GeometryObject[P] = value.asInstanceOf[GeometryObject[P]]
  @scala.inline
  implicit def apply[P](value: MultiLineString[P]): GeometryObject[P] = value.asInstanceOf[GeometryObject[P]]
  @scala.inline
  implicit def apply[P](value: MultiPoint[P]): GeometryObject[P] = value.asInstanceOf[GeometryObject[P]]
  @scala.inline
  implicit def apply[P](value: MultiPolygon[P]): GeometryObject[P] = value.asInstanceOf[GeometryObject[P]]
  @scala.inline
  implicit def apply[P](value: NullObject): GeometryObject[P] = value.asInstanceOf[GeometryObject[P]]
  @scala.inline
  implicit def apply[P](value: Point[P]): GeometryObject[P] = value.asInstanceOf[GeometryObject[P]]
  @scala.inline
  implicit def apply[P](value: Polygon[P]): GeometryObject[P] = value.asInstanceOf[GeometryObject[P]]
}

