package typingsSlinky.terraformerArcgis

import typingsSlinky.arcgisRestApi.mod.Geometry
import typingsSlinky.geojson.mod.GeoJSON
import typingsSlinky.geojson.mod.GeometryObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@terraformer/arcgis", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def arcgisToGeoJSON(arcgis: Geometry): GeometryObject = js.native
  def arcgisToGeoJSON(arcgis: Geometry, idAttribute: String): GeometryObject = js.native
  
  def geojsonToArcGIS(geojson: GeoJSON): Geometry = js.native
  def geojsonToArcGIS(geojson: GeoJSON, idAttribute: String): Geometry = js.native
}
