package typingsSlinky.wellknown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GeoJSONGeometry = typingsSlinky.wellknown.mod.GeoJSONPoint | typingsSlinky.wellknown.mod.GeoJSONMultiPoint | typingsSlinky.wellknown.mod.GeoJSONLineString | typingsSlinky.wellknown.mod.GeoJSONMultiLineString | typingsSlinky.wellknown.mod.GeoJSONPolygon | typingsSlinky.wellknown.mod.GeoJSONMultiPolygon | scala.Null
  
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
  
  type GeoJSONPosition = (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Double])
}
