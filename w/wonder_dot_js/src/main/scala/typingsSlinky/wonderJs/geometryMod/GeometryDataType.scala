package typingsSlinky.wonderJs.geometryMod

import typingsSlinky.wonderJs.face3Mod.Face3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeometryDataType extends js.Object {
  var faces: js.UndefOr[js.Array[Face3]] = js.native
  var vertices: js.Array[Double] = js.native
}

object GeometryDataType {
  @scala.inline
  def apply(vertices: js.Array[Double]): GeometryDataType = {
    val __obj = js.Dynamic.literal(vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryDataType]
  }
  @scala.inline
  implicit class GeometryDataTypeOps[Self <: GeometryDataType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVertices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFaces(value: js.Array[Face3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faces")(js.undefined)
        ret
    }
  }
  
}

