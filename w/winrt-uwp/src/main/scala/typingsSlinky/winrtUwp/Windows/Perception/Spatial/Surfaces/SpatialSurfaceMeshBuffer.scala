package typingsSlinky.winrtUwp.Windows.Perception.Spatial.Surfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialSurfaceMeshBuffer extends js.Object {
  var data: js.Any = js.native
   /* unmapped type */ var elementCount: js.Any = js.native
   /* unmapped type */ var format: js.Any = js.native
   /* unmapped type */ var stride: js.Any = js.native
}

object SpatialSurfaceMeshBuffer {
  @scala.inline
  def apply(data: js.Any, elementCount: js.Any, format: js.Any, stride: js.Any): SpatialSurfaceMeshBuffer = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], elementCount = elementCount.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], stride = stride.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialSurfaceMeshBuffer]
  }
  @scala.inline
  implicit class SpatialSurfaceMeshBufferOps[Self <: SpatialSurfaceMeshBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementCount(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStride(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stride")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

