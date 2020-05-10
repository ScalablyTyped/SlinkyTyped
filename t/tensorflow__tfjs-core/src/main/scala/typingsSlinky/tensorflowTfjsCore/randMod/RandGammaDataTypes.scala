package typingsSlinky.tensorflowTfjsCore.randMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandGammaDataTypes extends js.Object {
  var float32: js.typedarray.Float32Array = js.native
  var int32: js.typedarray.Int32Array = js.native
}

object RandGammaDataTypes {
  @scala.inline
  def apply(float32: js.typedarray.Float32Array, int32: js.typedarray.Int32Array): RandGammaDataTypes = {
    val __obj = js.Dynamic.literal(float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandGammaDataTypes]
  }
  @scala.inline
  implicit class RandGammaDataTypesOps[Self <: RandGammaDataTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFloat32(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInt32(value: js.typedarray.Int32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int32")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

