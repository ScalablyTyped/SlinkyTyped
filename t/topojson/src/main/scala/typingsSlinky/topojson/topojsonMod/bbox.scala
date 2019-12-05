package typingsSlinky.topojson.topojsonMod

import typingsSlinky.geojson.geojsonMod.BBox
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Objects
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Properties
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "bbox")
@js.native
object bbox extends js.Object {
  def apply(topology: Topology[Objects[Properties]]): BBox = js.native
}

