package typingsSlinky.topojsonSpecification.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Topology[T /* <: Objects[Properties] */] extends TopoJSON {
  var arcs: js.Array[Arc] = js.native
  var objects: T = js.native
  var transform: js.UndefOr[Transform] = js.native
  @JSName("type")
  var type_Topology: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Topology = js.native
}

object Topology {
  @scala.inline
  def apply[T](
    arcs: js.Array[Arc],
    objects: T,
    `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Topology
  ): Topology[T] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topology[T]]
  }
  @scala.inline
  implicit class TopologyOps[Self[t] <: Topology[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withArcs(value: js.Array[Arc]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjects(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Topology): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: Transform): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

