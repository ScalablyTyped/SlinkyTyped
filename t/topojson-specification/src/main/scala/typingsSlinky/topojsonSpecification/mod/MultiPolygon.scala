package typingsSlinky.topojsonSpecification.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiPolygon[P /* <: Properties */]
  extends GeometryObjectA[P]
     with GeometryObject[P] {
  var arcs: js.Array[js.Array[ArcIndexes]] = js.native
  @JSName("type")
  var type_MultiPolygon: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiPolygon = js.native
}

object MultiPolygon {
  @scala.inline
  def apply[P](
    arcs: js.Array[js.Array[ArcIndexes]],
    `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiPolygon
  ): MultiPolygon[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPolygon[P]]
  }
  @scala.inline
  implicit class MultiPolygonOps[Self[p] <: MultiPolygon[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withArcs(value: js.Array[js.Array[ArcIndexes]]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiPolygon): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

