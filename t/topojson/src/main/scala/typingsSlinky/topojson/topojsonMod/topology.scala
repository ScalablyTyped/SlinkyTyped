package typingsSlinky.topojson.topojsonMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.geojson.geojsonMod.GeoJsonObject
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Objects
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Properties
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "topology")
@js.native
object topology extends js.Object {
  def apply(objects: StringDictionary[GeoJsonObject]): Topology[Objects[Properties]] = js.native
  def apply(objects: StringDictionary[GeoJsonObject], quantization: Double): Topology[Objects[Properties]] = js.native
}

