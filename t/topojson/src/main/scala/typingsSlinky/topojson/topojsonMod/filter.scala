package typingsSlinky.topojson.topojsonMod

import typingsSlinky.topojsonDashSimplify.topojsonDashSimplifyMod.Filter
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Objects
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.OrNull
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "filter")
@js.native
object filter extends js.Object {
  def apply[K /* <: Objects[js.Object] */](topology: Topology[K], filter: Filter): Topology[OrNull[K]] = js.native
}

