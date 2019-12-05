package typingsSlinky.topojson.topojsonMod

import typingsSlinky.topojsonDashSimplify.topojsonDashSimplifyMod.TriangleWeighter
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Objects
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "presimplify")
@js.native
object presimplify extends js.Object {
  def apply[T /* <: Objects[js.Object] */](topology: Topology[T]): Topology[T] = js.native
  def apply[T /* <: Objects[js.Object] */](topology: Topology[T], weight: TriangleWeighter): Topology[T] = js.native
}

