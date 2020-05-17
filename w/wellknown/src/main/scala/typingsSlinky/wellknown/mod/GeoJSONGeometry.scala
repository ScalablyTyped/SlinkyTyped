package typingsSlinky.wellknown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wellknown.mod.GeoJSONPoint
  - typingsSlinky.wellknown.mod.GeoJSONMultiPoint
  - typingsSlinky.wellknown.mod.GeoJSONLineString
  - typingsSlinky.wellknown.mod.GeoJSONMultiLineString
  - typingsSlinky.wellknown.mod.GeoJSONPolygon
  - typingsSlinky.wellknown.mod.GeoJSONMultiPolygon
  - scala.Null
*/
trait GeoJSONGeometry extends js.Object

object GeoJSONGeometry {
  @scala.inline
  implicit def apply(
    value: GeoJSONLineString | GeoJSONMultiLineString | GeoJSONMultiPoint | GeoJSONMultiPolygon | GeoJSONPoint | GeoJSONPolygon
  ): GeoJSONGeometry = value.asInstanceOf[GeoJSONGeometry]
  @scala.inline
  implicit def apply(value: Null): GeoJSONGeometry = value.asInstanceOf[GeoJSONGeometry]
}

