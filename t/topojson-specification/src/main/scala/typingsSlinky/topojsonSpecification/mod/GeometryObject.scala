package typingsSlinky.topojsonSpecification.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.topojsonSpecification.mod.Point[P]
  - typingsSlinky.topojsonSpecification.mod.MultiPoint[P]
  - typingsSlinky.topojsonSpecification.mod.LineString[P]
  - typingsSlinky.topojsonSpecification.mod.MultiLineString[P]
  - typingsSlinky.topojsonSpecification.mod.Polygon[P]
  - typingsSlinky.topojsonSpecification.mod.MultiPolygon[P]
  - typingsSlinky.topojsonSpecification.mod.GeometryCollection[P]
  - typingsSlinky.topojsonSpecification.mod.NullObject
*/
trait GeometryObject[P /* <: Properties */] extends js.Object
object GeometryObject {
  
  @scala.inline
  def Polygon[P /* <: Properties */](
    arcs: js.Array[ArcIndexes],
    `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Polygon
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  
  @scala.inline
  def MultiPoint[P /* <: Properties */](
    coordinates: js.Array[Positions],
    `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiPoint
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  
  @scala.inline
  def NullObject[P /* <: Properties */](`type`: Null): GeometryObject[P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  
  @scala.inline
  def Point[P /* <: Properties */](
    coordinates: Positions,
    `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Point
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  
  @scala.inline
  def MultiLineString[P /* <: Properties */](
    arcs: js.Array[ArcIndexes],
    `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiLineString
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  
  @scala.inline
  def MultiPolygon[P /* <: Properties */](
    arcs: js.Array[js.Array[ArcIndexes]],
    `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiPolygon
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  
  @scala.inline
  def LineString[P /* <: Properties */](
    arcs: ArcIndexes,
    `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.LineString
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  
  @scala.inline
  def GeometryCollection[P /* <: Properties */](
    geometries: js.Array[GeometryObject[P]],
    `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.GeometryCollection
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
}
