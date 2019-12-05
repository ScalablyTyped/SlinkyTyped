package typingsSlinky.topojson.topojsonMod

import typingsSlinky.topojsonDashSimplify.topojsonDashSimplifyMod.Filter
import typingsSlinky.topojsonDashSimplify.topojsonDashSimplifyMod.RingWeighter
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Objects
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Properties
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "filterWeight")
@js.native
object filterWeight extends js.Object {
  def apply(topology: Topology[Objects[Properties]]): Filter = js.native
  def apply(topology: Topology[Objects[Properties]], minWeight: Double): Filter = js.native
  def apply(topology: Topology[Objects[Properties]], minWeight: Double, weight: RingWeighter): Filter = js.native
}

