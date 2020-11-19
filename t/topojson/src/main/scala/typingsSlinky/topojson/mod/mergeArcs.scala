package typingsSlinky.topojson.mod

import typingsSlinky.topojsonSpecification.mod.MultiPolygon
import typingsSlinky.topojsonSpecification.mod.Objects
import typingsSlinky.topojsonSpecification.mod.Polygon
import typingsSlinky.topojsonSpecification.mod.Properties
import typingsSlinky.topojsonSpecification.mod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("topojson", "mergeArcs")
@js.native
object mergeArcs extends js.Object {
  
  def apply(
    topology: Topology[Objects[Properties]],
    objects: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
  ): MultiPolygon[js.Object] = js.native
}
