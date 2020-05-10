package typingsSlinky.topojsonSpecification.mod

import typingsSlinky.geojson.mod.BBox
import typingsSlinky.geojson.mod.GeoJsonGeometryTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopoJSON extends js.Object {
  var bbox: js.UndefOr[BBox] = js.native
  var `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Topology | GeoJsonGeometryTypes | Null = js.native
}

object TopoJSON {
  @scala.inline
  def apply(): TopoJSON = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopoJSON]
  }
  @scala.inline
  implicit class TopoJSONOps[Self <: TopoJSON] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBbox(value: BBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Topology | GeoJsonGeometryTypes
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(null)
        ret
    }
  }
  
}

