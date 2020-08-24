package typingsSlinky.topojsonSpecification.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Point[P /* <: Properties */]
  extends GeometryObjectA[P]
     with GeometryObject[P] {
  var coordinates: Positions = js.native
  @JSName("type")
  var type_Point: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Point = js.native
}

object Point {
  @scala.inline
  def apply[/* <: typingsSlinky.topojsonSpecification.mod.Properties */ P](
    coordinates: Positions,
    `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Point
  ): Point[P] = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point[P]]
  }
  @scala.inline
  implicit class PointOps[Self <: Point[_], /* <: typingsSlinky.topojsonSpecification.mod.Properties */ P] (val x: Self with Point[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCoordinatesVarargs(value: Double*): Self = this.set("coordinates", js.Array(value :_*))
    @scala.inline
    def setCoordinates(value: Positions): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Point): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

