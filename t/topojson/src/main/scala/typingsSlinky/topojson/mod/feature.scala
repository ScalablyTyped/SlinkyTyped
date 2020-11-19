package typingsSlinky.topojson.mod

import typingsSlinky.geojson.mod.Feature
import typingsSlinky.geojson.mod.FeatureCollection
import typingsSlinky.geojson.mod.GeometryObject
import typingsSlinky.topojsonSpecification.mod.GeometryCollection
import typingsSlinky.topojsonSpecification.mod.LineString
import typingsSlinky.topojsonSpecification.mod.MultiLineString
import typingsSlinky.topojsonSpecification.mod.MultiPoint
import typingsSlinky.topojsonSpecification.mod.MultiPolygon
import typingsSlinky.topojsonSpecification.mod.Objects
import typingsSlinky.topojsonSpecification.mod.Point
import typingsSlinky.topojsonSpecification.mod.Polygon
import typingsSlinky.topojsonSpecification.mod.Properties
import typingsSlinky.topojsonSpecification.mod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("topojson", "feature")
@js.native
object feature extends js.Object {
  
  def apply[P](topology: Topology[Objects[Properties]], `object`: GeometryCollection[P]): FeatureCollection[GeometryObject, P] = js.native
  def apply[P](
    topology: Topology[Objects[Properties]],
    `object`: typingsSlinky.topojsonSpecification.mod.GeometryObject[P]
  ): (Feature[GeometryObject, P]) | (FeatureCollection[GeometryObject, P]) = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: LineString[P]): Feature[typingsSlinky.geojson.mod.LineString, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: MultiLineString[P]): Feature[typingsSlinky.geojson.mod.MultiLineString, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: MultiPoint[P]): Feature[typingsSlinky.geojson.mod.MultiPoint, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: MultiPolygon[P]): Feature[typingsSlinky.geojson.mod.MultiPolygon, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: Point[P]): Feature[typingsSlinky.geojson.mod.Point, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: Polygon[P]): Feature[typingsSlinky.geojson.mod.Polygon, P] = js.native
}
