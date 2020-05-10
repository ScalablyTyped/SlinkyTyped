package typingsSlinky.topojsonSpecification.mod

import typingsSlinky.geojson.mod.GeoJsonGeometryTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeometryObjectA[P /* <: Properties */] extends TopoJSON {
  var id: js.UndefOr[Double | String] = js.native
  var properties: js.UndefOr[P] = js.native
  @JSName("type")
  var type_GeometryObjectA: GeoJsonGeometryTypes | Null = js.native
}

object GeometryObjectA {
  @scala.inline
  def apply[P](): GeometryObjectA[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeometryObjectA[P]]
  }
  @scala.inline
  implicit class GeometryObjectAOps[Self[p] <: GeometryObjectA[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withId(value: Double | String): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: P): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: GeoJsonGeometryTypes): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeNull: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(null)
        ret
    }
  }
  
}

