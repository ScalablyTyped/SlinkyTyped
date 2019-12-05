package typingsSlinky.topojson

import typingsSlinky.topojson.topojsonStrings.GeometryCollection
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.MultiPolygon
import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Geometries extends js.Object {
  var geometries: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
  var `type`: GeometryCollection
}

object Anon_Geometries {
  @scala.inline
  def apply(geometries: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]], `type`: GeometryCollection): Anon_Geometries = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Geometries]
  }
}

