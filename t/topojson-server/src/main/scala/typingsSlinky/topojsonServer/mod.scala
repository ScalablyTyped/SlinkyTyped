package typingsSlinky.topojsonServer

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.geojson.mod.GeoJsonObject
import typingsSlinky.topojsonSpecification.mod.Objects
import typingsSlinky.topojsonSpecification.mod.Properties
import typingsSlinky.topojsonSpecification.mod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson-server", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def topology(objects: StringDictionary[GeoJsonObject]): Topology[Objects[Properties]] = js.native
  def topology(objects: StringDictionary[GeoJsonObject], quantization: Double): Topology[Objects[Properties]] = js.native
}

