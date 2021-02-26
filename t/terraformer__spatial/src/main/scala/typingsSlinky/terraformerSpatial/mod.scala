package typingsSlinky.terraformerSpatial

import typingsSlinky.geojson.mod.BBox
import typingsSlinky.geojson.mod.Feature
import typingsSlinky.geojson.mod.FeatureCollection
import typingsSlinky.geojson.mod.GeoJSON
import typingsSlinky.geojson.mod.GeoJsonProperties
import typingsSlinky.geojson.mod.Geometry
import typingsSlinky.geojson.mod.GeometryCollection
import typingsSlinky.geojson.mod.LineString
import typingsSlinky.geojson.mod.MultiLineString
import typingsSlinky.geojson.mod.MultiPoint
import typingsSlinky.geojson.mod.MultiPolygon
import typingsSlinky.geojson.mod.Point
import typingsSlinky.geojson.mod.Polygon
import typingsSlinky.geojson.mod.Position
import typingsSlinky.terraformerSpatial.anon.H
import typingsSlinky.terraformerSpatial.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object GeographicCRS {
    
    @JSImport("@terraformer/spatial", "GeographicCRS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@terraformer/spatial", "GeographicCRS.properties")
    @js.native
    def properties: Href = js.native
    @scala.inline
    def properties_=(x: Href): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("properties")(x.asInstanceOf[js.Any])
    
    @JSImport("@terraformer/spatial", "GeographicCRS.type")
    @js.native
    val `type`: String = js.native
  }
  
  object MercatorCRS {
    
    @JSImport("@terraformer/spatial", "MercatorCRS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@terraformer/spatial", "MercatorCRS.properties")
    @js.native
    def properties: Href = js.native
    @scala.inline
    def properties_=(x: Href): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("properties")(x.asInstanceOf[js.Any])
    
    @JSImport("@terraformer/spatial", "MercatorCRS.type")
    @js.native
    val `type`: String = js.native
  }
  
  @JSImport("@terraformer/spatial", "calculateBounds")
  @js.native
  def calculateBounds(geojson: GeoJSON): BBox = js.native
  
  @JSImport("@terraformer/spatial", "calculateEnvelope")
  @js.native
  def calculateEnvelope(geojson: GeoJSON): H = js.native
  
  @JSImport("@terraformer/spatial", "contains")
  @js.native
  def contains(geojson: GeoJSON, comparisonGeojson: GeoJSON): Boolean = js.native
  
  @JSImport("@terraformer/spatial", "convexHull")
  @js.native
  def convexHull(geojson: GeoJSON): Polygon = js.native
  
  @JSImport("@terraformer/spatial", "intersects")
  @js.native
  def intersects(geojson: GeoJSON, comparisonGeojson: GeoJSON): Boolean = js.native
  
  @JSImport("@terraformer/spatial", "isConvex")
  @js.native
  def isConvex(geojson: GeoJSON): Boolean = js.native
  
  @JSImport("@terraformer/spatial", "polygonContainsPoint")
  @js.native
  def polygonContainsPoint(polygon: js.Array[js.Array[Position]], point: Position): Boolean = js.native
  
  @JSImport("@terraformer/spatial", "positionToGeographic")
  @js.native
  def positionToGeographic(position: Position): Position = js.native
  
  @JSImport("@terraformer/spatial", "positionToMercator")
  @js.native
  def positionToMercator(position: Position): Position = js.native
  
  @JSImport("@terraformer/spatial", "toCircle")
  @js.native
  def toCircle(center: Position, radius: Double): Feature[Polygon, GeoJsonProperties] = js.native
  @JSImport("@terraformer/spatial", "toCircle")
  @js.native
  def toCircle(center: Position, radius: Double, interpolate: Double): Feature[Polygon, GeoJsonProperties] = js.native
  
  @JSImport("@terraformer/spatial", "toGeographic")
  @js.native
  def toGeographic(geojson: Feature[Geometry, GeoJsonProperties]): Feature[Geometry, GeoJsonProperties] = js.native
  @JSImport("@terraformer/spatial", "toGeographic")
  @js.native
  def toGeographic(geojson: FeatureCollection[Geometry, GeoJsonProperties]): FeatureCollection[Geometry, GeoJsonProperties] = js.native
  @JSImport("@terraformer/spatial", "toGeographic")
  @js.native
  def toGeographic(geojson: GeometryCollection): GeometryCollection = js.native
  @JSImport("@terraformer/spatial", "toGeographic")
  @js.native
  def toGeographic(geojson: LineString): LineString = js.native
  @JSImport("@terraformer/spatial", "toGeographic")
  @js.native
  def toGeographic(geojson: MultiLineString): MultiLineString = js.native
  @JSImport("@terraformer/spatial", "toGeographic")
  @js.native
  def toGeographic(geojson: MultiPoint): MultiPoint = js.native
  @JSImport("@terraformer/spatial", "toGeographic")
  @js.native
  def toGeographic(geojson: MultiPolygon): MultiPolygon = js.native
  @JSImport("@terraformer/spatial", "toGeographic")
  @js.native
  def toGeographic(geojson: Point): Point = js.native
  @JSImport("@terraformer/spatial", "toGeographic")
  @js.native
  def toGeographic(geojson: Polygon): Polygon = js.native
  
  @JSImport("@terraformer/spatial", "toMercator")
  @js.native
  def toMercator(geojson: Feature[Geometry, GeoJsonProperties]): Feature[Geometry, GeoJsonProperties] = js.native
  @JSImport("@terraformer/spatial", "toMercator")
  @js.native
  def toMercator(geojson: FeatureCollection[Geometry, GeoJsonProperties]): FeatureCollection[Geometry, GeoJsonProperties] = js.native
  @JSImport("@terraformer/spatial", "toMercator")
  @js.native
  def toMercator(geojson: GeometryCollection): GeometryCollection = js.native
  @JSImport("@terraformer/spatial", "toMercator")
  @js.native
  def toMercator(geojson: LineString): LineString = js.native
  @JSImport("@terraformer/spatial", "toMercator")
  @js.native
  def toMercator(geojson: MultiLineString): MultiLineString = js.native
  @JSImport("@terraformer/spatial", "toMercator")
  @js.native
  def toMercator(geojson: MultiPoint): MultiPoint = js.native
  @JSImport("@terraformer/spatial", "toMercator")
  @js.native
  def toMercator(geojson: MultiPolygon): MultiPolygon = js.native
  @JSImport("@terraformer/spatial", "toMercator")
  @js.native
  def toMercator(geojson: Point): Point = js.native
  @JSImport("@terraformer/spatial", "toMercator")
  @js.native
  def toMercator(geojson: Polygon): Polygon = js.native
  
  @JSImport("@terraformer/spatial", "within")
  @js.native
  def within(geojson: GeoJSON, comparisonGeojson: GeoJSON): Boolean = js.native
}
