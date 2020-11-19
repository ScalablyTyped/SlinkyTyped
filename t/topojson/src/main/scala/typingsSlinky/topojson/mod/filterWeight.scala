package typingsSlinky.topojson.mod

import typingsSlinky.topojsonSimplify.mod.Filter_
import typingsSlinky.topojsonSimplify.mod.RingWeighter
import typingsSlinky.topojsonSpecification.mod.Objects
import typingsSlinky.topojsonSpecification.mod.Properties
import typingsSlinky.topojsonSpecification.mod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("topojson", "filterWeight")
@js.native
object filterWeight extends js.Object {
  
  def apply(topology: Topology[Objects[Properties]]): Filter_ = js.native
  def apply(
    topology: Topology[Objects[Properties]],
    minWeight: js.UndefOr[scala.Nothing],
    weight: RingWeighter
  ): Filter_ = js.native
  def apply(topology: Topology[Objects[Properties]], minWeight: Double): Filter_ = js.native
  def apply(topology: Topology[Objects[Properties]], minWeight: Double, weight: RingWeighter): Filter_ = js.native
}
