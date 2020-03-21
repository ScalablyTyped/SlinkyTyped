package typingsSlinky.topojson.mod

import typingsSlinky.geojson.mod.BBox
import typingsSlinky.topojsonSpecification.mod.Objects
import typingsSlinky.topojsonSpecification.mod.Properties
import typingsSlinky.topojsonSpecification.mod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "bbox")
@js.native
object bbox extends js.Object {
  def apply(topology: Topology[Objects[Properties]]): BBox = js.native
}

