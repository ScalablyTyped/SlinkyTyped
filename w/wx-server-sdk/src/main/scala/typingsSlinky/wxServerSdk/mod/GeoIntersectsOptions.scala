package typingsSlinky.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoIntersectsOptions extends js.Object {
  var geometry: Point | LineString | MultiPoint | MultiLineString | Polygon | MultiPolygon = js.native
}

object GeoIntersectsOptions {
  @scala.inline
  def apply(geometry: Point | LineString | MultiPoint | MultiLineString | Polygon | MultiPolygon): GeoIntersectsOptions = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoIntersectsOptions]
  }
  @scala.inline
  implicit class GeoIntersectsOptionsOps[Self <: GeoIntersectsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeometry(value: Point | LineString | MultiPoint | MultiLineString | Polygon | MultiPolygon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

