package typingsSlinky.topojson.mod

import typingsSlinky.topojsonSpecification.mod.GeometryObject
import typingsSlinky.topojsonSpecification.mod.MultiLineString
import typingsSlinky.topojsonSpecification.mod.Objects
import typingsSlinky.topojsonSpecification.mod.Properties
import typingsSlinky.topojsonSpecification.mod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("topojson", "meshArcs")
@js.native
object meshArcs extends js.Object {
  
  def apply(topology: Topology[Objects[Properties]]): MultiLineString[js.Object] = js.native
  def apply(
    topology: Topology[Objects[Properties]],
    obj: js.UndefOr[scala.Nothing],
    filter: js.Function2[/* a */ GeometryObject[js.Object], /* b */ GeometryObject[js.Object], Boolean]
  ): MultiLineString[js.Object] = js.native
  def apply(topology: Topology[Objects[Properties]], obj: GeometryObject[js.Object]): MultiLineString[js.Object] = js.native
  def apply(
    topology: Topology[Objects[Properties]],
    obj: GeometryObject[js.Object],
    filter: js.Function2[/* a */ GeometryObject[js.Object], /* b */ GeometryObject[js.Object], Boolean]
  ): MultiLineString[js.Object] = js.native
}
