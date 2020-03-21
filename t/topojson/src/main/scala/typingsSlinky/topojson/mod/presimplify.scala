package typingsSlinky.topojson.mod

import typingsSlinky.topojsonSimplify.mod.TriangleWeighter
import typingsSlinky.topojsonSpecification.mod.Objects
import typingsSlinky.topojsonSpecification.mod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "presimplify")
@js.native
object presimplify extends js.Object {
  def apply[T /* <: Objects[js.Object] */](topology: Topology[T]): Topology[T] = js.native
  def apply[T /* <: Objects[js.Object] */](topology: Topology[T], weight: TriangleWeighter): Topology[T] = js.native
}

