package typingsSlinky.topojson.topojsonMod

import typingsSlinky.geojson.geojsonMod.Feature
import typingsSlinky.geojson.geojsonMod.FeatureCollection
import typingsSlinky.geojson.geojsonMod.GeometryObject
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryCollection
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.LineString
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.MultiLineString
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.MultiPoint
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.MultiPolygon
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Objects
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Point
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Polygon
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Properties
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "feature")
@js.native
object feature extends js.Object {
  def apply[P](topology: Topology[Objects[Properties]], `object`: GeometryCollection[P]): FeatureCollection[GeometryObject, P] = js.native
  def apply[P](
    topology: Topology[Objects[Properties]],
    `object`: typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject[P]
  ): (Feature[GeometryObject, P]) | (FeatureCollection[GeometryObject, P]) = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: LineString[P]): Feature[typingsSlinky.geojson.geojsonMod.LineString, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: MultiLineString[P]): Feature[typingsSlinky.geojson.geojsonMod.MultiLineString, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: MultiPoint[P]): Feature[typingsSlinky.geojson.geojsonMod.MultiPoint, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: MultiPolygon[P]): Feature[typingsSlinky.geojson.geojsonMod.MultiPolygon, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: Point[P]): Feature[typingsSlinky.geojson.geojsonMod.Point, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: Polygon[P]): Feature[typingsSlinky.geojson.geojsonMod.Polygon, P] = js.native
}

