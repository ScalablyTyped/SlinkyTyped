package typingsSlinky.topojson.mod

import typingsSlinky.topojsonSpecification.mod.Objects
import typingsSlinky.topojsonSpecification.mod.Topology
import typingsSlinky.topojsonSpecification.mod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "quantize")
@js.native
object quantize extends js.Object {
  def apply[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Double): Topology[T] = js.native
  def apply[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Transform): Topology[T] = js.native
}

