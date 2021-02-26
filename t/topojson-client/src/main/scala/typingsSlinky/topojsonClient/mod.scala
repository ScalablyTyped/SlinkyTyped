package typingsSlinky.topojsonClient

import typingsSlinky.geojson.mod.BBox
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
import typingsSlinky.topojsonSpecification.mod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("topojson-client", "bbox")
  @js.native
  def bbox(topology: Topology[Objects[Properties]]): BBox = js.native
  
  @JSImport("topojson-client", "feature")
  @js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: GeometryCollection[P]): FeatureCollection[GeometryObject, P] = js.native
  @JSImport("topojson-client", "feature")
  @js.native
  def feature[P](
    topology: Topology[Objects[Properties]],
    `object`: typingsSlinky.topojsonSpecification.mod.GeometryObject[P]
  ): (Feature[GeometryObject, P]) | (FeatureCollection[GeometryObject, P]) = js.native
  @JSImport("topojson-client", "feature")
  @js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: LineString[P]): Feature[typingsSlinky.geojson.mod.LineString, P] = js.native
  @JSImport("topojson-client", "feature")
  @js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: MultiLineString[P]): Feature[typingsSlinky.geojson.mod.MultiLineString, P] = js.native
  @JSImport("topojson-client", "feature")
  @js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: MultiPoint[P]): Feature[typingsSlinky.geojson.mod.MultiPoint, P] = js.native
  @JSImport("topojson-client", "feature")
  @js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: MultiPolygon[P]): Feature[typingsSlinky.geojson.mod.MultiPolygon, P] = js.native
  @JSImport("topojson-client", "feature")
  @js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: Point[P]): Feature[typingsSlinky.geojson.mod.Point, P] = js.native
  @JSImport("topojson-client", "feature")
  @js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: Polygon[P]): Feature[typingsSlinky.geojson.mod.Polygon, P] = js.native
  
  @JSImport("topojson-client", "merge")
  @js.native
  def merge(
    topology: Topology[Objects[Properties]],
    objects: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
  ): typingsSlinky.geojson.mod.MultiPolygon = js.native
  
  @JSImport("topojson-client", "mergeArcs")
  @js.native
  def mergeArcs(
    topology: Topology[Objects[Properties]],
    objects: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
  ): MultiPolygon[js.Object] = js.native
  
  @JSImport("topojson-client", "mesh")
  @js.native
  def mesh(topology: Topology[Objects[Properties]]): typingsSlinky.geojson.mod.MultiLineString = js.native
  @JSImport("topojson-client", "mesh")
  @js.native
  def mesh(
    topology: Topology[Objects[Properties]],
    obj: js.UndefOr[scala.Nothing],
    filter: js.Function2[
      /* a */ typingsSlinky.topojsonSpecification.mod.GeometryObject[js.Object], 
      /* b */ typingsSlinky.topojsonSpecification.mod.GeometryObject[js.Object], 
      Boolean
    ]
  ): typingsSlinky.geojson.mod.MultiLineString = js.native
  @JSImport("topojson-client", "mesh")
  @js.native
  def mesh(
    topology: Topology[Objects[Properties]],
    obj: typingsSlinky.topojsonSpecification.mod.GeometryObject[js.Object]
  ): typingsSlinky.geojson.mod.MultiLineString = js.native
  @JSImport("topojson-client", "mesh")
  @js.native
  def mesh(
    topology: Topology[Objects[Properties]],
    obj: typingsSlinky.topojsonSpecification.mod.GeometryObject[js.Object],
    filter: js.Function2[
      /* a */ typingsSlinky.topojsonSpecification.mod.GeometryObject[js.Object], 
      /* b */ typingsSlinky.topojsonSpecification.mod.GeometryObject[js.Object], 
      Boolean
    ]
  ): typingsSlinky.geojson.mod.MultiLineString = js.native
  
  @JSImport("topojson-client", "meshArcs")
  @js.native
  def meshArcs(topology: Topology[Objects[Properties]]): MultiLineString[js.Object] = js.native
  @JSImport("topojson-client", "meshArcs")
  @js.native
  def meshArcs(
    topology: Topology[Objects[Properties]],
    obj: js.UndefOr[scala.Nothing],
    filter: js.Function2[
      /* a */ typingsSlinky.topojsonSpecification.mod.GeometryObject[js.Object], 
      /* b */ typingsSlinky.topojsonSpecification.mod.GeometryObject[js.Object], 
      Boolean
    ]
  ): MultiLineString[js.Object] = js.native
  @JSImport("topojson-client", "meshArcs")
  @js.native
  def meshArcs(
    topology: Topology[Objects[Properties]],
    obj: typingsSlinky.topojsonSpecification.mod.GeometryObject[js.Object]
  ): MultiLineString[js.Object] = js.native
  @JSImport("topojson-client", "meshArcs")
  @js.native
  def meshArcs(
    topology: Topology[Objects[Properties]],
    obj: typingsSlinky.topojsonSpecification.mod.GeometryObject[js.Object],
    filter: js.Function2[
      /* a */ typingsSlinky.topojsonSpecification.mod.GeometryObject[js.Object], 
      /* b */ typingsSlinky.topojsonSpecification.mod.GeometryObject[js.Object], 
      Boolean
    ]
  ): MultiLineString[js.Object] = js.native
  
  @JSImport("topojson-client", "neighbors")
  @js.native
  def neighbors(objects: js.Array[typingsSlinky.topojsonSpecification.mod.GeometryObject[js.Object]]): js.Array[js.Array[Double]] = js.native
  
  @JSImport("topojson-client", "quantize")
  @js.native
  def quantize[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Double): Topology[T] = js.native
  @JSImport("topojson-client", "quantize")
  @js.native
  def quantize[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Transform): Topology[T] = js.native
  
  @JSImport("topojson-client", "transform")
  @js.native
  def transform(): Transformer = js.native
  @JSImport("topojson-client", "transform")
  @js.native
  def transform(transform: Transform): Transformer = js.native
  
  @JSImport("topojson-client", "untransform")
  @js.native
  def untransform(): Transformer = js.native
  @JSImport("topojson-client", "untransform")
  @js.native
  def untransform(transform: Transform): Transformer = js.native
  
  type Transformer = js.Function2[/* point */ js.Array[Double], /* index */ js.UndefOr[Boolean], js.Array[Double]]
}
