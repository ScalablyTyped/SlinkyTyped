package typingsSlinky.topojson.topojsonMod

import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Objects
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "simplify")
@js.native
object simplify extends js.Object {
  def apply[T /* <: Objects[js.Object] */](topology: Topology[T]): Topology[T] = js.native
  def apply[T /* <: Objects[js.Object] */](topology: Topology[T], minWeight: Double): Topology[T] = js.native
}

