package typingsSlinky.topojson.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.geojson.mod.GeoJsonObject
import typingsSlinky.topojsonSpecification.mod.Objects
import typingsSlinky.topojsonSpecification.mod.Properties
import typingsSlinky.topojsonSpecification.mod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("topojson", "topology")
@js.native
object topology extends js.Object {
  
  def apply(objects: StringDictionary[GeoJsonObject]): Topology[Objects[Properties]] = js.native
  def apply(objects: StringDictionary[GeoJsonObject], quantization: Double): Topology[Objects[Properties]] = js.native
}
