package typingsSlinky.topojson.topojsonMod

import typingsSlinky.topojson.Anon_Countries
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Arc
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Objects
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Properties
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Topology
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorldAtlas extends Topology[Objects[Properties]] {
  @JSName("bbox")
  var bbox_WorldAtlas: js.Tuple4[Double, Double, Double, Double]
  @JSName("objects")
  var objects_WorldAtlas: Anon_Countries
  @JSName("transform")
  var transform_WorldAtlas: Transform
}

object WorldAtlas {
  @scala.inline
  def apply(
    arcs: js.Array[Arc],
    bbox: js.Tuple4[Double, Double, Double, Double],
    objects: Anon_Countries,
    transform: Transform,
    `type`: typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationStrings.Topology
  ): WorldAtlas = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorldAtlas]
  }
}

