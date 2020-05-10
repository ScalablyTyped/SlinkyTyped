package typingsSlinky.tensorflowTfjsCore.engineMod

import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileInfo extends js.Object {
  var kernels: js.Array[KernelProfile] = js.native
  var newBytes: Double = js.native
  var newTensors: Double = js.native
  var peakBytes: Double = js.native
  var result: TensorContainer = js.native
}

object ProfileInfo {
  @scala.inline
  def apply(
    kernels: js.Array[KernelProfile],
    newBytes: Double,
    newTensors: Double,
    peakBytes: Double,
    result: TensorContainer
  ): ProfileInfo = {
    val __obj = js.Dynamic.literal(kernels = kernels.asInstanceOf[js.Any], newBytes = newBytes.asInstanceOf[js.Any], newTensors = newTensors.asInstanceOf[js.Any], peakBytes = peakBytes.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileInfo]
  }
  @scala.inline
  implicit class ProfileInfoOps[Self <: ProfileInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKernels(value: js.Array[KernelProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewTensors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTensors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeakBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peakBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultInt32Array(value: js.typedarray.Int32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultFloat32Array(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: TensorContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

