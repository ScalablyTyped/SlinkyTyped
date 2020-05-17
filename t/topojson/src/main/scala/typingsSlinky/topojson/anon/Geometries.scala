package typingsSlinky.topojson.anon

import typingsSlinky.topojson.topojsonStrings.GeometryCollection
import typingsSlinky.topojsonSpecification.mod.MultiPolygon
import typingsSlinky.topojsonSpecification.mod.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geometries extends js.Object {
  var geometries: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]] = js.native
  var `type`: GeometryCollection = js.native
}

object Geometries {
  @scala.inline
  def apply(geometries: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]], `type`: GeometryCollection): Geometries = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometries]
  }
  @scala.inline
  implicit class GeometriesOps[Self <: Geometries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeometries(value: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: GeometryCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

