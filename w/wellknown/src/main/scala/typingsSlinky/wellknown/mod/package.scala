package typingsSlinky.wellknown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GeoJSONLineString = typingsSlinky.wellknown.mod.Geometry[
    typingsSlinky.wellknown.wellknownStrings.LineString, 
    js.Array[typingsSlinky.wellknown.mod.GeoJSONPosition]
  ]
  type GeoJSONMultiLineString = typingsSlinky.wellknown.mod.Geometry[
    typingsSlinky.wellknown.wellknownStrings.MultiLineString, 
    js.Array[js.Array[typingsSlinky.wellknown.mod.GeoJSONPosition]]
  ]
  type GeoJSONMultiPoint = typingsSlinky.wellknown.mod.Geometry[
    typingsSlinky.wellknown.wellknownStrings.MultiPoint, 
    js.Array[typingsSlinky.wellknown.mod.GeoJSONPosition]
  ]
  type GeoJSONMultiPolygon = typingsSlinky.wellknown.mod.Geometry[
    typingsSlinky.wellknown.wellknownStrings.MultiPolygon, 
    js.Array[js.Array[js.Array[typingsSlinky.wellknown.mod.GeoJSONPosition]]]
  ]
  type GeoJSONPoint = typingsSlinky.wellknown.mod.Geometry[
    typingsSlinky.wellknown.wellknownStrings.Point, 
    typingsSlinky.wellknown.mod.GeoJSONPosition
  ]
  type GeoJSONPolygon = typingsSlinky.wellknown.mod.Geometry[
    typingsSlinky.wellknown.wellknownStrings.Polygon, 
    js.Array[js.Array[typingsSlinky.wellknown.mod.GeoJSONPosition]]
  ]
}
