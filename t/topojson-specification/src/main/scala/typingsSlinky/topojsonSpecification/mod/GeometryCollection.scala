package typingsSlinky.topojsonSpecification.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeometryCollection[P /* <: Properties */]
  extends GeometryObjectA[P]
     with GeometryObject[P] {
  var geometries: js.Array[GeometryObject[P]] = js.native
  @JSName("type")
  var type_GeometryCollection: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.GeometryCollection = js.native
}

object GeometryCollection {
  @scala.inline
  def apply[P](
    geometries: js.Array[GeometryObject[P]],
    `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.GeometryCollection
  ): GeometryCollection[P] = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryCollection[P]]
  }
  @scala.inline
  implicit class GeometryCollectionOps[Self[p] <: GeometryCollection[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withGeometries(value: js.Array[GeometryObject[P]]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.GeometryCollection): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

