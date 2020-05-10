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

@js.native
trait UsAtlas extends Topology[Objects[Properties]] {
  @JSName("bbox")
  var bbox_UsAtlas: js.Tuple4[Double, Double, Double, Double] = js.native
  @JSName("objects")
  var objects_UsAtlas: AnonCounties = js.native
  @JSName("transform")
  var transform_UsAtlas: Transform = js.native
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
  @scala.inline
  implicit class UsAtlasOps[Self <: UsAtlas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBbox(value: js.Tuple4[Double, Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjects(value: AnonCounties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: Transform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

