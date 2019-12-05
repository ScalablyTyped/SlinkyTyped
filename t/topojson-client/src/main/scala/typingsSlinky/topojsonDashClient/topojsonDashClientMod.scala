package typingsSlinky.topojsonDashClient

import typingsSlinky.geojson.geojsonMod.BBox
import typingsSlinky.geojson.geojsonMod.Feature
import typingsSlinky.geojson.geojsonMod.FeatureCollection
import typingsSlinky.geojson.geojsonMod.GeometryObject
import typingsSlinky.topojsonDashClient.topojsonDashClientMod.Transformer
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
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson-client", JSImport.Namespace)
@js.native
object topojsonDashClientMod extends js.Object {
  def bbox(topology: Topology[Objects[Properties]]): BBox = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: GeometryCollection[P]): FeatureCollection[GeometryObject, P] = js.native
  def feature[P](
    topology: Topology[Objects[Properties]],
    `object`: typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject[P]
  ): (Feature[GeometryObject, P]) | (FeatureCollection[GeometryObject, P]) = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: LineString[P]): Feature[typingsSlinky.geojson.geojsonMod.LineString, P] = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: MultiLineString[P]): Feature[typingsSlinky.geojson.geojsonMod.MultiLineString, P] = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: MultiPoint[P]): Feature[typingsSlinky.geojson.geojsonMod.MultiPoint, P] = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: MultiPolygon[P]): Feature[typingsSlinky.geojson.geojsonMod.MultiPolygon, P] = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: Point[P]): Feature[typingsSlinky.geojson.geojsonMod.Point, P] = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: Polygon[P]): Feature[typingsSlinky.geojson.geojsonMod.Polygon, P] = js.native
  def merge(
    topology: Topology[Objects[Properties]],
    objects: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
  ): typingsSlinky.geojson.geojsonMod.MultiPolygon = js.native
  def mergeArcs(
    topology: Topology[Objects[Properties]],
    objects: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
  ): MultiPolygon[js.Object] = js.native
  def mesh(topology: Topology[Objects[Properties]]): typingsSlinky.geojson.geojsonMod.MultiLineString = js.native
  def mesh(
    topology: Topology[Objects[Properties]],
    obj: typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject[js.Object]
  ): typingsSlinky.geojson.geojsonMod.MultiLineString = js.native
  def mesh(
    topology: Topology[Objects[Properties]],
    obj: typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject[js.Object],
    filter: js.Function2[
      /* a */ typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject[js.Object], 
      /* b */ typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject[js.Object], 
      Boolean
    ]
  ): typingsSlinky.geojson.geojsonMod.MultiLineString = js.native
  def meshArcs(topology: Topology[Objects[Properties]]): MultiLineString[js.Object] = js.native
  def meshArcs(
    topology: Topology[Objects[Properties]],
    obj: typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject[js.Object]
  ): MultiLineString[js.Object] = js.native
  def meshArcs(
    topology: Topology[Objects[Properties]],
    obj: typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject[js.Object],
    filter: js.Function2[
      /* a */ typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject[js.Object], 
      /* b */ typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject[js.Object], 
      Boolean
    ]
  ): MultiLineString[js.Object] = js.native
  def neighbors(
    objects: js.Array[
      typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject[js.Object]
    ]
  ): js.Array[js.Array[Double]] = js.native
  def quantize[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Double): Topology[T] = js.native
  def quantize[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Transform): Topology[T] = js.native
  def transform(): Transformer = js.native
  def transform(transform: Transform): Transformer = js.native
  def untransform(): Transformer = js.native
  def untransform(transform: Transform): Transformer = js.native
  type Transformer = js.Function2[/* point */ js.Array[Double], /* index */ js.UndefOr[Boolean], js.Array[Double]]
}

