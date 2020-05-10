package typingsSlinky.topojsonSpecification.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiPoint[P /* <: Properties */]
  extends GeometryObjectA[P]
     with GeometryObject[P] {
  var coordinates: js.Array[Positions] = js.native
  @JSName("type")
  var type_MultiPoint: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiPoint = js.native
}

object MultiPoint {
  @scala.inline
  def apply[P](
    coordinates: js.Array[Positions],
    `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiPoint
  ): MultiPoint[P] = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPoint[P]]
  }
  @scala.inline
  implicit class MultiPointOps[Self[p] <: MultiPoint[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withCoordinates(value: js.Array[Positions]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiPoint): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

