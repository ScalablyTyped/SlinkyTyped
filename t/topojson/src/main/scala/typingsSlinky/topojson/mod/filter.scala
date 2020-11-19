package typingsSlinky.topojson.mod

import typingsSlinky.topojsonSimplify.mod.Filter_
import typingsSlinky.topojsonSpecification.mod.Objects
import typingsSlinky.topojsonSpecification.mod.OrNull
import typingsSlinky.topojsonSpecification.mod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("topojson", "filter")
@js.native
object filter extends js.Object {
  
  def apply[K /* <: Objects[js.Object] */](topology: Topology[K], filter: Filter_): Topology[OrNull[K]] = js.native
}
