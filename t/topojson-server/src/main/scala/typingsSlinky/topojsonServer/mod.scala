package typingsSlinky.topojsonServer

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.geojson.mod.GeoJsonObject
import typingsSlinky.topojsonSpecification.mod.Objects
import typingsSlinky.topojsonSpecification.mod.Properties
import typingsSlinky.topojsonSpecification.mod.Topology
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("topojson-server", "topology")
  @js.native
  def topology(objects: StringDictionary[GeoJsonObject]): Topology[Objects[Properties]] = js.native
  @JSImport("topojson-server", "topology")
  @js.native
  def topology(objects: StringDictionary[GeoJsonObject], quantization: Double): Topology[Objects[Properties]] = js.native
}
