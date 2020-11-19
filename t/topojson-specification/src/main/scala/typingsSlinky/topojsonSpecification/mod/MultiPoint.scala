package typingsSlinky.topojsonSpecification.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply[P /* <: Properties */](
    coordinates: js.Array[Positions],
    `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiPoint
  ): MultiPoint[P] = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPoint[P]]
  }
  
  @scala.inline
  implicit class MultiPointOps[Self <: MultiPoint[_], P /* <: Properties */] (val x: Self with MultiPoint[P]) extends AnyVal {
    
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
    def setCoordinatesVarargs(value: Positions*): Self = this.set("coordinates", js.Array(value :_*))
    
    @scala.inline
    def setCoordinates(value: js.Array[Positions]): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiPoint): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
