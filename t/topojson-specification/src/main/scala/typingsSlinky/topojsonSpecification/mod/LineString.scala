package typingsSlinky.topojsonSpecification.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineString[P /* <: Properties */]
  extends GeometryObjectA[P]
     with GeometryObject[P] {
  
  var arcs: ArcIndexes = js.native
  
  @JSName("type")
  var type_LineString: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.LineString = js.native
}
object LineString {
  
  @scala.inline
  def apply[P /* <: Properties */](
    arcs: ArcIndexes,
    `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.LineString
  ): LineString[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineString[P]]
  }
  
  @scala.inline
  implicit class LineStringOps[Self <: LineString[_], P /* <: Properties */] (val x: Self with LineString[P]) extends AnyVal {
    
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
    def setArcsVarargs(value: Double*): Self = this.set("arcs", js.Array(value :_*))
    
    @scala.inline
    def setArcs(value: ArcIndexes): Self = this.set("arcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.LineString): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
