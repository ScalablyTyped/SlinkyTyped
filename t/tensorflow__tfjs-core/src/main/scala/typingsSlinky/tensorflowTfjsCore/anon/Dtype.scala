package typingsSlinky.tensorflowTfjsCore.anon

import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.uint16
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.uint8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dtype extends js.Object {
  var dtype: uint16 | uint8 = js.native
  var min: Double = js.native
  var scale: Double = js.native
}

object Dtype {
  @scala.inline
  def apply(dtype: uint16 | uint8, min: Double, scale: Double): Dtype = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dtype]
  }
  @scala.inline
  implicit class DtypeOps[Self <: Dtype] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDtype(value: uint16 | uint8): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

