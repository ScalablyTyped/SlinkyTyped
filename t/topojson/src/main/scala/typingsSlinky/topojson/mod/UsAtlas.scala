package typingsSlinky.topojson.mod

import typingsSlinky.topojson.AnonCounties
import typingsSlinky.topojsonSpecification.mod.Arc
import typingsSlinky.topojsonSpecification.mod.Objects
import typingsSlinky.topojsonSpecification.mod.Properties
import typingsSlinky.topojsonSpecification.mod.Topology
import typingsSlinky.topojsonSpecification.mod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsAtlas extends Topology[Objects[Properties]] {
  @JSName("bbox")
  var bbox_UsAtlas: js.Tuple4[Double, Double, Double, Double]
  @JSName("objects")
  var objects_UsAtlas: AnonCounties
  @JSName("transform")
  var transform_UsAtlas: Transform
}

object UsAtlas {
  @scala.inline
  def apply(
    arcs: js.Array[Arc],
    bbox: js.Tuple4[Double, Double, Double, Double],
    objects: AnonCounties,
    transform: Transform,
    `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Topology
  ): UsAtlas = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsAtlas]
  }
}

