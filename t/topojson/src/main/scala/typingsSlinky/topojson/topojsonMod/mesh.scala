package typingsSlinky.topojson.topojsonMod

import typingsSlinky.geojson.geojsonMod.MultiLineString
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Objects
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Properties
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "mesh")
@js.native
object mesh extends js.Object {
  def apply(topology: Topology[Objects[Properties]]): MultiLineString = js.native
  def apply(topology: Topology[Objects[Properties]], obj: GeometryObject[js.Object]): MultiLineString = js.native
  def apply(
    topology: Topology[Objects[Properties]],
    obj: GeometryObject[js.Object],
    filter: js.Function2[/* a */ GeometryObject[js.Object], /* b */ GeometryObject[js.Object], Boolean]
  ): MultiLineString = js.native
}

